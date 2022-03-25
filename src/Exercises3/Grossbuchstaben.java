package Exercises3;

public class Grossbuchstaben {
    public static void main(String[] args) {

        String satz1 = " wie geht es dir?";
        String satz2 = " alles gut danke";

        System.out.println(woerterMitGroesseBuchstaben(satz1));
        System.out.println(woerterMitGroesseBuchstaben(satz2));

    }
    public static String woerterMitGroesseBuchstaben ( String satz){
        String nachher= " ";
        for ( int i=0; i< satz.length(); i++){
            if ( satz.charAt(i)== ' '){
                nachher = nachher+ " "+ Character.toUpperCase( satz.charAt(i+1));
                i++;
            }else {
                nachher = nachher + satz.charAt(i);
            }
        }
        return nachher;
    }
}
