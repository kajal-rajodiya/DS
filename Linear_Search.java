import java.util.Scanner;
public class Linear_Search{
public static int LinearSearch(int arr[],int key)
{
    for(int i=0;i<=arr.length-1;i++)
    {
          if(key == arr[i])
          return i;

        
       
    }
    return -1;
}

public static void main(String args[])
{
    int arr[]={22,55,75,85,63,95,25};
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the key: ");
    int key =sc.nextInt();
    int index=LinearSearch(arr,key);
    if(index != -1)
     {
        System.out.println("the element you enter found at index:"+index);
     }
    else
    {
        System.out.println("the element you enter not found at index:"+index);
    }
    
}

}
