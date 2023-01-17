package DataStructureAndAlgorithm_GFG.BitManupulation;

public class P1_KthBitIsSet {

    public boolean bitIsSet(int num, int k) {
        if ((num & (1 << (k - 1))) != 0) {
            return true;
        } else return false;
    }

    public int countSetBit(int num) {
        int count = 0;
        while (num > 0) {
            count = count + (num & 1);
            num = num >> 1;
        }
        return count;
    }

    public int countSetBitsByBrianAndKerningMethod(int num) {
        int count = 0;
        while (num > 0) {
            num = num & num - 1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        P1_KthBitIsSet p11 = new P1_KthBitIsSet();
        boolean res = p11.bitIsSet(5, 1);
        int resp = p11.countSetBitsByBrianAndKerningMethod(122);
        System.out.println(resp);

    }
}
