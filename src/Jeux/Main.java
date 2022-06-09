package Jeux;

public class Main {


    public static void main(String[] args) {
resoudre(2,2,1);
    }

    public static void resoudre(int n, int i, int j) {
        if (n==0) return;
        int k = 6 - i - j;
        resoudre(n-1,i,k);
        System.out.println(i +"->"+ k);
        resoudre(n-1,i,k);
    }
}
