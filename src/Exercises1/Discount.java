package Exercises1;

public class Discount {
    public static void main(String[] args) {
        boolean senior= true;
        boolean dog = false;
        boolean student = false;
        System.out.println( "Bus discount: "+ (senior || dog || student));

        int fictionBook=0;
        int nonFictionBook=4;

        System.out.println( "Book discount: "+( ( nonFictionBook> 2)&& ( fictionBook>0)));

        int alcoholicDrink=0;
        int nonAlcoholicDrink=1;

        System.out.println( "Discount for drinks: "+ ((alcoholicDrink <1)&& (nonAlcoholicDrink>0)));

    }
}
