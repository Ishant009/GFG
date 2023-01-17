package DataStructureAndAlgorithm_GFG.Arrays;

public class P4_CheckIfArraySorted {

    public boolean sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        P4_CheckIfArraySorted p4= new P4_CheckIfArraySorted();
        int[] arr = new int[]{100,20,100};
        boolean res = p4.sorted(arr);
        System.out.println(res);
    }
}
