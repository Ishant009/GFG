package DataStructureAndAlgorithm_GFG.Arrays;

public class P2_LargestElement {

    public int maxElement(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[j]) {
                j = i;
            }
        }
        return j;

    }

    public static void main(String[] args) {
        P2_LargestElement p2 = new P2_LargestElement();
        int[] arr = new int[]{5, 8, 20, 10};
        int res = p2.maxElement(arr);
        System.out.println(res);
    }
}
