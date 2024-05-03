import java.util.Arrays;

public class BubbleSort{
    public static void Bubble_Sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={5,34,56,9,03,33};
        System.out.println("before sorting"+Arrays.toString(arr));
        Bubble_Sort(arr);
        System.out.println("After sorting"+Arrays.toString(arr));

    }
}