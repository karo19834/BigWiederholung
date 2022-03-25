package Exercises7;

import java.util.Arrays;

public class RezeptApp {
    public static void main(String[] args) {
        String[] z = {"Mehl", "Butter", "Ziegenkäse", "Milch"};
        double[][] zz = {{100, 0.5}, {50, 1.0}, {200, 3.0}, {1000, 1.2}};

        Rezept lecker = new Rezept();

        lecker.anzahlPersonen = 4;
        lecker.zutatenName = z;
        lecker.zutatenMengeUndPreis = zz;

        System.out.println("Allergisch: " + lecker.allergisch("Salami"));
        System.out.println("Allergisch: " + lecker.allergisch("Ziegenkäse"));
        System.out.println("****************");

        System.out.println(lecker.kostet());
        System.out.println(lecker.kostetProPerson());

        System.out.println("*********************");

        lecker.aenderePersonen(8);
        System.out.println(Arrays.toString(lecker.zutatenMengeUndPreis[0]));
        System.out.println(Arrays.toString(lecker.zutatenMengeUndPreis[1]));
        System.out.println(Arrays.toString(lecker.zutatenMengeUndPreis[2]));
        System.out.println(Arrays.toString(lecker.zutatenMengeUndPreis[3]));

        System.out.println("***********************");

        lecker.laktoseFrei();
        System.out.println(Arrays.toString(lecker.zutatenMengeUndPreis[0]));
        System.out.println(Arrays.toString(lecker.zutatenMengeUndPreis[1]));
        System.out.println(Arrays.toString(lecker.zutatenMengeUndPreis[2]));
        System.out.println(Arrays.toString(lecker.zutatenMengeUndPreis[3]));


    }
}

