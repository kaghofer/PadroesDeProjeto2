/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facedeadvogado;

/**
 *
 * @author kagho
 */
public class JusticaCivil implements IJustica{

    @Override
    public Processo getProcesso() {
        Processo processo = new ProcessoCivil();
        return processo;
    }

    
    
}
