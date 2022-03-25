package Exercises7;

public class RechteckApp {
    public static void main(String[] args) {
        Rechteck a = new Rechteck();
        a.laenge = 45.0;
        a.hoehe = 32.0;

        System.out.println(a.flaeche());
        System.out.println(a.umfang());
        a.skaliere(0.5);
        System.out.println(a.flaeche());

    }
    }

