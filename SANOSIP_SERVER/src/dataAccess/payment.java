/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;

import utilities.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nilanga
 */
public class payment {

    //edit table names of both methods
    public ResultSet getPaymentDetails(int student_id) throws ClassNotFoundException, SQLException {
        
        Connection con = DB.getConnection();
        String query = "select * from monthlyPayment where stud_id='" + student_id + "'";
        ResultSet rs = utilities.DB_handler.getData(con, query);
        return rs;
    }

    public int makePayment(model.payment monthlypayment) throws ClassNotFoundException, SQLException {
        Connection con = DB.getConnection();
        String query = "insert into monthlypayment values('" + monthlypayment.getPaymentID() + "','" + monthlypayment.getStudentID() + "','" + monthlypayment.getMonth() + "','" + monthlypayment.getAmount() + "','" + monthlypayment.getDate() + "')";
        int spd = utilities.DB_handler.setData(con, query);
        return spd;
    }

    public int deletePayment(int payment_id) throws ClassNotFoundException, SQLException {
        Connection con = DB.getConnection();
        String query = "delete * from monthlyPayment where stud_id='" + payment_id + "'";
        int spd = utilities.DB_handler.setData(con, query);
        return spd;
    }
}
