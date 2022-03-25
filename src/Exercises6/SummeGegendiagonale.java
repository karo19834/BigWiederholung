package Exercises6;

public class SummeGegendiagonale {
    public static void main(String[] args) {
        int[][] diagonale = {{5, 8, 2, 6},
                {8, 5, 3, 1},
                {5, 7, 3, 1},
                {1, 9, 6, 3}};

        System.out.println(summeGegendiagonale(diagonale));

    }
    public static int summeGegendiagonale(int[][] diagonale) {
        int summe = 0;
        for (int zeile = 0; zeile < diagonale.length; zeile++) {
            summe += diagonale[zeile][diagonale[zeile].length - 1 - zeile];
        }
        return summe;
    }

}
