package esercizio7;
/* Scrivete una funzione che dato in input due numeri n ed m, crea un array lungo m che in ogni cella ha il valore di indice
della cella moltiplicato per n.*/

public class Esercizio {
    public static int[]tabellina(int n,int m){
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            array[i] = n*i;
            System.out.println(array[i]);
        }
        return array;
    }
}
