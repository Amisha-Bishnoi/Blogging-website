
package com.helper;
import java.sql.*;


public class ConnectionProvider {
    private static Connection con;
    public static Connection getConnection(){
    try{
        
        if(con==null){
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject","root","12345678");
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return con;
    }
}
