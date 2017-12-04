import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static JFrame frame = new JFrame("NotePad--");

    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createButton(50, 25, 100, 10, "Ok");
        createButton(50, 25, 10, 50, "Close", "CLOSE");

        JLabel textLabel = new JLabel("You'll be able to write down things soon enough",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(900, 720));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    private static void createButton(int width, int heigth, int xPosition, int yPosition, String buttonText) {
        JButton button = new JButton();
        button.setSize(width, heigth);
        button.setVisible(true);
        button.setText(buttonText);
        frame.add(button).setLocation(xPosition, yPosition);
    }

    private static void createButton(int width, int heigth, int xPosition, int yPosition, String buttonText, String function) {
        JButton button = new JButton();
        button.setSize(width, heigth);
        button.setVisible(true);
        button.setText(buttonText);
        button.addActionListener(e -> frame.dispose());
        frame.add(button).setLocation(xPosition, yPosition);
    }


}
