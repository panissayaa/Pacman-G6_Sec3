package nl.tudelft.jpacman.ui;

import nl.tudelft.jpacman.Launcher;
import javax.swing.*;
import java.awt.*;

public class GameOver extends JFrame {
    private JButton retryButton;

    private JButton playButton;
    private JButton homeButton;
    private JButton exitButton;

    public GameOver() {

        // Set the title and size of the frame
        setTitle("Pacman");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundImage = new ImageIcon("src/main/resources/bg/Gameover_bg.png");
        Image image = backgroundImage.getImage().getScaledInstance(600, 800, Image.SCALE_SMOOTH);
        ImageIcon realImg = new ImageIcon(image);
        JLabel backgroundLabel = new JLabel(realImg);

        ImageIcon exitIcon = new ImageIcon("src/main/resources/button/exit_btn.png");
        Image exitImg = exitIcon.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
        ImageIcon exitBtn = new ImageIcon(exitImg);

        ImageIcon startIcon = new ImageIcon("src/main/resources/button/playagain_btn.png");
        Image startImg = startIcon.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
        ImageIcon startBtn = new ImageIcon(startImg);

        playButton = new JButton("");
        playButton.setIcon(startBtn);
        playButton.setOpaque(false);
        playButton.setContentAreaFilled(false);
        playButton.setBorderPainted(false);
        playButton.setBorder(null);

        playButton.addActionListener(e -> {
            this.setVisible(false);
            Launcher.dispose();
            new Theme().setVisible(true);
        });

        exitButton = new JButton("");
        exitButton.setIcon(exitBtn);
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        exitButton.setBorder(null);
        exitButton.addActionListener(e -> {
            this.dispose();
        });

        backgroundLabel.add(playButton, BorderLayout.CENTER);
        backgroundLabel.add(exitButton, BorderLayout.CENTER);
        playButton.setBounds(50, 700, 200, 50);
        exitButton.setBounds(350, 700, 200, 50);
        backgroundLabel.setLayout(null);
        add(backgroundLabel, BorderLayout.CENTER);

        setVisible(true);

    }

}

