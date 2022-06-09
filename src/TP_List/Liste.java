package TP_List;

class Liste {
    private int val;
    private Liste suiv;

    public Liste(int x) {//construit la liste avec un entier x
        this.val = x;
        this.suiv = null;
    }

    public Liste(int x, Liste l) {
        this.val = x;
        this.suiv = l;
    }

    public static boolean estVide(Liste l) {
        return l == null;
    }

    Liste copie(Liste l) {
//action : retourne une copie de l (en recopiant tous les maillons)
        if (estVide(l)) {
            return null;
        } else {
            return new Liste(l.val, copie(l.suiv));
        }
    }

    public static String toString(Liste l) {
        if (estVide(l))
            return "";
        else
            return l.val + " " + toString(l.suiv);
    }

    public static int longueur(Liste l) {
        if (estVide(l)) return 0;
        else {
            return 1 + longueur(l.suiv);
        }
    }

    public static boolean estCroissant(Liste l) {
        if (l.suiv == null) return true; //condition d'arret de parcours = on arrive à la fin
        if (l.val > l.suiv.val) return false; //cas où c'est pas croissant
        return estCroissant(l.suiv); //go to suivant
    }

    public static Liste ajoutTeteV1(Liste l, int x) {
// action : ajoute x en tete de l
        return new Liste(x, l);
    }

    public void supprimeTete() {
//sur liste non vide
        this.val = suiv.val;
        this.suiv = this.suiv.suiv;
    }
    public  void ajoutFin(int x){
        suiv=new Liste(x,this);

    }

    public static boolean contient (Liste l1, Liste l2){
        if (l2==null) return true;
        if (l1==null) return false;
        if (l1.val==l2.val) return true;
        if (l1.val!=l2.val) return contient(l1.suiv,l2);
        else return contient(l1.suiv,l2.suiv);
    }
}
