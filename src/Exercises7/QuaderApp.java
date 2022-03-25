package Exercises7;

public class QuaderApp {
    public static void main(String[] args) {
        Quader q = new Quader();
        q.breit=2.3;
        q.lang =4.0;
        q.hoch =2.1;

        System.out.println( q.volumen( ));
        System.out.println( q.oberflaeche( ));
        System.out.println(q.grundflaeche());
        q.skaliere( 10);
        System.out.println(q.grundflaeche());
    }

    }

