package Exercises2;

public class CurrencyExchange {
    public static void main(String[] args) {

        System.out.println( exchangeCurrency( "CAD", 45.9));

    }
    public static double exchangeCurrency ( String currencyID, double value){
        double convertedValue=0;

        switch ( currencyID){
            case "HUF" -> convertedValue= value* 328.61;
            case "SEK" -> convertedValue= value*10.76;
            case "USD" -> convertedValue=value*1.12;
            case "CAD"-> convertedValue=value*1.47;
            default -> System.out.println( " Can not be converted.");
        }return convertedValue;
    }
}
