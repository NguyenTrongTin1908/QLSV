/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Keyer
 */
public class StudentModify {

    public static List<Student> findAll() {
        
        List<Student> Listsv =new ArrayList<>(); 
        Connection conn = null;
        Statement stm = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            
            //query
            String sql="select * from student";
            stm = conn.createStatement();
            ResultSet result = stm.executeQuery(sql);
            while (result.next()){
            Student sv= new Student(result.getInt("id"),result.getString("fullname"),result.getString("gender"),result.getInt("age"),result.getString("email"),result.getString("phone_number"));
            Listsv.add(sv);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(stm !=null)
            {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        
    return Listsv;
        
    }
    
    
    public static void insert(Student sv){
        
        Connection conn = null;
        PreparedStatement pre_stm = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            
            //query
            String sql="insert into student(fullname, gender,age,email,phone_number) values(?,?,?,?,?)";
            pre_stm=conn.prepareCall(sql);
            pre_stm.setString(1,sv.getFullname());
            pre_stm.setString(2,sv.getGender());
            pre_stm.setInt(3,sv.getAge());
            pre_stm.setString(4,sv.getEmail());
            pre_stm.setString(5,sv.getPhone());
            
            pre_stm.execute();

         

            
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(pre_stm !=null)
            {
                try {
                    pre_stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        
    
        
    }
    
    
    public static void update(Student sv){
        
        Connection conn = null;
        PreparedStatement pre_stm = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            
            //query
            String sql="update student set fullname=?,gender=? ,age=?,email=?,phone_number=? where id=?";
            pre_stm=conn.prepareCall(sql);
            
            pre_stm.setString(1,sv.getFullname());
            pre_stm.setString(2,sv.getGender());
            pre_stm.setInt(3,sv.getAge());
            pre_stm.setString(4,sv.getEmail());
            pre_stm.setString(5,sv.getPhone());
            pre_stm.setInt(6,sv.getId());
            
            pre_stm.execute();

         

            
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(pre_stm !=null)
            {
                try {
                    pre_stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        
    
        
    }
    
    
    
      public static void delete(int id){
        
        Connection conn = null;
        PreparedStatement pre_stm = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            
            //query
            String sql="delete from student where id=?";
            pre_stm=conn.prepareCall(sql);
            
           
            pre_stm.setInt(1,id);
            
            pre_stm.execute();

         

            
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(pre_stm !=null)
            {
                try {
                    pre_stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        
        
        

          
    }
      
      
       public static List<Student> findbyFullname(String fullname) {
        
        List<Student> Listsv =new ArrayList<>(); 
        Connection conn = null;
        PreparedStatement stm = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            
            //query
            String sql="select * from student where fullname like ?";
            
            stm = conn.prepareCall(sql);
            stm.setString(1,"%"+fullname+"%");
            
            
            ResultSet result = stm.executeQuery();
            while (result.next()){
            Student sv= new Student(result.getInt("id"),result.getString("fullname"),result.getString("gender"),result.getInt("age"),result.getString("email"),result.getString("phone_number"));
            Listsv.add(sv);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(stm !=null)
            {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        
    return Listsv;
        
    }
    
    

}
