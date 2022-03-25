package Exercises3;

public class CalcFaculty {
    public static void main(String[] args) {

        System.out.println( calcFaculty( 7));

    }
    public static long calcFaculty( int value){
        long ergebnis=1;
        if ( value==0){
            return 1;
        }
        for ( int i=1; i<= value; ++i){
            ergebnis= ergebnis*i;
        }
        return ergebnis;
    }
}
