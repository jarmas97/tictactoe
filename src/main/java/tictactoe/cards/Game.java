package tictactoe.cards;

import tictactoe.JPanelManager;
import tictactoe.PLAYERS;
import tictactoe.components.ImageJLabel;
import tictactoe.components.SymbolJButton;
import tictactoe.components.TextJLabel;

public class Game {

    private JPanelManager jPanelManager;
    private TextJLabel label = new TextJLabel("PLAYER:");
    private ImageJLabel gridImage = new ImageJLabel("png/grid.png");
    private SymbolJButton field0 = new SymbolJButton(100,50,100,100, this);
    private SymbolJButton field1 = new SymbolJButton(200,50,100,100, this);
    private SymbolJButton field2 = new SymbolJButton(300,50,100,100, this);
    private SymbolJButton field3 = new SymbolJButton(100,150,100,100, this);
    private SymbolJButton field4 = new SymbolJButton(200,150,100,100, this);
    private SymbolJButton field5 = new SymbolJButton(300,150,100,100, this);
    private SymbolJButton field6 = new SymbolJButton(100,250,100,100, this);
    private SymbolJButton field7 = new SymbolJButton(200,250,100,100, this);
    private SymbolJButton field8 = new SymbolJButton(300,250,100,100, this);
    private boolean isGameOver = false;
    private PLAYERS winner = PLAYERS.NONE;
    private PLAYERS currentPlayer = PLAYERS.X;

    public Game(JPanelManager jPanelManager) {

        this.jPanelManager = jPanelManager;
        label.setBounds(130, 0, 150, 50);
        gridImage.setBounds(100, 50, 300, 300);

        field0.initialize(jPanelManager);
        field1.initialize(jPanelManager);
        field2.initialize(jPanelManager);
        field3.initialize(jPanelManager);
        field4.initialize(jPanelManager);
        field5.initialize(jPanelManager);
        field6.initialize(jPanelManager);
        field7.initialize(jPanelManager);
        field8.initialize(jPanelManager);

        jPanelManager.add(label);
        jPanelManager.add(gridImage);

        setVisible(false);

//        currentPlayer = PLAYERS.X;
    }

    public PLAYERS getCurrentPlayer() {
        return currentPlayer;
    }

    public void checkTheGrid() {
        checkLine(field0, field1, field2);
        checkLine(field3, field4, field5);
        checkLine(field6, field7, field8);
        checkLine(field0, field3, field6);
        checkLine(field1, field4, field7);
        checkLine(field2, field5, field8);
        checkLine(field0, field4, field8);
        checkLine(field2, field4, field6);
        if (isGameOver) {
            System.out.println("GAME OVER");
            String s;
            if (winner.equals(PLAYERS.X)) {
                s = "PLAYER X";
            } else {
                s = "PLAYER 0";
            }
            System.out.println("THE WINNER IS: " + s);
        }
    }

    private void checkLine(SymbolJButton f0, SymbolJButton f1, SymbolJButton f2) {
        if (!(f0.getMark().equals(PLAYERS.NONE)) &&
                f0.getMark().equals(f1.getMark()) &&
                f1.getMark().equals(f2.getMark())
        ) {
            if (f0.getMark().equals(PLAYERS.X)) {
                winner = PLAYERS.X;
            }
            if (f0.getMark().equals(PLAYERS.O)) {
                winner = PLAYERS.O;
            }
            isGameOver = true;
        }

    }

    public void setVisible(boolean visible) {
        if (visible == true) {
            label.setVisible(true);
            field0.setVisible(true);
            field1.setVisible(true);
            field2.setVisible(true);
            field3.setVisible(true);
            field4.setVisible(true);
            field5.setVisible(true);
            field6.setVisible(true);
            field7.setVisible(true);
            field8.setVisible(true);
            gridImage.setVisible(true);
        } else {
            label.setVisible(false);
            field0.setVisible(false);
            field1.setVisible(false);
            field2.setVisible(false);
            field3.setVisible(false);
            field4.setVisible(false);
            field5.setVisible(false);
            field6.setVisible(false);
            field7.setVisible(false);
            field8.setVisible(false);
            gridImage.setVisible(false);
        }
    }

    public void nextPlayer(PLAYERS players) {

        if (players.equals(PLAYERS.O)) {
            currentPlayer = PLAYERS.O;
        }
        if (players.equals(PLAYERS.X)) {
            currentPlayer = PLAYERS.X;
        }
    }
}
