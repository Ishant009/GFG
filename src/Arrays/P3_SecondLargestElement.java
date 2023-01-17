package DataStructureAndAlgorithm_GFG.Arrays;

public class P3_SecondLargestElement {

    public int secondLargestElement(int[] arr){
        int res=-1, largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[largest]<arr[i]){
                res=largest;
                largest=i;
            }else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        P3_SecondLargestElement p3= new P3_SecondLargestElement();
        int[] arr = new int[]{20, 25, 30, 8,12};
        int res = p3.secondLargestElement(arr);
        System.out.println(res);
    }
}
