package esercizio9;
/*Due stringhe a e b sono dette anagrammi se contengono gli stessi caratteri con le stesse frequenze. Ad esempio, gli anagrammi
 di CAT sono CAT, ACT, TAC, TCA, ATC, e CTA. Date due stringhe a e b in input, scrivere un metodo che stampi ´anagrammi’ se sono
 anagrammi, ´non anagrammi’ altrimenti.*/

import java.util.Arrays;

public class Esercizio {
    public static void anagrammi(String a, String b){
        if (a.length() != b.length()){
            System.out.println("Non sono anagrammi");
            return;
        }
        char[]array_a = a.toCharArray();
        char[]array_b = b.toCharArray();

        Arrays.sort(array_a);
        Arrays.sort(array_b);

        if (Arrays.equals(array_a, array_b)){
            System.out.println("Sono anagrammi");
        }else {
            System.out.println("Non sono anagrammi :(");
        }

    }

}
