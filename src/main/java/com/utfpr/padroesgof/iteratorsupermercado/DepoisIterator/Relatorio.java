/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.padroesgof.iteratorsupermercado.DepoisIterator;

/**
 *
 * @author rubia
 */
public class Relatorio {
    
    public void imprimeProdutos(Iterator iterator, String descricao) {
        System.out.println("====" + descricao + "====");
        while (iterator.hasNext()) {
            Produto produto = (Produto) iterator.next();
            System.out.println(produto.getDescricao() + ": "
                    + produto.getPreco());
        }
    }
    
    public void imprimeSetoresSupermercado(Iterator iterator) {
        ComponentesSetor setores = new Setor("SETORES SUPERMERCADO");
        ComponentesSetor frutas = new Setor("FRUTAS");
        ComponentesSetor verduras = new Setor("VERDURAS");
        ComponentesSetor organicas = new Setor("ORGANICAS");
        
        while (iterator.hasNext()) {
            Produto produto = (Produto) iterator.next();
            if ("Frutas".equals(produto.getSetor())) {
                frutas.add(produto);
            } else if ("Verduras".equals(produto.getSetor())) {
                verduras.add(produto);
            } else if ("Organicas".equals(produto.getSetor())) {
                organicas.add(produto);
            } else {
                setores.add(produto);
            }
        }
        
        setores.add(frutas);
        setores.add(verduras);
        setores.add(organicas);
        setores.print("-");
        
    }
}
