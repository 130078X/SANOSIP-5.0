/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nilanga
 */
public class DB_handler {

    public static int setData(Connection con, String query) throws SQLException {
        PreparedStatement p = con.prepareStatement(query);
        int pstm = p.executeUpdate();
        p.close();
        return pstm;
    }

    public static ResultSet getData(Connection con, String query) throws SQLException {
        ResultSet r = con.createStatement().executeQuery(query);
        return r;
    }
}
