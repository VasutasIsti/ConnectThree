package connectThree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ConnectThreeWindow extends JFrame {
    private static JPanel wrapperPanel = new JPanel(new BorderLayout());
    private static CardLayout cardLayout = new CardLayout();
    private static JPanel screenManager = new JPanel(cardLayout);

    private static JPanel mainPanel = new JPanel();
    private static JPanel achievementPanel = new JPanel();
    private static JPanel gameSelectionPanel = new JPanel();
    private static JPanel gamePanel = new JPanel();

    private static JButton playButton = new JButton("Play");
    private static JButton achievementButton = new JButton("Achievements");
    private static JButton exitButton = new JButton("Exit");

    public ConnectThreeWindow() {
        super("Connect Three");
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setSize(600, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        wrapperPanel.add(screenManager, BorderLayout.CENTER);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        achievementButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainPanel.add(playButton);
        mainPanel.add(achievementButton);
        mainPanel.add(exitButton);

        screenManager.add(mainPanel, "mainPanel");
        screenManager.add(gameSelectionPanel, "gameSelectionPanel");
        screenManager.add(gamePanel, "gamePanel");
        screenManager.add(achievementPanel, "achievementPanel");



        add(screenManager, BorderLayout.CENTER);

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
                    // TODO save if necessary

                    System.exit(0);
                }
            }
        });

        setVisible(true);
    }
}
