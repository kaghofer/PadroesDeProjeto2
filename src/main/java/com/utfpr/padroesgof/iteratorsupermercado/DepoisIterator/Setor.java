/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utfpr.padroesgof.iteratorsupermercado.DepoisIterator;

import java.util.ArrayList;

/**
 *
 * @author kagho
 */
public class Setor extends ComponentesSetor {

    ArrayList<ComponentesSetor> component = new ArrayList<>();

    String descricao;

    public Setor(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<ComponentesSetor> getComponent() {
        return component;
    }

    public void setComponent(ArrayList<ComponentesSetor> component) {
        this.component = component;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void add(ComponentesSetor componentesSetor) {
        component.add(componentesSetor);
    }

    @Override
    public void remove(ComponentesSetor compnentesSetor) {
        component.remove(compnentesSetor);
    }

    @Override
    public ComponentesSetor getChild(int id) {
        return (ComponentesSetor) component.get(id);
    }

    @Override
    public void print(String ident) {
        System.out.println(ident + getDescricao());
        ident += "-";
        for (ComponentesSetor componentesSetor : component) {
            componentesSetor.print(ident);
        }
    }

}
