package tictactoe.components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

public class ImageJLabel extends JLabel {

    public ImageJLabel(String imagePath) {

        try {
            URI uri = Objects.requireNonNull(getClass().getClassLoader().getResource(imagePath)).toURI();
            setIcon(new ImageIcon(ImageIO.read(new File(uri))));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
