package Exercises3;

public class StrassewnbahnApp {
    public static void main(String[] args) {
        wieLangeNoch( 5);

    }
    public static void wieLangeNoch ( int station){
        if ( station == 1){
            System.out.println(" Noch 20 Minuten!");
        }else if ( station==2){
            System.out.println( " Noch 16 Minuten!");
        }else if ( station==3){
            System.out.println( " Noch 15 Minuten!");
        }else if ( station ==4){
            System.out.println( " Noch 10 Minuten!");
        }else if ( station == 5){
            System.out.println( " Noch 3 Minuten");
        }else if( station ==6){
            System.out.println( " Du musst aussteigen!!!");
        }else{
            System.out.println( ( " Station versäumt!!!"));
        }
    }
}
