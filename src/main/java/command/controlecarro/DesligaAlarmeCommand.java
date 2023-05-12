/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command.controlecarro;

/**
 *
 * @author kagho
 */
public class DesligaAlarmeCommand implements ICommand{

    private Alarme alarme;

    public DesligaAlarmeCommand(Alarme alarme) {
        this.alarme = alarme;
    }
    
    @Override
    public void execute() {
        alarme.desativar();
    }

    @Override
    public void undo() {
        alarme.ativar();
    }
    
}
