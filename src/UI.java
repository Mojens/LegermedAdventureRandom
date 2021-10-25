import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class UI {
  JFrame window;
  JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
  JLabel titleNameLabel, playerNameLabel;
  JButton startButton, choice1, choice2, choice3, choice4,choice5,choice6;
  JTextArea mainTextArea;
  Font titleFont = new Font("Times New Roman",Font.PLAIN,20);
  Font normalFont = new Font("Times New Roman",Font.PLAIN,26);

  public void createUI(Adventure.ChoiceHandler cHandler) {
    Scanner input = new Scanner(System.in);

    // Her laver vi vinduen først
    window = new JFrame();
    window.setSize(800, 600);
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    window.getContentPane().setBackground(Color.black);
    window.setLayout(null);


    //Title screen
    titleNamePanel = new JPanel();
    titleNamePanel.setBounds(100,100,600,250);
    titleNamePanel.setBackground(Color.black);

    titleNameLabel = new JLabel("Welcome to the Adventure Game!\n" +
        "Space edition!!");
    titleNameLabel.setBounds(100,100,600,250);
    titleNameLabel.setBackground(Color.black);
    titleNameLabel.setForeground(Color.white);
    titleNameLabel.setFont(titleFont);
    titleNamePanel.add(titleNameLabel);

    //Start knappen
    startButtonPanel = new JPanel();
    startButtonPanel.setBounds(300,400,200,100);
    startButtonPanel.setBackground(Color.black);

    startButton = new JButton("START");
    titleNameLabel.setBounds(300,400,200,100);
    //startButton.setBackground(Color.black);
    startButton.setForeground(Color.black);
    //startButton.setFont(normalFont);
    startButton.addActionListener(cHandler);
    startButton.setActionCommand("Start");
    startButtonPanel.add(startButton);

    window.add(titleNamePanel);
    window.add(startButtonPanel);



    //Game screen
    mainTextPanel = new JPanel();
    mainTextPanel.setBounds(100,100,600,250);
    mainTextPanel.setBackground(Color.black);
    window.add(mainTextPanel);

    mainTextArea = new JTextArea("Well hello! Lets get this game started!\n"+"A mechanical noise is filling your ears " +
        "and it feels like the ground beneath is moving.. " +"\n" +
        "Oh! That's right. You are on Mo's Space Station!\n" +"\n" +
        "Why don't you have a look around?");
    mainTextArea.setBounds(100,100,600,250);
    mainTextArea.setBackground(Color.black);
    mainTextArea.setForeground(Color.white);
    mainTextArea.setFont(normalFont);
    mainTextArea.setLineWrap(true);
    mainTextArea.setWrapStyleWord(true);
    mainTextArea.setEditable(false);
    mainTextPanel.add(mainTextArea);

    choiceButtonPanel = new JPanel();
    choiceButtonPanel.setBounds(250,350,300,150);
    choiceButtonPanel.setBackground(Color.black);
    choiceButtonPanel.setLayout(new GridLayout(4,2));
    window.add(choiceButtonPanel);

    choice1 = new JButton("Go North");
    choice1.setBackground(Color.black);
    choice1.setForeground(Color.black);
    choice1.setFont(normalFont);
    choice1.setFocusPainted(false);
    choice1.addActionListener(cHandler);
    choice1.setActionCommand("c1");
    choiceButtonPanel.add(choice1);

    choice2 = new JButton("Go South");
    choice2.setBackground(Color.black);
    choice2.setForeground(Color.black);
    choice2.setFont(normalFont);
    choice2.setFocusPainted(false);
    choice2.addActionListener(cHandler);
    choice2.setActionCommand("c2");
    choiceButtonPanel.add(choice2);

    choice3 = new JButton("Go East");
    choice3.setBackground(Color.black);
    choice3.setForeground(Color.black);
    choice3.setFont(normalFont);
    choice3.setFocusPainted(false);
    choice3.addActionListener(cHandler);
    choice3.setActionCommand("c3");
    choiceButtonPanel.add(choice3);

    choice4 = new JButton("Go West");
    choice4.setBackground(Color.black);
    choice4.setForeground(Color.black);
    choice4.setFont(normalFont);
    choice4.setFocusPainted(false);
    choice4.addActionListener(cHandler);
    choice4.setActionCommand("c4");
    choiceButtonPanel.add(choice4);

    choice5 = new JButton("Look");
    choice5.setBackground(Color.black);
    choice5.setForeground(Color.black);
    choice5.setFont(normalFont);
    choice5.setFocusPainted(false);
    choice5.addActionListener(cHandler);
    choice5.setActionCommand("c5");
    choiceButtonPanel.add(choice5);

    choice6 = new JButton("Help");
    choice6.setBackground(Color.black);
    choice6.setForeground(Color.black);
    choice6.setFont(normalFont);
    choice6.setFocusPainted(false);
    choice6.addActionListener(cHandler);
    choice6.setActionCommand("c6");
    choiceButtonPanel.add(choice6);

    playerPanel = new JPanel();
    playerPanel.setBounds(100,15,600,50);
    playerPanel.setBackground(Color.black);
    playerPanel.setLayout(new GridLayout(1,2));
    window.add(playerPanel);

    playerNameLabel = new JLabel("name: ");
    playerNameLabel.setFont(normalFont);
    playerNameLabel.setForeground(Color.white);
    playerPanel.add(playerNameLabel);




    window.setVisible(true);



  }
}
