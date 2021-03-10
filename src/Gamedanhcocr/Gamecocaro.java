/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gamedanhcocr;

import SQL.ConnectSQL;
import java.sql.SQLException;

/**
 *
 * @author Hai
 */
public class Gamecocaro {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello Nhan");
        ConnectSQL csql = new ConnectSQL();
        String sql = "INSERT INTO ACCOUNT VALUES('hayko','hayko')";
        System.out.println(sql);
        System.out.println(csql.updateData(sql));
    }
    
    
}
