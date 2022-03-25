package Exercises7;

public class Rechteck {

    double hoehe;
    double laenge;


    public double flaeche() {

        return hoehe * laenge;
    }

    public double umfang() {
        return (2 * hoehe) + (2 * laenge);
    }

    public void skaliere(double factor) {
        laenge *= factor;
        hoehe *= factor;
    }
}
