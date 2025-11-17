package connectThree;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ConnectThreeWindowForm extends JFrame {
    private JPanel screenPanel;
    private JPanel mainPanel;
    private JButton playButton;
    private JButton achievementButton;
    private JButton exitButton;
    private JPanel achievementPanel;
    private JPanel gameSelectionPanel;
    private JPanel gamePanel;

    public ConnectThreeWindowForm() {
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        playButton.addActionListener(e -> {});
        achievementButton.addActionListener(e -> {});
        exitButton.addActionListener(e -> System.exit(0));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                    ConnectThreeWindowForm.this,
                    "Are you sure you want to exit?",
                    "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        })
    }

}
