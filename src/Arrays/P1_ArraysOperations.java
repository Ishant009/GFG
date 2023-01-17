package DataStructureAndAlgorithm_GFG.Arrays;

import java.util.Arrays;

public class P1_ArraysOperations {

    public int search(int[] arr, int element){
        for(int i=0;i<arr.length;i++){
            if(i==element) return i;
        }
        return -1;
    }
    public void insert(int[] arr, int element, int pos){

        for(int i=arr.length-1;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=element;
    }
    public void delete(int[] arr, int element){
        int pos=Integer.MIN_VALUE;
        int i;
        for( i=0;i<=arr.length;i++){
            if(arr[i]== element) {pos=i; break;}
        }
        if(i==arr.length) return;
        while(i<arr.length-1){
            arr[i]=arr[i+1];
            i++;
        }
    }

    public static void main(String[] args) {
        P1_ArraysOperations p1= new P1_ArraysOperations();
        int[] arr= new int[5];
        arr[0]=5;
        arr[1]=10;
        arr[2]=20;
        int pos=2;
//        int res=p1.search(arr,5);
//        System.out.println(res);
        p1.insert(arr,7, pos);
        p1.delete(arr,10);
        System.out.println(Arrays.toString(arr));

    }
}
