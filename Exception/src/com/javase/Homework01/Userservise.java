package com.javase.Homework01;

public class Userservise {
    public void register(String username,String password) throws IlleagalNameException {
        if(null == username || username.length() < 6 || username.length() > 14){
            throw new IlleagalNameException("用户名不合法，长度必须设置在6-14之间");
        }
        System.out.println("注册成功，欢迎【"+username+"】");
    }
}
