package org.connectthree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ConnectThreeWindow extends JFrame {
    private JPanel screenPanel;
    private JPanel mainPanel;
    private JButton playButton;
    private JButton achievementButton;
    private JButton exitButton;
    private JPanel achievementPanel;
    private JPanel gameSelectionPanel;
    private JPanel gamePanel;

    public ConnectThreeWindow() {
        setContentPane(screenPanel);
        setTitle("Connect Three - Prog3 NHF - Nagy István");
        setMinimumSize(new Dimension(600, 400));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        screenPanel.getLayout().addLayoutComponent("mainPanel", mainPanel);

        playButton.addActionListener(e -> {/* TODO */});
        achievementButton.addActionListener(e -> {/* TODO */});
        exitButton.addActionListener(e -> System.exit(0));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                    ConnectThreeWindow.this,
                    "Are you sure you want to exit?",
                    "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        setVisible(true);
    }

}
