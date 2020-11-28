package tictactoe.components;

import javax.swing.*;
import java.awt.*;

import static tictactoe.MainFrame.FONT;

public class TextJLabel extends JLabel{

    public TextJLabel(String text) {

        setText(text);
        setForeground(new Color(0x458D9B));
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
        setFont(FONT);
    }

}
