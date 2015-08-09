/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import utilities.DB;

/**
 *
 * @author Madhavi Ruwandika
 */
public class employeeDA {
    
    public ResultSet getemployeeDetailsByNIC(String NIC) throws ClassNotFoundException, SQLException {
        
        Connection con = DB.getConnection();
        String query = "select * from employee where nic ='" + NIC + "'";
        ResultSet rs = utilities.DB_handler.getData(con, query);
        return rs;
    }
    
     public ResultSet getemployeeDetailsByName(String Name) throws ClassNotFoundException, SQLException {
        
        Connection con = DB.getConnection();
        String query = "select * from employee where nic ='" + Name + "'";
        ResultSet rs = utilities.DB_handler.getData(con, query);
        return rs;
    }
     
     public int AddEmployee(model.employee emp,Date date) throws ClassNotFoundException, SQLException {
        Connection con = DB.getConnection();
        String query = "insert into employee values('" + emp.getFirstname() + "','" + emp.getLastname() + "','" + emp.getContact_no() + "','" + emp.getNIC() + "','" + emp.getGender() + "','"+ emp.getAcceesLevel()+"')";
        int spd = utilities.DB_handler.setData(con, query);
        return spd;
    }
     
    
    
}
