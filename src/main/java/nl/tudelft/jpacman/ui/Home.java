package nl.tudelft.jpacman.ui;

import javax.swing.*;
import java.awt.*;

public class  Home extends JFrame {
    private JButton playButton;
    private JButton exitButton;
    private Theme themeSelector;

    public void openTheme() {
        themeSelector = new Theme();
        themeSelector.setVisible(true);
    }

    public JButton getStartButton() {
        return playButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public Home(){

        setTitle("Pacman");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundImage = new ImageIcon("src/main/resources/bg/pac_bg.png");
        Image image = backgroundImage.getImage().getScaledInstance(600, 800, Image.SCALE_SMOOTH);
        ImageIcon realImg = new ImageIcon(image);
        JLabel backgroundLabel = new JLabel(realImg);

        ImageIcon startIcon = new ImageIcon("src/main/resources/button/start_btn.png");
        Image startImg = startIcon.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
        ImageIcon startBtn = new ImageIcon(startImg);


        ImageIcon exitIcon = new ImageIcon("src/main/resources/button/exit_btn.png");
        Image exitImg = exitIcon.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
        ImageIcon exitBtn = new ImageIcon(exitImg);


        // Set up the button
        playButton = new JButton("");
        playButton.setIcon(startBtn);
        playButton.setOpaque(false);
        playButton.setContentAreaFilled(false);
        playButton.setBorderPainted(false);
        playButton.setBorder(null);

        playButton.addActionListener(e -> {
            this.setVisible(false);
            openTheme();
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
        playButton.setBounds(200, 350, 200, 50);
        exitButton.setBounds(200, 450, 200, 50);
        backgroundLabel.setLayout(null);
        add(backgroundLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Home();
    }

}
