package TP2;

import java.util.Arrays;

public class TP2 {


    public static int puiss(int x, int n) {
        if (n == 0) return 1;
        int res = puiss(x, n - 1);
        return x * res;
    }

    public static int puissRapide(int x, int n) {
        int temp = puiss(x, n / 2);
        if (n == 0) return 1;
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }

    public static int pivot(int[] t, int i, int j) {

        int p = t[j];
        if (i>j) return p ;
         if (t[i] > p) {
             int tot= t[p-1];
             t[i]=t[p-1];
             t[p-1]=t[i];
        }


        System.out.println(Arrays.toString(t));
        return pivot(t, i + 1, j);
    }
}
