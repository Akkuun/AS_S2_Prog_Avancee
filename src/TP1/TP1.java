package TP1;

public class TP1 {
    //********************* Exercice 1 *************************************//
    public static int factorielle(int n) {
        if (n == 0) return 1; //cas de base
        else {
            int resultat = factorielle(n - 1); // on fait appel à la même fonction mais avec un n-1
            return resultat * n;
        }
    }

    public static boolean pair(int n) {
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            return false;
        }
        System.out.println(n);
        return pair(n - 2);
    }

    public static int sommeImpair(int n) {
        if (n <= 1) return 1;
        int top = sommeImpair(n - 2);
        return top + n;
    }

    public static int puiss(int x, int n) {
        if (n == 0) return 1;
        int res = puiss(x, n - 1);
        return x * res;
    }
//***************************  Exercice 2 *************************************//

    public static int nombreOccurence(int x, int[] tableau, int i) { //x nombre à trouver, i position actuelle
        if (i == tableau.length) return 0; //on arrete de parcourir quand on arrive à la fin du tableau
        if (tableau[i] == x) return 1 + nombreOccurence(x, tableau, i + 1); // si on trouve
        //la valeur on return 1 + le resultat du prochain tour de fonction

        return nombreOccurence(x, tableau, i + 1);

    }

    public static int nombreOccurenceSansBoucleEnUtilisantNombreOccurence(int x, int[] tableau) {

        return nombreOccurence(x, tableau, 0);
    }

    public static int nombreOccurenceQuiSupporteLesTableauxVides(int x, int[] tableau, int i) {
        if (tableau.length == 0) return 0;
        if (i == tableau.length - 1) return 1;
        int res = nombreOccurence(x, tableau, i + 1);
        if (res == x) res = res + 1;
        return res;
    }

    public static boolean estPalindrome(char[] t, int i, int j) {
        if ( t[i] != t[j]) return false
                ;

        if (t[i] == t[j]) return true ;
    return estPalindrome(t, i + 1, j - 1);


        // on va comparer chaque index avec celui pré supposé égal
    }

    public static boolean estPalindromeUtilisateur(char[] t) { //la fonction pour l'utilisateur sans les paramètres qu

        return estPalindrome(t, 0, t.length - 1);
    }


    public static boolean croissants(int[] t, int i) {
        if (i == t.length || t[i] >= t[i + 1]) return false;
        if (t[i] < t[i + 1]) return true;
        return croissants(t, i + 1);


    }


}
