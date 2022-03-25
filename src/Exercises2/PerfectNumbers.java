package Exercises2;

public class PerfectNumbers {
    public static void main(String[] args) {

        for ( int number=1; number<= 100000000; number++){
          if ( isPerfectNumber(number)){
              System.out.println( number + " is perfect number.");
          }
        }

    }public static boolean isPerfectNumber( int number){
        if ( number== getSumOfrealDivisors(number)){
            return true;
        }else{
            return false;
        }
    }
    public static int getSumOfrealDivisors ( int number){
        int sum=0;
        for ( int i=1; i<= number/2; i++){
            if ( number%i ==0){
            sum=sum+i;
            }
        }
        return sum;
    }
}
