
import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame{ 
  //variables
  
  
  //the grid
  JLabel label00 = new JLabel("0.0", JLabel.CENTER); //labels
  JLabel label01 = new JLabel("0.1", JLabel.CENTER); 
  JLabel label02 = new JLabel("0.2", JLabel.CENTER); 
  JLabel label03 = new JLabel("0.3", JLabel.CENTER); 
  JLabel label04 = new JLabel("0.4", JLabel.CENTER); 
  
  JLabel label10 = new JLabel("1.0", JLabel.CENTER); 
  JLabel label20 = new JLabel("2.0", JLabel.CENTER); 
  JLabel label30 = new JLabel("3.0", JLabel.CENTER); 
  JLabel label40 = new JLabel("4.0", JLabel.CENTER); 
  
  JLabel label11 = new JLabel("1.1", JLabel.CENTER); 
  JLabel label12 = new JLabel("1.2", JLabel.CENTER); 
  JLabel label13 = new JLabel("1.3", JLabel.CENTER); 
  JLabel label14 = new JLabel("1.4", JLabel.CENTER); 
  
  JLabel label21 = new JLabel("2.1", JLabel.CENTER); 
  JLabel label22 = new JLabel("2.2", JLabel.CENTER); 
  JLabel label23 = new JLabel("2.3", JLabel.CENTER); 
  JLabel label24 = new JLabel("2.4", JLabel.CENTER); 
  
  JLabel label31 = new JLabel("3.1", JLabel.CENTER); 
  JLabel label32 = new JLabel("3.2", JLabel.CENTER); 
  JLabel label33 = new JLabel("3.3", JLabel.CENTER); 
  JLabel label34 = new JLabel("3.4", JLabel.CENTER); 
  
  JLabel label41 = new JLabel("4.1", JLabel.CENTER); 
  JLabel label42 = new JLabel("4.2", JLabel.CENTER); 
  JLabel label43 = new JLabel("4.3", JLabel.CENTER); 
  JLabel label44 = new JLabel("4.4", JLabel.CENTER); 
  
  //layout
  FlowLayout layout1 = new FlowLayout();
  GridLayout layout2=new GridLayout();
  JPanel pan1 = new JPanel();  
  JPanel pan3 = new JPanel();
  JPanel pan4 = new JPanel(); 
  JPanel pan2 = new JPanel(); 
  
  
  
  
  //other components
  JButton enterButton = new JButton("Enter");
  JLabel introLabel = new JLabel("Welcome To Boggle", JLabel.CENTER); //labels
  JTextField enterField = new JTextField ("", 30);// blank text field
  
  
  
  //constructor
  public Frame() {       
    setTitle("Boggle");
    setSize(700, 600);
    
    pan1.setLayout(new BoxLayout(pan1, BoxLayout.PAGE_AXIS));
    pan3.setLayout(new GridLayout(5,5));
    pan4.setLayout(layout1);
    
    pan1.add(introLabel, BorderLayout.CENTER);
    pan1.add(pan2);
    pan1.add(pan3);
    pan1.add(pan4);
    
    //////// //message frame
    
    //intro
    JOptionPane.showMessageDialog(null, "Welcome to Boggle.", "How to play the game/rules", JOptionPane.INFORMATION_MESSAGE);
    Object[] possibleValues = { "One", "Two"};
    Object selectedValue = JOptionPane.showInputDialog(null,
                                                       "How many players are there?", "Input",
                                                       JOptionPane.INFORMATION_MESSAGE, null,
                                                       possibleValues, possibleValues[0]);   
    int playerNum;
    if(selectedValue.equals("One")){
      playerNum=1;
    }else{
      playerNum=2;
    }// end of getting the number of players
    int[] score=new int[playerNum];
    String[] name= new String[playerNum];
    
    Object[] possibleValues2 = { "2", "3", "4" }; //getting the min length of a word
    Object selectedValue2 = JOptionPane.showInputDialog(null,
                                                        "Please choose a minimum word length", "Input",
                                                        JOptionPane.INFORMATION_MESSAGE, null,
                                                        possibleValues2, possibleValues2[0]);
    int minLength;
    if(possibleValues2.equals("2")){
      minLength=2;
    }else if(possibleValues2.equals("3")){
      minLength=3;
    }else if(possibleValues2.equals("4")){
      minLength=4;
    }
    
    int scoreLimit;
    do{
      String scoreLimit1 = JOptionPane.showInputDialog("Please choose a score limit");//getting the score limit
      scoreLimit=Integer.valueOf(scoreLimit1); 
      if(scoreLimit<1){
        JOptionPane.showMessageDialog(null, "You have to enter a value bigger than 1", "alert", JOptionPane.ERROR_MESSAGE);
      }
    }while(scoreLimit<1);
    
    for(int i=0; i<playerNum; i++){//getting the name of players
      name[i] = JOptionPane.showInputDialog(null, "Enter name of Player "+(i+1)+".", "Enter name");
    }
    
    
    
    //grid
    pan3.add(label00);
    pan3.add(label01);
    pan3.add(label02);
    pan3.add(label03);
    pan3.add(label04);
    
    pan3.add(label10);
    pan3.add(label20);
    pan3.add(label30);
    pan3.add(label40);
    
    pan3.add(label11);
    pan3.add(label12);
    pan3.add(label13);
    pan3.add(label14);
    
    pan3.add(label21);
    pan3.add(label22);
    pan3.add(label23);
    pan3.add(label24);
    
    pan3.add(label31);
    pan3.add(label32);
    pan3.add(label33);
    pan3.add(label34);
    
    pan3.add(label41);
    pan3.add(label42);
    pan3.add(label43);
    pan3.add(label44);
    
    //other components
    
    pan4.add(enterField);
    pan4.add(enterButton);
    
    
    
    
    
    //adding panels
    add(pan1);
    setVisible(true); 
    setLocationRelativeTo(null);// centering the frame
  }//end of constructor
  
  public static void main(String[] args){
    Frame frame1=new Frame(); 
    
  }//end of main method
  
}