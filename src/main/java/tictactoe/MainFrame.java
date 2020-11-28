package tictactoe;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JPanelManager jPanelManager = new JPanelManager();
    public static final int FRAME_WIDTH = 500;
    public static final int FRAME_HEIGHT = 400;
    public static final Font FONT = new Font("Arial", Font.PLAIN, 25);

    public MainFrame() {
        getContentPane().setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        add(jPanelManager);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }


}
