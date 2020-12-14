package Test11_12;

public class Test05 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        printArray(a);
        printArray(new int[][]{{111111},{666666}});
    }
    public static void printArray(int[][] a){
        for(int i = 0; i< a.length; i++){
            for(int j =0; j < a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

