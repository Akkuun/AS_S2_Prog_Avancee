package TP_List;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Liste l = new Liste(3);
        l=Liste.ajoutTeteV1(l,2);
        l=Liste.ajoutTeteV1(l,1); // l= 1 2 3
        l=Liste.ajoutTeteV1(l,4);
        Liste l2=new Liste(2);
        l2=Liste.ajoutTeteV1(l2,2);
        System.out.println(Liste.contient(l,l2));
    }

}
