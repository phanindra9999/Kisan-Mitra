
package com.mycompany.kisanmitr;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class login extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,s;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3,b4;
    
  
    login(){
         
        
       
        
        setFont(new Font("System", Font.BOLD, 22));
       
        setTitle("KISAN MITR");
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Veerender Goud\\Documents\\NetBeansProjects\\Kisanmitr\\src\\main\\java\\com\\mycompany\\kisanmitr\\icons\\agri.jpeg")));
       
       
        
        
        
        l1 = new JLabel("WELCOME TO KISAN MITR");
        l1.setFont(new Font("Osward", Font.BOLD, 28));
        l1.setForeground(Color.WHITE);
        
        l2 = new JLabel("NUMBER:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setForeground(Color.WHITE);
        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setForeground(Color.WHITE);
        s = new JLabel("For any queries please contact:kisanmitr5@gmail.com");
        s.setFont(new Font("Raleway", Font.BOLD, 15));
        s.setForeground(Color.WHITE);
       s.setBounds(200,550,600,30);
       add(s);
        
        b4=new JButton("forgot password ?");
        b4.setBackground(Color.black);
        b4.setForeground(Color.WHITE);
         
         
     
        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);
        
        b1 = new JButton("LOGIN IN");
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.black);
        b3.setForeground(Color.WHITE);
      
        
        setLayout(null);
        
        l1.setBounds(175,50,450,200);
        add(l1);
        
        l2.setBounds(125,150,375,200);
        add(l2);
        
        tf1.setBounds(300,235,230,30);
        add(tf1);
        
        l3.setBounds(125,225,375,200);
        add(l3);
        
        
        
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        
        
       
        
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,310,230,30);
        add(pf2);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300,400,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,400,100,30);
        add(b2);
        
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300,450,230,30);
        add(b3);
       
         b4.setFont(new Font("Arial", Font.BOLD, 14));
        b4.setBounds(300,500,230,30);
        add(b4);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        
        getContentPane().setBackground(Color.ORANGE);
        
        setSize(750,750);
        setLocation(500,200);
        setVisible(true);
        

        
    }
    public void actionPerformed(ActionEvent ae){
       
        try{        
            conn c1 = new conn();
            String a  = tf1.getText();
            String b  = pf2.getText();
            String q  = "select * from login where gmail = '"+a+"' and password=md5('"+b+"')";
            ResultSet rs = c1.s.executeQuery(q);
            
            if(ae.getSource()==b1){
                if(rs.next()){
                    
                    new MENU().setVisible(true); 
                    setVisible(false);
                
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Password");
                    
                }
            }else if(ae.getSource()==b2){
                tf1.setText("");
                pf2.setText("");
            
            }
            else if(ae.getSource()==b3){
                new Signup().setVisible(true);
                setVisible(false);}
            else if(ae.getSource()==b4)
            {
                new pin().setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("error: "+e);
        }
            
    }
    
    
    public static void main(String[] args){
        new login().setVisible(true);
    }

    
}
