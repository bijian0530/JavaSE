package Test11_11;

public class Test02 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("输入两个参数");
            return;
        }
        String username = args[0];
        String password = args[1];
        if(username.equals("admin") && password.equals("123456")){
            System.out.println("登录成功，欢迎["+username+"]回来");
            System.out.println("请你接着使用该系统");
            }
        else{
            System.out.println("用户账号或密码输入错误");
        }
    }
}
