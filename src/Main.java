import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {

        JFrame frame = new JFrame("NotePad--");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(createButton(50, 25, "oi"));

        JLabel textLabel = new JLabel("You'll be able to write down things soon enough",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(900, 720));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    private static JButton createButton(int width, int heigth, String buttonText) {
        JButton b1 = new JButton();
        b1.setSize(width, heigth);
        b1.setVisible(true);
        b1.setText(buttonText);
        return b1;
    }

    private JButton createButton(int width, int heigth, String buttonText, String function) {
        JButton b1 = new JButton();
        b1.setSize(width, heigth);
        b1.setVisible(true);
        b1.setText(buttonText);
        b1.addActionListener(e -> this.dispose());
        return b1;
    }


}
