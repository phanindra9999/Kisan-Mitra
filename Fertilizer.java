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
public class Fertilizer extends JFrame implements ActionListener{
    JTable jt;
    
    JLabel l1,l2,l3,l5,l4,l6,l7,l8,s;
    JComboBox B1,B2;
    JTextField tf1,tf2;
    JPasswordField pf2;
    JButton b1,b2,b3;
  
    Fertilizer(){
         
        
       
        
        setFont(new Font("System", Font.BOLD, 22));
       
        setTitle("KISAN MITR");
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Veerender Goud\\Documents\\NetBeansProjects\\Kisanmitr\\src\\main\\java\\com\\mycompany\\kisanmitr\\icons\\pc.jpg")));
       
       
        
        
        
        l1 = new JLabel("PESTICIDES");
        l1.setFont(new Font("Osward", Font.BOLD, 28));
        l1.setForeground(Color.BLACK);
        l5 = new JLabel("SUMMER SEASON CROPS");
        l5.setFont(new Font("Osward", Font.BOLD, 18));
        l5.setForeground(Color.BLACK);
        s = new JLabel("For any queries please contact:kisanmitr5@gmail.com");
        s.setFont(new Font("Raleway", Font.BOLD, 15));
        s.setForeground(Color.BLACK);
       s.setBounds(200,550,600,30);
       add(s);
       
        String b[] = {"CORN","BAJRA","COTTON","PADDY"};
        B1= new JComboBox(b);
        B1.setBackground(Color.WHITE);
        
        B1.setBounds(350,240,200,30);
        add(B1);
         String D[] = {"TANA OR GOB SUNDI","BLACK YELLOWISH","STEM BORN INSECTS","CHIP-CHAPA","GROWING PROBLEM","LEAF CUTTER INSECTS","TELA INSECTS","PATA MAROD","LEAF FOLDING","WEEDS"};
        B2= new JComboBox(D);
        B2.setBackground(Color.WHITE);
        
        B2.setBounds(350,300,200,30);
        add(B2);
         l2 = new JLabel("CROPS:");
        l2.setFont(new Font("Osward", Font.BOLD, 25));
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("DISEASE:");
        l3.setFont(new Font("Osward", Font.BOLD, 25));
        l3.setForeground(Color.BLACK);
        l4 = new JLabel("PESTICIDE:");
        l4.setFont(new Font("Osward", Font.BOLD, 25));
        l4.setForeground(Color.BLACK);
        l6 = new JLabel("MRP:");
        l6.setFont(new Font("Osward", Font.BOLD, 25));
        l6.setForeground(Color.BLACK);
        
        tf1 = new JTextField(15);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        
        tf1.setBackground(Color.WHITE);
        
        tf1.setBounds(350,360,200,30);
        add(tf1);
        tf2 = new JTextField(15);
       tf2.setFont(new Font("Arial", Font.BOLD, 14));
        tf2.setBackground(Color.WHITE);
        
        tf2.setBounds(350,420,200,30);
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
        l5.setBounds(200,40,450,200);
        add(l5);
        
        l2.setBounds(50,240,200,30);
        add(l2);
        l3.setBounds(50,300,250,30);
        add(l3);
        l4.setBounds(50,360,250,30);
        add(l4);
        l6.setBounds(50,420,250,30);
        add(l6);
        
        
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
        
      String bc = (String)B2.getSelectedItem();

        
                
               
            conn c1 = new conn();
                    
            try {
              
                 if(ae.getSource()==b1){
                ResultSet rs = c1.s.executeQuery(" SELECT PESTICIDE,MRP FROM PC Where CROP = '"+ac+"' and DISEASE='"+bc+"'");
                
                
                if(rs.next()){
                   
                String balance = rs.getString("PESTICIDE");
                String balance1 = rs.getString("MRP");
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
        new Fertilizer().setVisible(true);
}
}

