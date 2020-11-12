package Test11_11;

public class Test01 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
       printArray(x);
        String[] str = {"abc","asd","qwe"};
        printrray(str);
    }
    public static void printArray(int[] array){
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
    }
    }
    public static void  printrray(String[] args){
        for(int i = 0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
}

