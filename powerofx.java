public class powerofx{
    static double myPow(double x, int n) {
        double ans=1.0;
        long m= n;
        if(m<0) m= -1*m;
        while(m>0){
            if(m%2==1){  //if m is odd
                ans=ans*x;
                m=m-1;
            } else{  //if m is even
                x=x*x;
                m=m/2;
            }
        }
        if(n<0) ans=(double)(1.0)/(double)(ans);
        return ans;
    }
    public static void main(String args[]){
        System.out.println(myPow(2,10));
    }
}
