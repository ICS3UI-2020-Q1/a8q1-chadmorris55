import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JLabel firstLabel;

  JTextField firstInput;
  
  JButton startButton;

  JPanel mainPanel;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    //initialize the main panel 
    mainPanel = new JPanel();
    //manual layout
    mainPanel.setLayout(null);
    //create the text box
    firstInput = new JTextField();
    firstInput.setBounds(100,100,600,20);

    //create the text field
    firstLabel = new JLabel("");
    firstLabel.setBounds(100,250,600,20);
    
    //create the button
    startButton = new JButton("Say Hello");
    startButton.setBounds(320,400,150,20);

    //set action command
    startButton.setActionCommand("start");

    //add action ActionListener
    startButton.addActionListener(this);

    //add things to the main panel 
    mainPanel.add(firstInput);
    mainPanel.add(firstLabel);
    mainPanel.add(startButton);
    //add main panel to screen 
    frame.add(mainPanel);
 
    

  }
  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
    //goes when button is pressed
    if(command.equals("start")){
      String name = firstInput.getText();
      firstLabel.setText("hello " + name);
    }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
