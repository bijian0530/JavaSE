package com;

import java.sql.*;
import java.util.Scanner;

/**
 * PrepareStatement 不可以 字符串的拼接
 */

public class JDBCTest03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入des表示降序，输入asc表示升序");
        System.out.print("请输入");
        String keyWords = s.nextLine();

        //执行JDBC
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root",
                    "bj5201314...");
            //获取预编译对象
            String sql = "select ename from emp order by ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,keyWords);
            //执行SQL
            rs = ps.executeQuery();
            //遍历结果集
            while(rs.next()){
                System.out.println(rs.getString("ename"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
