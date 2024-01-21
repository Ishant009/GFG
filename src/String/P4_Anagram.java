package String;

import java.util.Arrays;

public class P4_Anagram{
//  Time Complexity O(nlogn)  sort-->nlogn
    public boolean anagram(String str, String str2){
        System.out.println(str+"   "+str2);
        char[] chars= str.toCharArray();
        Arrays.sort(chars);
        char[] chars1= str2.toCharArray();
        Arrays.sort(chars1);
        return new String(chars).equals(new String(chars1));
    }

//    Time Complexity O(n)
    public boolean anangram1(String s1, String s2){
        char[] chars =new char[256];
        if(s1.length() != s2.length()) return false;

        for(int i=0;i<s1.length();i++){
            chars[s1.charAt(i)]++;
            chars[s2.charAt(i)]--;
        }
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=0) return false;
        }
        return true;

    }
    public static void main(String[] args){
        P4_Anagram p = new P4_Anagram();
        String s1= "aa";
        String s2="aa";
        boolean res = p.anangram1(s1, s2);
        System.out.println(res);
    }
}
