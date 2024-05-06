import java.util.Arrays;

public class InsertionSort{
    public static void Insertion_Sort(int arr[]){
        for(int i=0;i<= arr.length-1 ; i++)
        {
            int j,temp=arr[i];
            for(j=i-1; j>= 0 && arr[j] > temp ; j--)
            {
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
            
        }
        
        
    }
    public static void main(String args[])
    {
        int arr[]={22,45,67,6,1};
        Insertion_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}