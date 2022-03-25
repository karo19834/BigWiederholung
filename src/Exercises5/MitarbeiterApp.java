package Exercises5;

public class MitarbeiterApp {
    public static void main(String[] args) {
        Mitarbeiter klaus = new Mitarbeiter();

        klaus.gehalt = 2300;
        System.out.println( klaus.jahresAbrechnung());
        System.out.println( klaus.monatsAbrechnung());
    }
}
