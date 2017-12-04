import Constants.FunctionConstants;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Objects;

public class Main {

    private static JFrame frame = new JFrame("NotePad--");

    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {
        JPanel mainPanel = new JPanel();
        JPanel middlePanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        //Main Panel
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

        //Add Text Area
        middlePanel.add(createTextArea(middlePanel));
        mainPanel.add(middlePanel);

        //Add Buttons
        bottomPanel.add(createButton(100, 25, "Save"));
        bottomPanel.add(createButton(100, 25, "Close", FunctionConstants.CLOSE));
        mainPanel.add(bottomPanel);

        //Show Window
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    private static JScrollPane createTextArea(JPanel panel) {
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Display Area"));

        JTextArea display = new JTextArea (27, 70);
        display.setFont(display.getFont().deriveFont(20f));
        display.setEditable(true);
        JScrollPane scroll = new JScrollPane(display);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        return scroll;
    }

    private static JButton createButton(int width, int heigth, String buttonText) {
        JButton button = new JButton();
        button.setSize(width, heigth);
        button.setVisible(true);
        button.setText(buttonText);
        return button;
    }

    private static JButton createButton(int width, int heigth, String buttonText, String function) {
        JButton button = new JButton();
        button.setSize(width, heigth);
        button.setVisible(true);
        button.setText(buttonText);
        if(Objects.equals(function, FunctionConstants.CLOSE)) {
            button.addActionListener(e -> frame.dispose());
        }
        return button;
    }


}
