package tictactoe;

import tictactoe.cards.Game;
import tictactoe.cards.Menu;
import tictactoe.components.ImageJLabel;

import javax.swing.*;

public class JPanelManager extends JPanel {

    private Menu menu = new Menu(this);
    private Game game = new Game(this);

    public JPanelManager() {
        setLayout(null);
        ImageJLabel background = new ImageJLabel("png/background.jpg");
        background.setBounds(0,0,500,400);
        add(background);
    }

    public void changeCard(CARDS cards) {
        if (cards.equals(CARDS.GAME)) {
            game.setVisible(true);
        }
        if (cards.equals(CARDS.MENU)) {
            menu.setVisible(true);
        }
    }
}
