package DataStructureAndAlgorithm_GFG.Recursion;

public class P2_Print1toN {
    public void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        P2_Print1toN p2 = new P2_Print1toN();
        p2.print(5);
    }
}
