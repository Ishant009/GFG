package DataStructureAndAlgorithm_GFG.Recursion;

public class P8_RopeCuttingProblem {

    public int maxPiece(int n, int a, int b, int c){
        if(n==0) return 0;
        if(n<0) return -1;
        int res= Math.max(maxPiece(n-a,a,b,c), Math.max(maxPiece(n-b,a,b,c), maxPiece(n-c,a,b,c)));
        if(res==-1) return -1;
        return res+1;
    }
    public static void main(String[] args){
        P8_RopeCuttingProblem p8= new P8_RopeCuttingProblem();
        int max = p8.maxPiece(23,12,9,11);
        System.out.println(max);
    }
}
