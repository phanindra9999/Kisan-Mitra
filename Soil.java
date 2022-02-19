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
public class Soil extends JFrame implements ActionListener{
    JTable jt;
    
    JLabel l1,l2,l3,l5,l4,l6,l7,l8,s;
    JComboBox B1,B2;
    JTextField tf1,tf2,tf3,tf4;
    JPasswordField pf2;
    JButton b1,b2,b3;
  
    Soil(){
         
        
       
        
        setFont(new Font("System", Font.BOLD, 22));
       
        setTitle("KISAN MITR");
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Veerender Goud\\Documents\\NetBeansProjects\\Kisanmitr\\src\\main\\java\\com\\mycompany\\kisanmitr\\icons\\2.jpg")));
       
       
        
        
        
        l1 = new JLabel("SOIL");
        l1.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 50));
        l1.setForeground(Color.BLACK);
       
       
        String b[] = {"WHEAT","GRAM","POTATO","MUSTARD","TOBACCO","RICE","MAIZE","BAJRA","JWAR","GROUND NUT","PULSES","SESAME","COTTON","SUGAR CANE"};
        B1= new JComboBox(b);
        B1.setBackground(Color.WHITE);
        
        B1.setBounds(400,200,200,30);
        add(B1);
         String D[] = {"1-4","4-5","5-5.5","5.5-6.5","6.5-7.5","7.5-14"};
        B2= new JComboBox(D);
        B2.setBackground(Color.WHITE);
        
        B2.setBounds(400,240,200,30);
        add(B2);
         l2 = new JLabel("LAST SOWED CROP:");
        l2.setFont(new Font("Osward", Font.BOLD, 20));
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("PH:");
        l3.setFont(new Font("Osward", Font.BOLD, 20));
        l3.setForeground(Color.BLACK);
        l4 = new JLabel("FERTILIZER:");
        l4.setFont(new Font("Osward", Font.BOLD, 20));
        l4.setForeground(Color.BLACK);
        l6 = new JLabel("MRP:");
        l6.setFont(new Font("Osward", Font.BOLD, 20));
        l6.setForeground(Color.BLACK);
         l7 = new JLabel("CROPS CAN BE GROWN (PH):");
        l7.setFont(new Font("Osward", Font.BOLD, 20));
        l7.setForeground(Color.BLACK);
         l8 = new JLabel("NEXT CROP TO BE CULTIVATED:");
        l8.setFont(new Font("Osward", Font.BOLD, 20));
        l8.setForeground(Color.BLACK);
        s = new JLabel("For any queries please contact:kisanmitr5@gmail.com");
        s.setFont(new Font("Raleway", Font.BOLD, 15));
        s.setForeground(Color.WHITE);
       s.setBounds(200,550,600,30);
       add(s);
        
        tf1 = new JTextField(15);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        
        tf1.setBackground(Color.WHITE);
        
        tf1.setBounds(400,280,200,30);
        add(tf1);
        tf2 = new JTextField(15);
       tf2.setFont(new Font("Arial", Font.BOLD, 14));
        tf2.setBackground(Color.WHITE);
        
        tf2.setBounds(400,320,200,30);
        add(tf2);
        tf3 = new JTextField(15);
       tf3.setFont(new Font("Arial", Font.BOLD, 14));
        tf3.setBackground(Color.WHITE);
        
        tf3.setBounds(400,360,200,30);
        add(tf3);
        tf4 = new JTextField(15);
       tf4.setFont(new Font("Arial", Font.BOLD, 14));
        tf4.setBackground(Color.WHITE);
        
        tf4.setBounds(50,450,600,30);
        add(tf4);
        
        
        b1 = new JButton("SHOW");
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("BACK");
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        b3 = new JButton("CROP");
        b3.setBackground(Color.black);
        b3.setForeground(Color.WHITE);

        
        setLayout(null);
        
        l1.setBounds(250,0,450,200);
        add(l1);
        
        
        l2.setBounds(50,200,300,30);
        add(l2);
        l3.setBounds(50,240,300,30);
        add(l3);
        l4.setBounds(50,280,300,30);
        add(l4);
        l6.setBounds(50,320,300,30);
        add(l6);
        l7.setBounds(50,360,300,30);
        add(l7);
        l8.setBounds(50,400,350,30);
        add(l8);
        
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(150,500,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(450,500,100,30);
        add(b2);
        
       b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300,500,100,30);
        add(b3);
       
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
      b3.addActionListener(this);
        
        getContentPane().setBackground(Color.ORANGE);
        
        setSize(750,750);
        setLocation(500,200);
        setVisible(true);
        

        
    }
    public void actionPerformed(ActionEvent ae){
       
    
        
        
        String ac = (String)B1.getSelectedItem(); 
        
      String bc = (String)B2.getSelectedItem();

        
                
               
            conn c1 = new conn();
                    
            try {
              
                 if(ae.getSource()==b1){
                ResultSet rs;
                
                 rs = c1.s.executeQuery(" SELECT FERTILIZER,COST,CROP FROM PH Where VALUE = '"+bc+"'");
                
                
                if(rs.next()){
                   
                String balance = rs.getString("FERTILIZER");
                String balance1 = rs.getString("COST");
                String balance3 = rs.getString("CROP");
               
                
                tf1.setText(balance);
                tf2.setText(balance1);
                tf3.setText(balance3);
                
                
               
                }
                
                  
                
            
                
                 }
                else if(ae.getSource()==b3)
                {
                        ResultSet rs;
                
                 rs = c1.s.executeQuery(" SELECT CROP2 FROM SOIL Where CROP1 = '"+ac+"'");
                
                
                if(rs.next()){
                   
               
                String balance = rs.getString("CROP2");
               
                
               
                tf4.setText(balance);
                
                
               
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
        new Soil().setVisible(true);
}
}

