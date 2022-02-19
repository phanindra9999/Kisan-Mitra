/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kisanmitr;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Croploan extends JFrame implements ActionListener{
    JTable jt;
    
    JLabel l1,l2,l3,l5,l4,l6,l7,l8,s;
    JComboBox B1;
    JTextField tf1,tf2;
    JPasswordField pf2;
    JButton b1,b2,b3;
  
    Croploan(){
         
        
       
        
        setFont(new Font("System", Font.BOLD, 22));
       
        setTitle("KISAN MITR");
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Veerender Goud\\Documents\\NetBeansProjects\\Kisanmitr\\src\\main\\java\\com\\mycompany\\kisanmitr\\icons\\CROP.png")));
       
       
        
        
        
        l1 = new JLabel("CROP LOAN");
        l1.setFont(new Font("Osward", Font.BOLD, 28));
        l1.setForeground(Color.BLACK);
        l5 = new JLabel("WHO IS ELIGIBLE?");
        l5.setFont(new Font("Osward", Font.BOLD, 18));
        l5.setForeground(Color.BLACK);
         l6 = new JLabel("# must be resident of india ");
        l6.setFont(new Font("Osward", Font.ITALIC, 15));
        l6.setForeground(Color.BLACK);
        l7 = new JLabel("# age limit-18to70 ");
        l7.setFont(new Font("Osward", Font.ITALIC, 15));
        l7.setForeground(Color.BLACK);
        l8 = new JLabel("# must have landowenership ");
        l8.setFont(new Font("Osward", Font.ITALIC, 15));
        l8.setForeground(Color.BLACK);
        String bank[] = {"STATE BANK OF INDIA(SBI)","ICIC BANK","CENTRAL BANK OF INDIA","UNION BANK","AXIS BANK","NABARD","PUNJAB NATIONAL BANK(PNB)","ALLAHABAD BANK","HDFC BANK","BANK OF BARODA"};
        B1= new JComboBox(bank);
        B1.setBackground(Color.WHITE);
        
        B1.setBounds(350,240,200,30);
        add(B1);
         l2 = new JLabel("BANK:");
        l2.setFont(new Font("Osward", Font.BOLD, 25));
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("RATE OF INTREST:");
        l3.setFont(new Font("Osward", Font.BOLD, 25));
        l3.setForeground(Color.BLACK);
        l4 = new JLabel("TYPES OF LOAN:");
        l4.setFont(new Font("Osward", Font.BOLD, 25));
        l4.setForeground(Color.BLACK);
        s = new JLabel("For any queries please contact:kisanmitr5@gmail.com");
        s.setFont(new Font("Raleway", Font.BOLD, 15));
        s.setForeground(Color.BLACK);
       s.setBounds(200,550,600,30);
       add(s);
        
        
        tf1 = new JTextField(15);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        
        tf1.setBackground(Color.WHITE);
        
        tf1.setBounds(350,300,200,30);
        add(tf1);
        tf2 = new JTextField(15);
       tf2.setFont(new Font("Arial", Font.BOLD, 14));
        tf2.setBackground(Color.WHITE);
        
        tf2.setBounds(50,400,650,30);
        add(tf2);
        
        
        b1 = new JButton("SHOW");
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("BACK");
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        

        
        setLayout(null);
        
        l1.setBounds(250,0,450,200);
        add(l1);
        l5.setBounds(0,20,450,200);
        add(l5);
        l6.setBounds(10,40,450,200);
        add(l6);
        l7.setBounds(10,60,450,200);
        add(l7);
        l8.setBounds(10,80,450,200);
        add(l8);
        l2.setBounds(50,240,200,30);
        add(l2);
        l3.setBounds(50,300,250,30);
        add(l3);
        l4.setBounds(50,360,250,30);
        add(l4);
        
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(200,500,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,500,100,30);
        add(b2);
        
       
       
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
      
        
        getContentPane().setBackground(Color.ORANGE);
        
        setSize(750,750);
        setLocation(500,200);
        setVisible(true);
        

        
    }
    public void actionPerformed(ActionEvent ae){
       
    
        
        
        String ac = (String)B1.getSelectedItem(); 
        
      

        
                
               
            conn c1 = new conn();
                    
            try {
              
                 if(ae.getSource()==b1){
                ResultSet rs = c1.s.executeQuery(" SELECT INTREST,TYPES FROM CROPLOAN Where BANK  = '"+ac+"'");
                
                
                if(rs.next()){
                   
                String balance = rs.getString("INTREST");
                String balance1 = rs.getString("TYPES");
                tf1.setText(balance);
                tf2.setText(balance1);
                
               
                }
                
                  
                
            
                
                 }
            else if(ae.getSource()==b2)
            {
                new MENU().setVisible(true);
                setVisible(false);
            }
        }catch(Exception ex){
             ex.printStackTrace();
        }
        
    }
        public static void main(String[] args)
{
        new Croploan().setVisible(true);
}
}
