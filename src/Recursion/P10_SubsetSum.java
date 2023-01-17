package DataStructureAndAlgorithm_GFG.Recursion;

public class P10_SubsetSum {

    public void subsetSum(int[] arr,int target){
        int sum=target;
        int counter=0;
        int res= solution(sum, arr,0,target,  counter);
        System.out.println(res);
    }
    public int solution(int sum, int[] arr, int i, int target, int counter){

        if(i==arr.length){
            System.out.println(sum);
            return sum==0?1:0;
        }
        int res = solution(sum,arr,i+1, target, counter)+solution(sum-arr[i],arr,i+1,target, counter);
        return res;
    }

    public static void main(String[] args){
        P10_SubsetSum p9= new P10_SubsetSum();
        int[] arr= new int[]{1,2,3};
        int target=4;
        p9.subsetSum(arr, target);
    }
}

/*Time Complexity : 2^n+2^n-1 = @(2^n)*/