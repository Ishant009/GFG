package DataStructureAndAlgorithm_GFG.Recursion;

public class P9_GenerateSubSets {

    public void generateSubSets(String str){
        String curr="";
        solution(curr, str,0,str.length());
    }
    public void solution(String curr, String str, int i, int length){
        if(i == length) {
            System.out.println(curr);
            return;
        }

        solution(curr,str,i+1, length);
        curr= curr+str.charAt(i);
        solution(curr,str,i+1,length);
    }

    public static void main(String[] args){
        P9_GenerateSubSets p9= new P9_GenerateSubSets();
        p9.generateSubSets("abc");
    }
}
