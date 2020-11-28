package tictactoe.components;

import tictactoe.JPanelManager;
import tictactoe.PLAYERS;
import tictactoe.cards.Game;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SymbolJButton extends JLabel implements MouseListener {

    private ImageJLabel crossImage = new ImageJLabel("png/cross.png");
    private ImageJLabel circleImage = new ImageJLabel("png/circle.png");
    private boolean isActive = true;
    private PLAYERS mark = PLAYERS.NONE;
    private Game game;

    public SymbolJButton(int x, int y, int width, int height, Game game) {
        this.game = game;
        setBounds(x,y,width,height);
        circleImage.setBounds(x,y,width,height);
        crossImage.setBounds(x,y,width,height);
        addMouseListener(this);

    }

    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        if (!aFlag) {
            crossImage.setVisible(false);
            circleImage.setVisible(false);
        }
    }

    public void initialize(JPanelManager jPanelManager) {
        jPanelManager.add(circleImage);
        jPanelManager.add(crossImage);
        jPanelManager.add(this);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (isActive) {
            if (game.getCurrentPlayer().equals(PLAYERS.X)) {
                crossImage.setVisible(true);
                mark = PLAYERS.X;
                isActive = false;
                game.nextPlayer(PLAYERS.O);
            }
            else {
                circleImage.setVisible(true);
                mark = PLAYERS.O;
                isActive = false;
                game.nextPlayer(PLAYERS.X);
            }
            game.checkTheGrid();
        }
    }

    public PLAYERS getMark() {
        return mark;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (isActive) {

        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (isActive) {

        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        if (isActive) {

        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        if (isActive) {

        }
    }
}
