package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mytest2_18 {
    public static void main (String[] args){
        String url="jdbc:MySQL://localhost:3306/homework?useUnicode=true&characterEcoding=utf8";
        String username="root";
        String password="123456";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            pstmt = con.prepareStatement("insert into student(Sname,Ssex,Sage,Sdept) values ('ll',2,1,'土木工程')");
            int i = pstmt.executeUpdate();
            System.out.println(i);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
