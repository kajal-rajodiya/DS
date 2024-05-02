import java.util.Scanner;
public class Binary_Search {
    public static int binarysearch(int arr[],int key)
    {
        int left=0;
        int right=arr.length-1;
        int mid;
        while(right < left)
        {
            mid=(left + right)/2;
            if(key == arr[mid])
            return mid;
            if(key < arr[mid])
            right=mid-1;
            else
            left=mid +1;
            
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={11,22,33,44,55,66};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key that you want be Search : ");
        int key =sc.nextInt();

        int index=binarysearch(arr, key);
        if(index != -1)
        System.out.println("element  is found at index"+index);
        else
        System.out.println("element is not found at index"+index);
    }
}
