package Exercises2;

public class ArraySum {
    public static void main(String[] args) {
        int [] numbers= { 3,7,9,2,32};
        System.out.println( " Sume: "+ calculateSum(numbers));
    }
    public static int calculateSum ( int[]numbers){
        int sum=0;
        for ( int i=0; i< numbers.length; i++){
            sum= sum+ numbers[i];
        }
        return sum;
    }
}
