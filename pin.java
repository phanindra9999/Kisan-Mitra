
package com.mycompany.kisanmitr;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class pin extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,L1,s;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b1,b2;
    JComboBox c1,c2,c3;
    JTextField tf1,tf2;
    JPasswordField pf1,pf2;
   
    
    
    
    {
        
       
        
       setFont(new Font("System", Font.BOLD, 22));
    
       setTitle("KISAN MITR");
        
       setContentPane(new JLabel(new ImageIcon("C:\\Users\\Veerender Goud\\Documents\\NetBeansProjects\\Kisanmitr\\src\\main\\java\\com\\mycompany\\kisanmitr\\icons\\farm.jpg")));
       
       
        
        l1 = new JLabel("PASSWORD RESET");
        l1.setFont(new Font("Osward", Font.BOLD, 28));
        l1.setForeground(Color.BLACK);
        
        l2 = new JLabel("NUMBER:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setForeground(Color.BLACK);
        l4 = new JLabel("Re-Enter PIN:");
        l4.setFont(new Font("Raleway", Font.BOLD, 28));
        l4.setForeground(Color.BLACK);
        l5=new JLabel("What is your favourite place and number(place@number)?");
        l5.setFont(new Font("Raleway", Font.BOLD, 14));
        l5.setForeground(Color.BLACK);
        s = new JLabel("For any queries please contact5:kisanmitr@gmail.com");
        s.setFont(new Font("Raleway", Font.BOLD, 15));
        s.setForeground(Color.BLACK);
       s.setBounds(200,550,600,30);
       add(s);
        tf2 = new JTextField(15);
        tf1 = new JTextField(15);
        pf1 = new JPasswordField(15);
        pf2 = new JPasswordField(15);
        b1= new JButton("SAVE");
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
       b2= new JButton("NEXT");
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
           
        setLayout(null);
        
        l1.setBounds(175,50,450,200);
        add(l1);
        
        l2.setBounds(125,150,375,200);
        add(l2);
        tf1.setFont(new Font("Arial", Font.BOLD, 14)); 
        tf1.setBounds(300,235,230,30);
        add(tf1);
        
        l3.setBounds(125,225,375,200);
        add(l3);
        l4.setBounds(125,300,375,200);
        add(l4);
        l5.setBounds(0,375,450,200);
        add(l5);
        pf1.setFont(new Font("Arial", Font.BOLD, 14));
        pf1.setBounds(300,310,230,30);
        add(pf1);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,385,230,30);
        add(pf2);
         tf2.setFont(new Font("Arial", Font.BOLD, 14)); 
        tf2.setBounds(400,460,230,30);
        add(tf2);
            
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300,500,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,500,100,30);
        add(b2);
        b1.addActionListener(this);
         b2.addActionListener(this);
      
        
 
        getContentPane().setBackground(Color.ORANGE);
        
        setSize(850,850);
        setLocation(500,90);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    try{        
           
            String a = tf1.getText();
            String d = tf2.getText();
            String b = pf1.getText();
            String c = pf2.getText();
            
            
            
            if(ae.getSource()==b1){
              
                 if(tf1.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Please Enter your gmail");
                
                }
                if(pf1.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Enter PIN");
                }
                if (pf2.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Re-Enter PIN");
                }
                 if (tf2.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "ANSWER THE QUESTION");
                }
                
               if(pf1.getText().equals(pf2.getText())){
                    
                   conn c1 = new conn();
                   ResultSet rs = c1.s.executeQuery(" SELECT md5(CODE) FROM LOGIN WHERE GMAIL = '"+a+"'");
                   if(rs.equals(d)){
                   
                    
                    String q1 = "update login set password = md5('"+b+"') where gmail= '"+a+"' ";
                   
                   c1.s.executeUpdate(q1);
                    
                   
                   JOptionPane.showMessageDialog(null, "PIN changed successfully");}
                   else{
                    JOptionPane.showMessageDialog(null, "ANSWER IS WRONG") ;  
                   }}
                   
                   
                  
              
                }else if(ae.getSource()==b2){
                
                new login().setVisible(true);
                setVisible(false);
                
            }
        }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("error: "+e);
        }
            
    
                
        
   
    }
    
    
    public static void main(String[] args){
        new pin().setVisible(true);
    }
}