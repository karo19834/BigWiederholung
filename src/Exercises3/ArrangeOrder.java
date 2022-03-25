package Exercises3;

import java.util.Arrays;

public class ArrangeOrder {
    public static void main(String[] args) {
        int[] numbers = new int[]{8, 5, 1, 9, 0, 4,6,2};

        arrangeOrder(numbers);
        System.out.println(Arrays.toString(numbers));

    }
    public static void arrangeOrder(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i+1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > numbers[i + 1]) {
                arrangeOrder(numbers);
            }
        }
    }
}
