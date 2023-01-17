package DataStructureAndAlgorithm_GFG.Recursion;

public class P5_NaturalNumberSum {

    public int naturalNumberSum(int n){
        if(n<=0) return 0;
        return n+naturalNumberSum(n-1);

    }

    public static void main(String[] args){
        P5_NaturalNumberSum p5= new P5_NaturalNumberSum();
        int sum= p5.naturalNumberSum(2);
        System.out.println(sum);

    }
}
