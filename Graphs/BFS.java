import java.util.*;
class BFS{
    public ArrayList<Integer>bfsofGraph(int V, 
    ArrayList<ArrayList<Integer>> adj){
        ArrayList <Integer>Result= new ArrayList<>();
        Queue <Integer>q = new LinkedList<>();
        boolean visited_array[] = new boolean[V];
        q.add(0);  //if Zero-based Indexing
        visited_array[0]=true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            Result.add(node);

            for(int it:adj.get(node)){          //Adjacency list has all neighbours of particular node. so we need to iterate over that neighbours list.
                if(visited_array[it]==false){
                    visited_array[it]=true;
                    q.add(it);
                }
            }

        }
        return Result;
    }
    public static void main(String args[]){
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        BFS b = new BFS(); 
        ArrayList < Integer > ans = b.bfsofGraph(5, adj);
        int n = ans.size(); 
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" "); 
        }
    }
}