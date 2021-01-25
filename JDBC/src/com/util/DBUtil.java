package com.util;

import java.sql.*;

public class DBUtil {
        private DBUtil(){
        }
        static {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    /**
     * 获取数据库连接对象
     * @return连接对象
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException{
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode"
                    ,"root","bj5201314...");
        }
    public static void close(Connection conn, Statement ps, ResultSet rs){
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
        }  if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
