/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author JOHAN
 */
public class Database {
    Connection conn;
        public Database(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mymarket",
                "root",
                ""
                );
            }catch(Exception e){
               System.out.println("connection database error");
            }
        }
}
