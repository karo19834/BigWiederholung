package Exercises7;

public class Rezept {
    int anzahlPersonen;
    String [] zutatenName;
    double [][] zutatenMengeUndPreis;


    public boolean allergisch ( String zutat){
        for ( int a=0; a< zutatenName.length; ++a){
            if ( zutatenName[a].equals(zutat)){
                return true;
            }
        }
        return false;
    }
    public boolean laktoseFrei(){
        boolean findeLaktoze = false;
        for ( int l=0; l< zutatenName.length; ++l){
            if ( zutatenName[l].equals( "Milch")|| zutatenName[l].contains( "Käse")){
                findeLaktoze= true;
                zutatenMengeUndPreis [l][0]=0;
                zutatenMengeUndPreis [l][1]=0.0;
            }
        }
        return findeLaktoze;
    }
    public double kostet(){
        double summe = 0;
        for(int k = 0; k < zutatenMengeUndPreis.length; ++k){
            summe += zutatenMengeUndPreis[k][1];
        }
        return summe;
    }
    public double kostetProPerson(){
        return kostet()/anzahlPersonen;
    }
    public void  aenderePersonen (int anzahl){
        if(anzahl > 0){
            double factor = (double) anzahl / anzahlPersonen;
            anzahl = anzahlPersonen;
            for(int z = 0; z < zutatenMengeUndPreis.length; ++z){
                zutatenMengeUndPreis[z][0] *= factor;
                zutatenMengeUndPreis[z][1] *= factor;
            }
        }
    }
}
