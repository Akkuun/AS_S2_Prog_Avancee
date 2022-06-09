package TP_Fractales;

import java.beans.JavaBean;
import java.util.IllegalFormatCodePointException;

class DessinFractale {
    private final Turtle bob;

    private final static int LARGEUR = 800;
    private final static int HAUTEUR = 600;
    //taille de la fenetre graphique

    public DessinFractale() {
        bob = new Turtle();
        Turtle.setCanvasSize(LARGEUR, HAUTEUR);//à appeler APRES création de la tortue
    }

    public DessinFractale(int v) {
        //attention, plus v est grand, plus bob va lentement !
        this();
        bob.speed(v);
    }


    public void reset() {
        bob.clear();
        bob.up();
        bob.setPosition(0, 0);
        bob.setDirection(0);
        bob.down();

    }

    public void close() {
        bob.exit();
    }


    public void carre(double l) {
        bob.forward(l);
        bob.right(90);
        carre(l);
    }

    public void flocon(double l, int n) {
        if (n == 0) bob.forward(l);
        else {
            flocon(l / 3, n - 1);
            bob.left(60);
            flocon(l / 3, n - 1);
            bob.right(120);
            flocon(l / 3, n - 1);
            bob.left(60);
            flocon(l / 3, n - 1);
        }
    }

    public void arbre(double l, int n) {
        if (n == 0) {
            bob.forward(l);
            bob.backward(l); // on fait en sorte que le spec pour n=0 soit respecte
        } else {
            bob.forward(l);
            arbre(l / 2, n - 1);
            bob.left(45);
            arbre(l / 2, n - 1);
            bob.right(90);
            arbre(l / 2, n - 1);
            bob.left(45);
            bob.backward(l);

        }
    }


    public static void main(String[] args) {
        DessinFractale d = new DessinFractale(1000);
        d.flocon(1000,3);
    }

    public void pointille(double l, double h, int n) {
        if (n == 1 || n == 0) {
            bob.down();
            bob.forward(l / 2);
            bob.up();
            bob.backward(l / 2);
            bob.down();


        } else {
            pointille(l / 2, h, n - 1);
            bob.up();
            bob.forward(l / 2);
            bob.down();
            pointille(l / 2, h, n - 1);
            bob.up();
            bob.backward(l / 2);
            bob.left(90);
            bob.backward(h);
            bob.right(90);
            bob.down();
            pointille(l, h, n - 1);
        }
    }


}