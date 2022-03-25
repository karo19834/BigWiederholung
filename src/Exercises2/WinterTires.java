package Exercises2;

public class WinterTires {
    public static void main(String[] args) {

        int temperature = 5;
        boolean slipperyRoad = true;

         if ( needWinterTires(temperature,slipperyRoad)){
        System.out.println(" Need winter tires." );
         }else {
             System.out.println( " Don't need winter tires. ");
         }

    }

    public static boolean needWinterTires (int temperature, boolean slipperyRoad) {
        if ( (temperature < 4)||(temperature < 10 && slipperyRoad ) ) {
            return true;
        } else {
            return false;
        }

    }

}
