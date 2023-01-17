package DataStructureAndAlgorithm_GFG.Recursion;

public class P1_PrintNto1 {

    public void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
    }
    public static void main(String[] args){
        P1_PrintNto1 p1= new P1_PrintNto1();
        p1.print(5);
    }
}
