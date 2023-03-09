package Mathematics;

public class P2_PalindromeNumber {

/*
    Time Complexity for this method is theta(d)
*/
    public boolean palindromeNumberForString(String num){
        if(num.length()==1) return true;
        int i =0;
        int j = num.length()-1;
        while(i<j){
            if(num.charAt(i)!=num.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }

    public boolean palindromeNumberForInt(int num){
        int reverse = 0;
        int temp = num;
        while(num>0){
            reverse = reverse*10 + num%10;
            num= num/10;
        }
        System.out.println("initial :"+ temp+ " reverse :" +reverse);
        if(reverse == temp) return true;
        return false;
    }

    public static void main(String[] args) {
        P2_PalindromeNumber p2PalindromeNumber= new P2_PalindromeNumber();
        String str = "78987";
        int num = 21;
        boolean strRes =p2PalindromeNumber.palindromeNumberForString(str);
        boolean numRes =p2PalindromeNumber.palindromeNumberForInt(num);
        System.out.println("Response : "+strRes);
        System.out.println("Response : "+numRes);
    }
}


