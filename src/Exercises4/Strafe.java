package Exercises4;

public class Strafe {
    String vorname;
    String nachname;
    String kennzeichen;
    int strafnummer;
    double strafe;
    int anzahlStrafen;

    public void strafe(int geschwindigkeitsueberschreitung) {
        if (geschwindigkeitsueberschreitung > 0 && geschwindigkeitsueberschreitung <= 20) {
            strafe = strafe + 30;
            anzahlStrafen = anzahlStrafen + 1;
        } else if (geschwindigkeitsueberschreitung > 20 && geschwindigkeitsueberschreitung <= 30) {
            strafe = strafe + 50;
            anzahlStrafen = anzahlStrafen + 1;
        } else if (geschwindigkeitsueberschreitung > 30 && geschwindigkeitsueberschreitung <= 50) {
            strafe = strafe + 100;
            anzahlStrafen = anzahlStrafen + 1;
        } else if (geschwindigkeitsueberschreitung > 50 && geschwindigkeitsueberschreitung <= 100) {
            strafe = strafe + 500;
            anzahlStrafen = anzahlStrafen + 1;
        } else if (geschwindigkeitsueberschreitung > 100) {
            strafe = strafe + 1500;
            anzahlStrafen = anzahlStrafen + 1;
        }
    }

    public void verbandspaket() {

        strafe = strafe + 25;
        anzahlStrafen = anzahlStrafen + 1;
    }


    public void alkohol(double promile) {
        if (promile >= 0.5 && promile <= 1.0) {
            strafe = strafe + 100;
            anzahlStrafen = anzahlStrafen + 2;
        } else if (promile > 1.0 && promile <= 2.0) {
            strafe = strafe + 400;
            anzahlStrafen = anzahlStrafen + 2;
        } else if (promile > 2.0 && promile <= 3.0) {
            strafe = strafe + 1000;
            anzahlStrafen = anzahlStrafen + 2;
        } else if (promile > 3.0) {
            strafe = strafe + 5000;
            anzahlStrafen = anzahlStrafen + 2;
        }
    }

    public void sonstiges(double wertSonst) {
        strafe = strafe + wertSonst;
        anzahlStrafen = anzahlStrafen + 1;

    }

    public double getStrafe() {
        double strafeNachRabatt = 0;
        if (anzahlStrafen == 1) {
            strafeNachRabatt = strafe * 0.7;
        } else if (anzahlStrafen == 2) {
            strafeNachRabatt = strafe * 0.8;
        } else if (anzahlStrafen == 3) {
            strafeNachRabatt = strafe * 0.9;
        } else if (anzahlStrafen >= 4) {
            strafeNachRabatt = strafe;
        }
        return strafeNachRabatt;
    }
}
