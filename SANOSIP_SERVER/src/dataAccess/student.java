/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import utilities.DB;

/**
 *
 * @author Wiranji Dinelka
 */
public class student {
     public int AddStudent(model.student stu,Date date) throws ClassNotFoundException, SQLException {
        Connection con = DB.getConnection();
        String query = "insert into student values('" + stu.getFirstName()+ "','" + stu.getLastName() + "','" + stu.getAddress() + "','" + stu.getSchool()+ "','" + stu.getDate() + "','"+ stu.getAlYear()+"','"+ stu.getGender()+"','"+ stu.getNic()+"','"+ stu.getContactNo()+"','"+ stu.getGurName()+"','"+ stu.getGurContactNo()+"')";
        int spd = utilities.DB_handler.setData(con, query);
        return spd;
    }
     public ResultSet getStudentDetails(String StudentID) throws ClassNotFoundException, SQLException {
        
        Connection con = DB.getConnection();
        String query = "select * from student where student_id='" + StudentID + "'";
        ResultSet rs = utilities.DB_handler.getData(con, query);
        return rs;
    }
     public ResultSet getStudentDetailsByName(String Name) throws ClassNotFoundException, SQLException
     {
        Connection con = DB.getConnection();
        String query = "select * from student where first_name='" + Name + "'";
        ResultSet rs = utilities.DB_handler.getData(con, query);
        return rs;
     }
     public ArrayList<String> getNamesInDB() throws ClassNotFoundException, SQLException
     {
        
        Connection con = DB.getConnection();
        String query = "select * from employee ";
        ResultSet rs = utilities.DB_handler.getData(con, query);
        
        ArrayList<String> values = new ArrayList<String>();
        
        while(!rs.next()){
           String name = rs.getObject(1).toString()+" "+rs.getObject(2).toString();
           values.add(name);
        } 
        return values; 
    }
    public int DeleteStudent(int student_id) throws ClassNotFoundException, SQLException
    {
        Connection con = DB.getConnection();
        String query = "delete * from monthlyPayment where stud_id='" + student_id + "'";
        int spd = utilities.DB_handler.setData(con, query);
        return spd;
    }
    
}
