public class mergetwosortedarraysgap{
    static int getgap(int gap){
        if(gap<=1)
            return 0;
            return (gap/2)+(gap%2);
    }
    static void mergetwosortedarrays(int arr1[],int arr2[],int n,int m){
        int i,j;
        int gap=n+m;
        for(gap=getgap(gap);gap>0;gap=getgap(gap)){
            //for 1st array
            for(i=0;i+gap<n;i++){
                if(arr1[i]>arr1[i+gap]){
                    int temp=arr1[i];
                    arr1[i]=arr1[i+gap];
                    arr1[i+gap]=temp;
                }
            }
            //comparing two arrays
            for(j=gap>n?gap-n:0; i<n && j<m; i++,j++){
                if(arr1[i]>arr2[j]){
                    int temp=arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
            //for 2nd array
            for(j=0;j+gap<m;j++){
                if(arr2[j]>arr2[j+gap]){
                    int temp=arr2[i];
                    arr2[j]=arr2[i+gap];
                    arr2[j+gap]=temp;
                }
            }
        }
    }
        public static void main(String args[]){
            int[] arr1 = { 10, 27, 38, 43, 82 };
            int[] arr2 = { 3, 9 };
            mergetwosortedarrays(arr1,arr2,arr1.length,arr2.length);
            System.out.print("First Array: ");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
     
            System.out.println();
     
            System.out.print("Second Array: ");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
        }
    }


        