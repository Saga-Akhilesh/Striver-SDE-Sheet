import java.util.*;
public class PascalTriangle{
static List<List<Integer>> generate(int numRows) {
    List<List<Integer>>res=new ArrayList<List<Integer>>();
     List<Integer> row , previousrow =null;
     for(int i=0;i<numRows;++i){
         row=new ArrayList<Integer>();
         for(int j=0;j<=i;++j)
             if(j==0||j==i) //if its first or last column then add 1
                 row.add(1);
             else             //if its in the middle then add previous row elements to get the value
                 row.add(previousrow.get(j-1)+previousrow.get(j));
             previousrow =row;
             res.add(row);
     }
     return res;
 }
 public static void main(String args[]){
    int numRows=5;
    System.out.println(generate(numRows));
 }
}