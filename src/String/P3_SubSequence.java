package String;

public class P3_SubSequence {

    public boolean subSequence(String str, String str2){
        System.out.println(str+"   "+str2);
        int j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str2.charAt(j));{
                j++;
            }
            if(j==str2.length()) return true;
        }
        return false;
    }
    public static void main(String[] args){
        P3_SubSequence p = new P3_SubSequence();
        String s1= "ABCD";
        String s2="AD";
        boolean res = p.subSequence(s1, s2);
        System.out.println(res);
    }
}
