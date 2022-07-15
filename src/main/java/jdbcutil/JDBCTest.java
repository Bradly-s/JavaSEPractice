package jdbcutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
    public static void main(String[] args) throws Exception {
        //1. 获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/cargo_db";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        //2. 定义sql
        String sql = "select * from cargo";
        //3. 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //4. 执行sql
        ResultSet rs = stmt.executeQuery(sql);
        //5. 处理结果
//        System.out.println(rs.next());
        while(rs.next()){
            System.out.println("name:" +  rs.getString("name") + "  " +
                                "位置：" + rs.getString("location"));
        }

        //6. 释放资源
        stmt.close();
        conn.close();
    }
}
