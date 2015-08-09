/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilities.DB;

/**
 *
 * @author Wiranji Dinelka
 */
public class student {
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
    
    
}
