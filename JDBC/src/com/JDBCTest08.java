package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 设置自动提交机制
 */
public class JDBCTest08 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode",
                    "root","bj5201314...");
            conn.setAutoCommit(false);
            //获取预编译的数据库操作对象
            String sql = "update t_act set balance = ? where actno = ?";
            ps = conn.prepareStatement(sql);
            //给？传值
            ps.setDouble(1,10000);
            ps.setInt(2,111);
            int count = ps.executeUpdate();

            //给？传值
            ps.setDouble(1,10000);
            ps.setInt(2,222);
            count += ps.executeUpdate();
            System.out.println(count ==2 ? "转账成功" : "转账失败");

            //程序就能够走到这里，说明以上程序没有异常，事务结束，手动提交数据。
            conn.commit();
        } catch (ClassNotFoundException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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
