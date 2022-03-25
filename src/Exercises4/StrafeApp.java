package Exercises4;

public class StrafeApp {
    public static void main(String[] args) {
        Strafe abc = new Strafe();
        abc.anzahlStrafen = 0;
        abc.strafe = 0;

        abc.strafe(67);
        System.out.println(abc.strafe + " " + abc.anzahlStrafen);
        abc.verbandspaket();
        System.out.println(abc.strafe + " " + abc.anzahlStrafen);
        abc.alkohol(1.2);
        System.out.println((abc.strafe + " " + abc.anzahlStrafen));
        abc.sonstiges(34.7);
        System.out.println(abc.strafe + " " + abc.anzahlStrafen);
        System.out.println("Deine Strafe: " + abc.getStrafe() + "€ \t Anzahl deiner Strafen: " + abc.anzahlStrafen);
    }
}

