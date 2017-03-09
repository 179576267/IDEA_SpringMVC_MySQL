package com.wzf;
import java.sql.*;

public class JDBCTest {

    public static void main(String[] args){

        // 驱动程序名
        String driver = "wzf.mysql.jdbc.Driver";

        // URL指向要访问的数据库名scutcs
        String url = "jdbc:mysql://127.0.0.1:3306/wzf";

        // MySQL配置时的用户名
        String user = "root";

        // MySQL配置时的密码
        String password = "wzf";

        try {
            // 加载驱动程序
            Class.forName(driver);

            // 连续数据库
            Connection conn = DriverManager.getConnection(url, user, password);

            if(!conn.isClosed())
                System.out.println("Succeeded connecting to the Database!");

            // statement用来执行SQL语句
            Statement statement = conn.createStatement();
            String addSql = "insert user (name, age, sex) values ("+ System.currentTimeMillis()%10000 +",10 ,2)";
            statement.execute(addSql);
            // 要执行的SQL语句
            String sql = "select * from USER ";

            // 结果集
            ResultSet rs = statement.executeQuery(sql);

            System.out.println("-----------------");
            System.out.println("执行结果如下所示:");
            System.out.println("-----------------");
            System.out.println(" 姓名" + "\t" + " 年龄" + "\t" + "性别");
            System.out.println("-----------------");
            String name = null;
            while(rs.next()) {
                // 选择sname这列数据
                name = rs.getString("name");
                // 输出结果
                System.out.println(name + "\t" + rs.getInt("age") + "\t" + rs.getInt("sex"));
            }

            rs.close();
            conn.close();
        } catch(ClassNotFoundException e) {
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
