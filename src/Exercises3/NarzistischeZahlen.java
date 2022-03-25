package Exercises3;

public class NarzistischeZahlen {
    public static void main(String[] args) {


        narzistischeZahlBerechnen();


    }

    public static void narzistischeZahlBerechnen (){
        for ( int i =0; i<=1000;i++){
            if(i == (Math.pow(i % 10, 3)) + (Math.pow(i % 100 / 10, 3)) + (Math.pow(i / 100, 3))) {
                System.out.println(i);
            }
        }
    }
}
