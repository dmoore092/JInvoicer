import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Invoicer extends JFrame /*implements ActionLister*/{
   
   JLabel jobDescriptionLabel = new JLabel("Job Description", SwingConstants.RIGHT);
   JLabel startAddressLabel = new JLabel("Starting Address: ", SwingConstants.RIGHT);
   JLabel endAddressLabel = new JLabel("Ending Address: ", SwingConstants.RIGHT);
   JLabel milesLabel = new JLabel("Miles Driven: ", SwingConstants.RIGHT);
   
   JTextField jobDescriptionField = new JTextField();
   JTextField startAddressField = new JTextField();
   JTextField endAddressField = new JTextField();
   JTextField milesField = new JTextField();
   
   JButton saveButton = new JButton("Save");
   JButton quitButton = new JButton("Quit");
   JButton blankButton1 = new JButton("");
   JButton blankButton2 = new JButton("");
    
   public Invoicer(){
   
      setSize(400,170);
      setTitle("Invoicer");
      setLocationRelativeTo(null);
      
      JPanel mainPanel = new JPanel(new GridLayout(4,2));
      JPanel buttonPanel = new JPanel(new GridLayout(1,2));
      
      add(mainPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
      
      mainPanel.add(jobDescriptionLabel);
      mainPanel.add(jobDescriptionField);
      mainPanel.add(startAddressLabel);
      mainPanel.add(startAddressField);
      mainPanel.add(endAddressLabel);
      mainPanel.add(endAddressField);
      mainPanel.add(milesLabel);
      mainPanel.add(milesField);
      
      buttonPanel.add(blankButton1);blankButton1.setVisible(false);
      buttonPanel.add(saveButton);
      buttonPanel.add(quitButton);
      buttonPanel.add(blankButton2);blankButton2.setVisible(false);
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   public static void main(String [] args){
   
      new Invoicer();
   }
}