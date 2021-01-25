package com;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JDBCTest02 {
    public static void main(String[] args) {
        //初始化一个界面
        Map<String,String> userinfo = initUI();
        //验真用户名和密码
        boolean loginSuccess = login(userinfo);
        System.out.println(loginSuccess ? "登陆成功" : "登陆失败");
    }

    /**
     * 用户登录
     * @param userLoginInfo  用户登录信息
     * @return  ture表示成功  flase 表示失败
     */
    private static boolean login(Map<String, String> userLoginInfo) {
        //JDBC代码
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        //单独定义变量
        String loginName = userLoginInfo.get("loginName");
        String loginPwd = userLoginInfo.get("loginPwd");
        //打标机
        boolean loginSuccess = false;
        try {
            //1 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2 获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root",
                    "bj5201314...");
            //3 获取预编译数据库操作对象
            String sql = "select * from t_user where loginName = ? and loginPwd = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,loginName);
            ps.setString(2,loginPwd);
            //4 执行sql
            rs  = ps.executeQuery();
            //5 处理结构集
            if(rs.next()){
                //登录成功
                loginSuccess = true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //6 释放资源
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
        return loginSuccess ;
    }

    /**
     * 初始化用户界面
     * @return用户输入的用户名和密码等登录信息
     */
    private static Map<String, String> initUI() {
        Scanner s = new Scanner(System.in);

        System.out.println("用户名");
        String loginName = s.nextLine();

        System.out.println("密码");
        String loginPwd = s.nextLine();

        Map<String,String> userLogininfo = new HashMap<>();
        userLogininfo.put("loginName",loginName);
        userLogininfo.put("loginPwd",loginPwd);

        return userLogininfo;
    }
}
