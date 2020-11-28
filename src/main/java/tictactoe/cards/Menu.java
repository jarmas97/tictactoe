package tictactoe.cards;

import tictactoe.CARDS;
import tictactoe.JPanelManager;
import tictactoe.components.ImageJLabel;
import tictactoe.components.TextJButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {

    private ImageJLabel logo = new ImageJLabel("png/logo.png");
    private TextJButton button = new TextJButton("START GAME");
    private JPanelManager jPanelManager;

    public Menu(JPanelManager jPanelManager) {

        logo.setBounds(100,40,300,100);
        button.setBounds(150, 180,200,50);
        button.addActionListener(this);

        this.jPanelManager = jPanelManager;
        jPanelManager.add(button);
        jPanelManager.add(logo);

    }

    public void setVisible(boolean visible) {
        if (visible == true) {
            logo.setVisible(true);
            button.setVisible(true);
        } else {
            logo.setVisible(false);
            button.setVisible(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();
        if (source == button) {
            this.setVisible(false);
            jPanelManager.changeCard(CARDS.GAME);
        }
    }
}
