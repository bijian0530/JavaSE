package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * DBMS只要执行任意一次DMl语句，就提交一次。
 */
public class JDBCTest06 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode",
                    "root","bj5201314...");
            //获取预编译的数据库操作对象
            String sql = "update dept set dname = ? where deptno =  ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"x部门");
            ps.setInt(2,30);
            int count = ps.executeUpdate();
            System.out.println(count);

            //重新给占位符传值
            ps.setString(1,"y部门");
            ps.setInt(2,20);
            count = ps.executeUpdate();
            System.out.println(count);
            //执行sql

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //释放资源
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }
}
