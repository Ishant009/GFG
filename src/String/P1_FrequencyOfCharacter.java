package String;

import java.util.Arrays;

public class P1_FrequencyOfCharacter {
    // Time Complexity is O(n)
    // auxilary space theta(n)

    public void frequencyOfCharacter(String str){
        System.out.println(str);
        int[] count= new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        for(int i=0;i<count.length;i++){
            System.out.println((char)(i+'a') +" :"+count[i]);
        }
    }

    public static void main(String[] args) {
        P1_FrequencyOfCharacter p1= new P1_FrequencyOfCharacter();
        String str = "geeksforgeeks";
        p1.frequencyOfCharacter(str);
    }
}
