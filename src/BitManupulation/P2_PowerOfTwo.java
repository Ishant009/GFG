package DataStructureAndAlgorithm_GFG.BitManupulation;

public class P2_PowerOfTwo {

    public boolean powerOfTwo(int num){
        int n=2;
        while(n<=num){
            if(n==num) return true;
            n=n<<1;
        }
        return false;
    }
    public boolean powerOfTwoEfficient(int num){
        if(num==0) return false;
        return (num & num-1)==0;
    }
    public static void main(String[] args){
        P2_PowerOfTwo p12= new P2_PowerOfTwo();
        boolean res=p12.powerOfTwoEfficient(8);
        System.out.println(res);
    }
}
