/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command.controlecarro;

/**
 *
 * @author kagho
 */
public class LigaAlarmeCommand implements ICommand{

    Alarme alarme;

    public LigaAlarmeCommand(Alarme alarme) {
        this.alarme = alarme;
    }
    
    @Override
    public void execute() {
        alarme.ativar();
    }

    @Override
    public void undo() {
        alarme.desativar();
    }
    
}
