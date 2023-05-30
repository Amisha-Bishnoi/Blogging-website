
package com.dao;
import com.entities.user;
import java.sql.*;

public class UserDao {
    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }
    
    //method to insert user to database
    public boolean saveUser(user user){
        
        
         boolean f=false;
        try{
         //user-->database
         
         String query="insert into user(name,email,password,gender,about) values(?,?,?,?,?)";
         
         PreparedStatement pstmt=con.prepareStatement(query);
         pstmt.setString(1, user.getName());
         pstmt.setString(2, user.getEmail());
         pstmt.setString(3, user.getPassword());
         pstmt.setString(4,user.getGender());
         pstmt.setString(5,user.getAbout());
         
         
         pstmt.executeUpdate();
         f=true;
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return f;
    }
    
    // get user by user email and password
    
    public user getUserByEmailAndPassword(String email,String password){
        user user=null;
        
        try{
            String query="select * from user where email=? and password=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            
            ResultSet set=pstmt.executeQuery();
            
            if(set.next()){
            user=new user();
            
            //data from db
            String name=set.getString("name");
            
            //set to user object
            user.setName(name);
            
            user.setId(set.getInt("id"));
            user.setEmail(set.getString("email"));
            user.setPassword(set.getString("password"));
            user.setGender(set.getString("gender"));
            user.setAbout(set.getString("about"));
            user.setDateTime(set.getTimestamp("rdate"));
             user.setProfile(set.getString("profile"));
            }
        
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return user;
    }
    
    //update user details
    public boolean updateUser(user user){
        boolean f=false;
       try{
       String query="update user set name=?,email=?,password=?,about=?,gender=?,profile=? where id=?";
       
      PreparedStatement pstmt=con.prepareStatement(query);
      
      pstmt.setString(1, user.getName());
      pstmt.setString(2, user.getEmail());
      pstmt.setString(3, user.getPassword());
      pstmt.setString(4, user.getAbout());
      pstmt.setString(5, user.getGender());
      pstmt.setString(6, user.getProfile());
      pstmt.setInt(7, user.getId());
      
      pstmt.executeUpdate();
      f=true;
      
       }
       catch(Exception e){
           e.printStackTrace();
       }
       
       return f;
    }
    
    public user getUserByUserId( int userId){
    user user=null;
    
    try{
    String q="Select * from user where id=?";
    PreparedStatement pst=con.prepareStatement(q);
    
    pst.setInt(1,userId);
    
    ResultSet set=pst.executeQuery();
    
    if(set.next()){
    
    user=new user();
            
            //data from db
            String name=set.getString("name");
            
            //set to user object
            user.setName(name);
            
            user.setId(set.getInt("id"));
            user.setEmail(set.getString("email"));
            user.setPassword(set.getString("password"));
            user.setGender(set.getString("gender"));
            user.setAbout(set.getString("about"));
            user.setDateTime(set.getTimestamp("rdate"));
             user.setProfile(set.getString("profile"));
    }
    
    }
    catch(Exception e){
    e.printStackTrace();
    }
    
    
    return user;
    }
}
