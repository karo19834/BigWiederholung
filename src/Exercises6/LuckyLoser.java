package Exercises6;

import java.util.Arrays;

public class LuckyLoser {
    public static void main(String[] args) {

        String[] looser1 = new String[]{"Berta", "Kamil", "Viktoria", " Ula"};
        String[] looser2 = new String[]{"Viktoria", "Barbara", "Kamil", "Berta", "Simon", "Dana"};

        System.out.println(Arrays.toString(luckyLooser(looser1, looser2)));

    }
    public static String[] luckyLooser(String[] looser1, String[] looser2) {
        //welches array ist größer:
        int biggestLength;
        if (looser1.length >= looser2.length) {
            biggestLength = looser1.length;
        } else {
            biggestLength = looser2.length;
        }
        String[] trostpreisGewinner = new String[biggestLength];

        //trostpreis ermitteln, vergleichen der Strings
        for (int i = 0; i < looser1.length; i++) {
            for (int j = 0; j < looser2.length; j++) {
                if (looser1[i].equals(looser2[j])) {
                    trostpreisGewinner[i] = looser1[i];
                }
            }
        }
        return trostpreisGewinner;
    }
}
