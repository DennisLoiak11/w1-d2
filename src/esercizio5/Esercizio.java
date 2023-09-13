package esercizio5;
/*Scrivere un metodo che prenda in input un numero intero n e una stringa. Il metodo chiede all’utente di scrivere n stringhe
tastiera e per di esse torna true o false a seconda se la stringa inizi con quella passata in input*/

import java.util.Scanner;

public class Esercizio {
    public static void prefissoUguale(int n, String prefisso){
        prefisso=prefisso.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Puoi inserire "+ n + " stringhe");
        for (int i=1; i<=n; i++){
            System.out.println("Inserisci la " + i + " stringa");
            String s = input.nextLine().toLowerCase();
            System.out.println("La stringa inserita inizia con " + prefisso + "? " + s.startsWith(prefisso));
        }
    }
}
