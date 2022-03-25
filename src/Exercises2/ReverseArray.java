package Exercises2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] original = { 1,2,3,4};
        int []after= reverse(original)  ;
        System.out.println(Arrays.toString( original)+ Arrays.toString( after));
    }


    public static int [] reverse ( int[]original){
        int[]newOrder = new int[original.length];
        for ( int i= original.length-1; i >=0;i--){
            newOrder[original.length-1-i]= original[i];
        }
        return newOrder;
    }
}
