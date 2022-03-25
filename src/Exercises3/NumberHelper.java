package Exercises3;

import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{{0, 1, 9}, {6, 3, 2}};

        System.out.println(Arrays.toString(getFlatArray(numbers)));

    }
    public static int[] getFlatArray(int[][] numbers) {
        int arrayLengthCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            arrayLengthCount += numbers[i].length;
        }

        int[] newArray = new int[arrayLengthCount];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                newArray[count] = numbers[i][j];
                count++;
            }
        }

        return newArray;
    }
}
