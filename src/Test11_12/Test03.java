package Test11_12;

public class Test03 {
    public static void main(String[] args) {
        int[] src ={1,2,3,4,5,6};
        int[] dest= new int[10];
        System.arraycopy(src,1,dest,2,3);
        for(int i =0; i<src.length; i++){
            System.out.println(dest[i]);
        }
    }
}
