
package com.mycompany.kisanmitr;




import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MENU extends JFrame implements ActionListener{

    JLabel l1,s;
    JButton b1,b2,b3,b4,b5,b6,b7;
    
    MENU(){
        
        setFont(new Font("System", Font.BOLD, 22));
      
        setTitle("KISANMITR");
    setContentPane(new JLabel(new ImageIcon("C:\\Users\\Veerender Goud\\Documents\\NetBeansProjects\\Kisanmitr\\src\\main\\java\\com\\mycompany\\kisanmitr\\icons\\me.jpg")));
       
        l1 = new JLabel("MENU");
        l1.setFont(new Font("System", Font.BOLD, 38));
        l1.setForeground(Color.white);
        s = new JLabel("For any queries please contact:kisanmitr5@gmail.com");
        s.setFont(new Font("Raleway", Font.BOLD, 15));
        s.setForeground(Color.WHITE);
       s.setBounds(200,550,600,30);
       add(s);
    
       
        b1 = new JButton("Soil");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("PESTICIDES");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("MSP");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.black);
        b3.setForeground(Color.WHITE);
        
        b4 = new JButton("Crop loan");
        b4.setFont(new Font("System", Font.BOLD, 18));
        b4.setBackground(Color.black);
        b4.setForeground(Color.WHITE);
        
        b5 = new JButton("Government Schemes");
        b5.setFont(new Font("System", Font.BOLD, 18));
        b5.setBackground(Color.black);
        b5.setForeground(Color.WHITE);
        
      
        
        b6 = new JButton("EXIT");
        b6.setFont(new Font("System", Font.BOLD, 18));
        b6.setBackground(Color.black);
        b6.setForeground(Color.white);
        
        
        setLayout(null);
        
        l1.setBounds(340,100,700,40);
        add(l1);
        
        b1.setBounds(40,250,300,60);
        add(b1);
        
        b2.setBounds(440,250,300,60);
        add(b2);
        
        b3.setBounds(40,360,300,60);
        add(b3);
        
        b4.setBounds(440,360,300,60);
        add(b4);
        
        b5.setBounds(240,470,300,60);
        add(b5);
        
       
        
        b6.setBounds(240,600,300,60);
        add(b6);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
       
        
        
        getContentPane().setBackground(Color.ORANGE);
        
        setSize(800,800);
        setLocation(500,90);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){ 
            
            new Soil().setVisible(true);
            setVisible(false);
            
        }
        else if(ae.getSource()==b2){ 
            
            new Fertilizer().setVisible(true);
            setVisible(false);
            
        }
        else if(ae.getSource()==b3){ 
            
            new MRP().setVisible(true);
            setVisible(false);
            
        }else if(ae.getSource()==b4){ 
            
            new Croploan().setVisible(true);
            setVisible(false);
            
        }else if(ae.getSource()==b5){ 
            
            new Government().setVisible(true);
            setVisible(false);
            
        
         }else if(ae.getSource()==b6){ 
            
            System.exit(0);
            
        }
        
            
        
        
    }
    
    public static void main(String[] args){
        new MENU().setVisible(true);
    }
}
