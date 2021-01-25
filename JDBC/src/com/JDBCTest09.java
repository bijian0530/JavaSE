package com;


import com.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 测试DBUtil
 * 测试模糊查询
 */

public class JDBCTest09 {
    public static void main(String[] args) {
        Connection conn =null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select ename from emp where ename like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"_A%");
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("ename"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }
    }
}
