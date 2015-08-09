/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Wiranji Dinelka
 */
public interface studentController {
     public ResultSet getStudentDetails(String StudentID) throws ClassNotFoundException, SQLException;
     public ResultSet getStudentDetailsByName(String Name) throws ClassNotFoundException, SQLException;
     public int AddStudent(model.student stu,Date date) throws ClassNotFoundException, SQLException;
    //public ArrayList<String> getNamesInDB() throws ClassNotFoundException, SQLException;
}
