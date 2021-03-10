/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMath;

import SQL.ClassTest;
import SQL.ConnectSQL;
import java.sql.SQLException;

/**
 *
 * @author nhand
 */
public class main {
    public static void main(String[] args) throws SQLException{
        ConnectSQL csql = new ConnectSQL();
        //String sql = "INSERT INTO ACCOUNT VALUES('hayko','hayko')";
        String sql = "DELETE FROM ACCOUNT WHERE USERNAME='hayko'";
        System.out.println(sql);
        System.out.println(csql.updateData(sql));
        //Them cai test nuwax xem nao
        System.out.println(ClassTest.Random(10));
        //Them lan 10:44
    }
}
