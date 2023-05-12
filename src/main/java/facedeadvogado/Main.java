/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facedeadvogado;

/**
 *
 * @author kagho
 */
public class Main {
    public static void main(String[] args) {
        
        AdvogadoFacade advogado = new AdvogadoFacade();
        
        Processo p1 = new AdvogadoFacade().getProcesso(1);
        
        System.out.println(p1.getDescricao());
        
        
    }
}
