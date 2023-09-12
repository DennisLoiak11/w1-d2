package esercizio2;

public class Esercizio {
    public static String invertiStringa(String s) {
        String inversa = "";
        for (int i = s.length() - 1; i >= 0; i--) {
        inversa += s.charAt(i);
        } return inversa;
    }
}
