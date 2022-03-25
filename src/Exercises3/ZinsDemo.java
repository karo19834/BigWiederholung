package Exercises3;

public class ZinsDemo {
    public static void main(String[] args) {
        double kontoStand = 584121;
        double zinsen = 2.25;
        System.out.println( zinsBerechnung(kontoStand, zinsen));

//        double zinsBerechnung = (kontoStand*zinsen)/100;
//        System.out.println( zinsBerechnung);
    }
    public static double zinsBerechnung ( double kontoStand, double zinsen){
        double zinsberechnung = (kontoStand*zinsen)/100;
        return zinsberechnung;
    }
}
