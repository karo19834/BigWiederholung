package Exercises6;

public class FindeKleinsteZahl {
    public static void main(String[] args) {
        int[] werte = {2, 5, 67, 1, 89, 23, 4,};

        System.out.println(findeKleinsteZahl(werte));


    }

    public static int findeKleinsteZahl(int werte[]) {
        int temp = 0;
        for (int i = 0; i < werte.length; i++) {
            for (int j = i + 1; j < werte.length; j++) {
                if (werte[i] > werte[j]) {
                    temp = werte[i];
                    werte[i] = werte[j];
                    werte[j] = temp;
                }
            }
        }
        return werte[0];

    }

}

