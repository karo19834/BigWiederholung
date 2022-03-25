package Exercises6;

import java.util.Arrays;

public class SmartphoneSales {
    public static void main(String[] args) {

        int[][] sm = {{1, 50},{3, 30},{2, 10},{1, 40}};
        int[][] sales = smartphoneSales(sm);
        for (int[] s : sales) {
            System.out.println(Arrays.toString(s));
        }
    }


    public static int[][] smartphoneSales(int [][]sales){
        int [][] sums = new int[10][2];

        for(int z = 0; z < sales.length; ++z){
            sums[sales[z][0]-1][0] = sales[z][0];
            sums[sales[z][0]-1][1] += sales[z][1];
        }
        return sums;
    }
}
