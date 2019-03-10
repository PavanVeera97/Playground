import java.util.Scanner;
class Main
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumsub(arr,n));
    }
   public static int sumsub(int arr[],int n){
     int runningsum,maxsub,i;
     runningsum=arr[0];
     maxsub=arr[0];
     for(i=1;i<n;i++){
       if(arr[i]>arr[i-1]){
         runningsum+=arr[i];
       }
       else{
         runningsum=arr[i];
       }
     if(runningsum > maxsub){
       maxsub=runningsum;}
       
     }return maxsub;
   }
}