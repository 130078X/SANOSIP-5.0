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
 * @author Madhavi Ruwandika
 */
public class employeeDA {
    
    public ResultSet getemployeeDetailsByUserID(String id) throws ClassNotFoundException, SQLException {
        
        Connection con = DB.getConnection();
        String query = "select * from employee where employee_id='" + id + "'";
        ResultSet rs = utilities.DB_handler.getData(con, query);
        return rs;
    }
    
     public ResultSet getemployeeDetailsByName(String Name) throws ClassNotFoundException, SQLException {
        
        Connection con = DB.getConnection();
        String query = "select * from employee where first_name='" + Name + "'";
        ResultSet rs = utilities.DB_handler.getData(con, query);
        return rs;
    }
     
     public int AddEmployee(model.employee emp,Date date) throws ClassNotFoundException, SQLException {
        Connection con = DB.getConnection();
        String query = "insert into employee values('" + emp.getFirstname() + "','" + emp.getLastname() + "','" + emp.getContact_no() + "','" + emp.getNIC() + "','" + emp.getGender() + "','"+ emp.getAcceesLevel()+"')";
        int spd = utilities.DB_handler.setData(con, query);
        return spd;
    }
     
    public ArrayList<String> getNamesInDB() throws ClassNotFoundException, SQLException{
        
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
    
    
}
