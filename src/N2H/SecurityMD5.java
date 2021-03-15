/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N2H;
import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author nhand
 */
public class SecurityMD5{
    public static String getMd5(String input){ 
        try { 
            // Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
  
            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        }  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    }
    
    
    public static boolean isTrue(String tk, String mk) throws SQLException{
        String db_url = "jdbc:sqlserver://localhost;databaseName=USER;user=sa;password=sa";
        Connection conn = DriverManager.getConnection(db_url);
        Statement stmt = conn.createStatement();
        String mk2 = SecurityMD5.getMd5(mk);
        String sql = "SELECT USERNAME, PASSWORD FROM ACCOUNT WHERE USERNAME='" + tk + "' AND PASSWORD='" + mk2 + "'";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            if(rs.getString("USERNAME").trim().equals(tk) && rs.getString("PASSWORD").trim().equals(mk2)){
                return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) throws SQLException {
        String db_url = "jdbc:sqlserver://localhost;databaseName=USER;user=sa;password=sa";
        Connection conn = DriverManager.getConnection(db_url);
        Statement stmt = conn.createStatement();
        Scanner sc = new Scanner(System.in);
        while(true){
//            System.out.printf("Username: ");
//            String tk = sc.nextLine();
//            System.out.printf("Password: ");
//            String mk = getMd5(sc.nextLine());
//            String sql = "INSERT INTO ACCOUNT VALUES('" + tk + "','" + mk + "')";
//            System.out.println("Update: " + stmt.executeUpdate(sql));
            System.out.printf("Username: ");
            String tk2 = sc.nextLine();
            System.out.printf("Password: ");
            String mk2 = sc.nextLine();
            if(isTrue(tk2,mk2)){
                System.out.println("login success");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
