package TP1;

public class Main extends TP1 {

    public static void main(String[] args) {

        int[] t = {1, 2, 3, 1, 1};
        System.out.println(sommeElementTableau(t,0));    }

    public static int sommeTab(int[] t, int i) {
        if (i == t.length - 1) return t[i];
        return t[i] + sommeTab(t, i + 1);
    }

    public static int maxTab(int[] t, int i) {
        if (i == t.length - 1) return maxTab(t,i-1);
        if (t[i] > t[i + 1]) return t[i];
        else return maxTab(t, i + 1);
    }
    public static int sommeElementTableau(int []t,int i){
        if (t.length==1) return t[0];
        if (i==t.length-1) return t[i];
        return t[i]+sommeElementTableau(t,i+1);
    }


}