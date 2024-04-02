/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curd.helper;

import java.sql.*;

/**
 *
 * @author HP
 */
public class helper {

    private static Connection con;

    public static Connection giveConnection( ) {
            
        try{
            if(con==null){
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/curd", "root", "root");
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
    
       
    
}
