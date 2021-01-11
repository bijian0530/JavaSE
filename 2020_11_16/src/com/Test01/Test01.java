package com.Test01;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++){
            arr[i] = -1;
        }
        int index = 0;
        while(index <  arr.length){
            int num = random.nextInt(10);
            System.out.println("随机生成的数字:"+num);
            if(!contains(arr,num)){
                arr[index] = num;
                index++;
            }
        }
        for(int i=0; i <arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static boolean contains(int[] arr,int num){
        for(int i =0; i <arr.length; i++){
            if(arr[i] == num)
                return true;
        }
        return false;
    }
}
