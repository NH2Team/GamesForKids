/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nhand
 */
public class ConnectSQL{
//    final String DB_URL = "jdbc:sqlserver://localhost;databaseName=USER;user=sa;password=sa";
//    Connection conn = DriverManager.getConnection(DB_URL);
//    Statement stmt = conn.createStatement();
//
//    public int updateData(String sql) throws SQLException {
//        conn = DriverManager.getConnection(DB_URL);
//        stmt = conn.createStatement();
//        return stmt.executeUpdate(sql);
//    }
//    
//    public ResultSet getData(String sql) throws SQLException{
//        return stmt.executeQuery(sql);
//    }
//    
//    
    public static void main(String[] args) throws SQLException{
        ConnectSQL csql = new ConnectSQL();
        String sql = "INSERT INTO ACCOUNT VALUES('hayko','hayko')";
        System.out.println(sql);
        //System.out.println(csql.updateData(sql));
        //Dang Test
    }
}
