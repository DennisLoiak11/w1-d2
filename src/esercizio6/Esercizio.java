package esercizio6;

public class Esercizio {

    public static int[]doubleOdd(int[]array) {
    int[]copy=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1){
                copy[i]=array[i]*2;
            }
            else copy[i]=array[i];
            System.out.print(copy[i]);
        }
        return copy;
    }

}
