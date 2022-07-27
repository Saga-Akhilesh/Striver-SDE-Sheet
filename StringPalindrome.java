import java.util.*;
public class StringPalindrome{
    public static void partitioning(String s , int ind , ArrayList<String>path, List<List<String>>res){
        //base condition
        if(ind==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                path.add(s.substring(ind,i+1));
                partitioning(s,i+1,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s ,int left ,int right){
        while(left<=right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> res= new ArrayList<>();
        ArrayList<String>path = new ArrayList<>();
        partitioning(s,0,path,res);
        return res;
    }
    public static void main(String args[]) {
        String s = "aabb";
        List < List < String >> ans = partition(s);
        System.out.print(" [ ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print("] ");
        }
        System.out.print("]");


    }
}