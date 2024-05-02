import java.util.Scanner;
public class recBinarySearch {
    public static int rec_Binary_Search(int arr[],int left,int right,int key)
    {
        
           if(right < left )
           return -1;
           int index,mid=(left +right)/2;
           if(key == arr[mid])
           return mid;
           if(key < arr[mid])
           index=rec_Binary_Search(arr, left, mid-1, key);
           else
           index=rec_Binary_Search(arr, mid+1, right, key);
           return index;
           
    }
    public static void main(String args[])
    {
        int arr[]={11,22,33,44,55,66};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println("enter the key ");
        int index=rec_Binary_Search(arr, 0, arr.length-1, key);
        if(index != -1)
        System.out.println("elemnt is found at index of"+index);
        else
        System.out.println("element is found at index of"+index);

    }
}
