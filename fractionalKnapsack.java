
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class itemComparator implements Comparator<Item>{
    public int compare(Item a,Item b){
        double r1=(double)(a.value)/(double)(a.weight);
        double r2=(double)(b.value)/(double)(b.weight);
        if(r1<r2) return 1;  
        else if(r1>r2) return -1;  
        else return 0;
    }
}
public class fractionalKnapsack
{
    //Function to get the maximum total value in the knapsack.
    double Knapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr,new itemComparator());
        int currWeight=0;
        double totalvalue=0.0;
        for(int i=0;i<n;i++){
            if(currWeight + arr[i].weight <=W){
                currWeight=currWeight+arr[i].weight;
                totalvalue=totalvalue+arr[i].value;
            }
            else{
                int remain =W-currWeight;
                totalvalue=totalvalue+((double)arr[i].value/(double)(arr[i].weight))*remain;
                break;
            }
        }
        return totalvalue;
    }
}