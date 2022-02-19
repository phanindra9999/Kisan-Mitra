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
public class MRP extends JFrame implements ActionListener{
    JTable jt;
    JLabel l1,l2,l3,l4,s;
    JComboBox B1;
    JTextField tf1,tf2;
    JPasswordField pf2;
    JButton b1,b2,b3;
  
    MRP(){
         
        
       
        
        setFont(new Font("System", Font.BOLD, 22));
       
        setTitle("KISAN MITR");
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Veerender Goud\\Documents\\NetBeansProjects\\Kisanmitr\\src\\main\\java\\com\\mycompany\\kisanmitr\\icons\\MSP1.png")));
       
       
        
        
        
        l1 = new JLabel("MINIMUM SUPPORT PRICE");
        l1.setFont(new Font("Osward", Font.BOLD, 28));
        l1.setForeground(Color.BLACK);
        
        String date[] = {"PADDY","JOWAR","BAJRA","MAIZE","RAGI","ARHAR","MOONG","URAD","COTTON","GROUNDNUT","SUNFLOWER","SOYABEAN","SESAMUM","NIGERSEED","WHEAT","BARLEY","GRAM","MASUR","MUSTARD","SAFFLOWER","TORIA","COPRA","COCONUT","JUTE"};
        B1= new JComboBox(date);
        B1.setBackground(Color.WHITE);
        
        B1.setBounds(350,240,200,30);
        add(B1);
        
         l2 = new JLabel("CROP:");
        l2.setFont(new Font("Osward", Font.BOLD, 28));
        l2.setForeground(Color.BLACK);
        l3 = new JLabel("MSP OF 100KG(2021):");
        l3.setFont(new Font("Osward", Font.BOLD, 18));
        l3.setForeground(Color.BLACK);
        l4 = new JLabel("MSP OF 100KG(2022)EST.:");
        l4.setFont(new Font("Osward", Font.BOLD, 18));
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
        
        tf2.setBounds(350,360,200,30);
        add(tf2);
        
        
        
        b1 = new JButton("SHOW");
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("BACK");
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        

        
        setLayout(null);
        
        l1.setBounds(175,50,450,200);
        add(l1);
        
        l2.setBounds(50,240,200,30);
        add(l2);
        l3.setBounds(50,300,200,30);
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
                ResultSet rs = c1.s.executeQuery(" SELECT CURRENT , EXPECT FROM MRP Where CROP  = '"+ac+"'");
                
                
                if(rs.next()){
                   
                String balance = rs.getString("CURRENT");
                String balance1 = rs.getString("EXPECT");
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
        new MRP().setVisible(true);
}
}

    


