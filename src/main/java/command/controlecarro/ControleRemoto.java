/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command.controlecarro;

/**
 *
 * @author kagho
 */
public class ControleRemoto {

    //prevendo possivel expancao ao realizar exercicio
    private static final int BOTOES = 3;
    private final ICommand[] onCommands;
    private final ICommand[] offCommands;
    private ICommand undoCommand;

    public ControleRemoto() {
        this.onCommands = new ICommand[BOTOES];
        this.offCommands = new ICommand[BOTOES];
        this.undoCommand = undoCommand;

        for (int i = 0; i < BOTOES; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int botao, ICommand onCommand, ICommand offCommand) {
        onCommands[botao] = onCommand;
        offCommands[botao] = offCommand;

    }

    public void ligar(int botao) {
        onCommands[botao].execute();
        undoCommand = onCommands[botao];
    }

    public void desligar(int botao) {
        offCommands[botao].execute();
        undoCommand = offCommands[botao];
    }

    public void undo() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n---Controle Remoto---\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[botao ");
            stringBuilder.append(i);
            stringBuilder.append(onCommands[i].getClass().getName());
            stringBuilder.append("\t");
            stringBuilder.append(offCommands[i].getClass().getName());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
