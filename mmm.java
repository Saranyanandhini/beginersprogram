import java.util.*;
public class mmm {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double mean=sum/n;
        System.out.println("MEAN IS "+mean);
        Arrays.sort(arr);
        if(n%2==0)
        {
            double median=(arr[n/2]+arr[(n/2)-1])/2;
            System.out.println("MEDIAN IS "+ median);
        }
        else{
            double medain=arr[n/2];
            System.out.println("MEDIAN IS "+medain);
        }
        int max=0,count=0,mode=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++;
                if(count>max)
                {
                    max=count;
                   mode=arr[i];
                }
            }
            else{
                count=0;
            }

        }
        System.out.println("MODE IS "+mode);

    }
    
}