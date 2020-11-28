package tictactoe.components;

import javax.swing.*;
import java.awt.*;

import static tictactoe.MainFrame.FONT;

public class TextJButton extends JButton {

    public TextJButton(String text) {

        setRequestFocusEnabled(false);
        setFont(FONT);
        setText(text);
        setForeground(new Color(0x458D9B));
        setBorderPainted(true);
        setContentAreaFilled(false);
        setFocusPainted(false);
    }

}
