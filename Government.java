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
public class Government extends JFrame implements ActionListener{
    JTable jt;
    
    JLabel l1,l2,l3,l5,l4,l6,l7,l8,s;
    JComboBox B1,B2;
    JTextField tf1,tf2;
    JPasswordField pf2;
    JButton b1,b2,b3;
  
    Government(){
         
        
       
        
        setFont(new Font("System", Font.BOLD, 22));
       
        setTitle("KISAN MITR");
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Veerender Goud\\Documents\\NetBeansProjects\\Kisanmitr\\src\\main\\java\\com\\mycompany\\kisanmitr\\icons\\v1.png")));
       
       
        
        
        
        l1 = new JLabel("GOVERNMENT SCHEMES");
        l1.setFont(new Font("Osward", Font.BOLD, 28));
        l1.setForeground(Color.BLUE);
      
        String bank[] = {"ANDRA PRADESH","ARUNACHAL PRADESH","ASSAM","BIHAR","CHATISSGARH","GOA","GUJARAT","HARYANA","HIMACHAL PRADESH","JAMMU AND KASHMIR","JHARKAND","KARNATAKE","KERELA","MADHYA PRADESH","MAHARASTRA","MANIPUR","MEGHALAYA","MIZORAM","NAGALAND","ORISSA","PUNJAB","RAJASTHAN","SIKKIM","TAMILNADU","TELANGANA","TRIPURA","UTTAR PRADESH","UTTARAKHAND","WEST BENGAL"};
        B1= new JComboBox(bank);
        B1.setBackground(Color.WHITE);
        
        B1.setBounds(350,240,200,30);
        add(B1);
        l2 = new JLabel("STATE:");
        l2.setFont(new Font("Osward", Font.BOLD, 25));
        l2.setForeground(Color.BLUE);
        
        l4 = new JLabel("SCHEMES:");
        l4.setFont(new Font("Osward", Font.BOLD, 25));
        l4.setForeground(Color.BLUE);
       s = new JLabel("For any queries please contact:kisanmitr5@gmail.com");
        s.setFont(new Font("Raleway", Font.BOLD, 15));
        s.setForeground(Color.BLACK);
       s.setBounds(200,550,600,30);
       add(s);
        
      
        tf2 = new JTextField(15);
       tf2.setFont(new Font("Arial", Font.BOLD, 14));
        tf2.setBackground(Color.WHITE);
        
        tf2.setBounds(100,350,500,30);
        add (tf2);
       
        
        
        b1 = new JButton("SHOW");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("BACK");
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        

        
        setLayout(null);
        
        l1.setBounds(150,0,450,200);
        add(l1);
       
        l2.setBounds(100,240,200,30);
        add(l2);
        l4.setBounds(100,300,250,30);
        add(l4);
       
        
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(200,500,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(450,500,100,30);
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
                ResultSet rs = c1.s.executeQuery(" SELECT SCHEMES FROM GS Where STATE  = '"+ac+"'");
                
                
                if(rs.next()){
                   
                String balance = rs.getString("SCHEMES");
                
                
                tf2.setText(balance);
                
               
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
        new Government().setVisible(true);
}
}


