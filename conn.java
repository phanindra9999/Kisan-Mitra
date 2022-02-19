
package com.mycompany.kisanmitr;

import java.sql.*;


public class conn {
    Connection i;
    Statement s;
    public conn()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            i=DriverManager.getConnection("jdbc:mysql:///kisanmitr","root","");
            s=i.createStatement();
            }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

   
 

    
}

