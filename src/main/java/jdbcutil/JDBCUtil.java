package jdbcutil;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    public static Connection connection = null;

    /**
     * 获取数据库连接
     * */
    public static void getConnection() throws Exception {
        //加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/java/druid.properties"));
        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //获取数据库连接 Connection
//        Connection connection = dataSource.getConnection();
        connection = dataSource.getConnection();
//        System.out.println(connection);
    }

    /**
     * 关闭数据库连接
     * */
    public static void closeConnection(ResultSet rs, PreparedStatement pstmt, Connection connection) throws SQLException {
        if(null != rs){
            rs.close();
        }
        pstmt.close();
        connection.close();
    }

    /**
     * 通用单条查询
     * */
    public static void listObjects(String sql) throws Exception {
        //获取连接
        getConnection();

        //获取pstmt对象
        PreparedStatement pstmt = connection.prepareStatement(sql);
        //执行SQL
        ResultSet rs = pstmt.executeQuery();

        //处理结果
        while(rs.next()){
            System.out.println("name:" +  rs.getString("name") + "  " +
                    "位置：" + rs.getString("location"));
        }

        //释放资源
        closeConnection(rs, pstmt, connection);
    }

    /**
     * 通用增加
     * */
    public static void add(String sql) throws Exception {
        //获取连接
        getConnection();

        //获取pstmt对象
        PreparedStatement pstmt = connection.prepareStatement(sql);

        String name = "大白菜";
        String location = "货架2";
        String introduction = "新鲜的大白菜";

        //4. 设置参数
        pstmt.setString(1,name);
        pstmt.setString(2,location);
        pstmt.setString(3,introduction);

        //处理结果
        int count = pstmt.executeUpdate();
        System.out.println("插入数据成功：" + count + "条");

        //释放资源
        closeConnection(null, pstmt, connection);
    }

    public static void main(String[] args) throws Exception {

        String sql = "select * from cargo";
        listObjects(sql);

        String sqlAdd = "insert into cargo (name, location, introduction) values(?,?,?);";
        add(sqlAdd);

    }
}


