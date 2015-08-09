/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.rmi.Remote;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
/**
 *
 * @author Madhavi Ruwandika
 */
public interface employeeControler extends Remote{
    
    public ResultSet getemployeeDetailsByNIC(String NIC) throws ClassNotFoundException, SQLException ;
    public ResultSet getemployeeDetailsByName(String Name) throws ClassNotFoundException, SQLException;
    public int AddEmployee(model.employee emp,Date date) throws ClassNotFoundException, SQLException;
    
}
