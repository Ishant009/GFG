package String;

public class P2_Palindrome {
    // Time Complexity is O(n)
    // auxilary space theta(n)


    public boolean palindrome(String str){
        System.out.println(str);
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!= str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        P2_Palindrome p= new P2_Palindrome();
        String str = "geeks";
        boolean result= p.palindrome(str);
        System.out.println(result);
    }
}
