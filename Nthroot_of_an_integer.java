public class Nthroot_of_an_integer{

    static double multiply(double number,int n){
        double ans =1.0;
        for(int i=1;i<=n;i++){
            ans=ans*number;
        }
        return ans;
    }
    static void getroot(int N,int M){
        double low = 1;
        double high = M;
        double eps = 1e-6;
        while((high-low)>eps){
            double mid = (low+high)/2.0;
            if(multiply(mid,N)<M){
                low=mid;
            } else{
                high=mid;
            }
        }
        System.out.println(N+"th root of "+ M +" is "+ low);
    }
    public static void main(String args[]){
        int N= 2;
        int M =4;
        getroot(N,M);
    }
}