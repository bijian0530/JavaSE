package Test11_12;

public class Test04 {
    public static void main(String[] args) {
        String[] src ={"abc","qwe","asd"};
        String[] dest = new String[10];
        System.arraycopy(src,1,dest,0,2);
        for(int i = 0; i < dest.length; i++){
            System.out.println(dest[i]);
        }
    }
}
