package DataStructureAndAlgorithm_GFG.Recursion;

public class P6_Palindrome {

    public boolean palindrome(String str, int start, int end){
        if(start>=end) return true;
        else return  str.charAt(start)!= str.charAt(end) && palindrome(str,start+1, end-1);
    }

    public static void main(String[] args){
        P6_Palindrome p6= new P6_Palindrome();
        String str= "geeks";
        boolean res= p6.palindrome(str,0,str.length()-1);
        System.out.println(res);
    }
}

/*Time Complexity : T(n)= Tn-2)+@(n);*/
