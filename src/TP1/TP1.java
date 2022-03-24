package TP1;

public class TP1 {

    public static int factorielle(int n) {
        if (n == 0) return 1; //cas de base
        else {
            int resultat = factorielle(n - 1); // on fait appel à la même fonction mais avec un n-1
            return resultat * n;
        }
    }

    public static boolean pair(int n) {
        if (n == 0){
            return true;
        }
        else{
            return false;
        }

        boolean estPair = pair(n - 1);


    }
}
