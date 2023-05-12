/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.padroesgof.iteratorsupermercado.DepoisIterator;

import java.util.ArrayList;

/**
 *
 * @author rubia
 */
public class Main {
    public static void main(String[] args) {
        //Uso do padrão GoF Iterator para percorrer
        //os produtos de conjuntos implementados de forma diferente
        Relatorio relatorio = new Relatorio();
        relatorio.imprimeProdutos(new ProdutosSupermercado().createIterator(), 
                "PRODUTOS SUPERMERCADO");
        relatorio.imprimeProdutos(new ProdutosCafeteria().createIterator(), 
                "PRODUTOS CAFETERIA");
        System.out.println("\nPadrao GoF Composite");
        relatorio.imprimeSetoresSupermercado(new ProdutosSupermercado().createIterator());
    }
}
