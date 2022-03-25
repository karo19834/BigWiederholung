package Exercises7;

public class Quader {
    double lang;
    double hoch;
    double breit;

    public double volumen() {
        return lang * hoch * breit;
    }

    public double oberflaeche() {
        return (2 * lang * hoch) + (2 * hoch * breit) + (2 * lang * breit);
    }
    public double grundflaeche(){
        return lang* breit;
    }
    public void skaliere ( double faktor ){
        lang*= faktor;
        hoch *= faktor;
        breit *= faktor;
    }
}
