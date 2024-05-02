public class SelectionSort{
    public static void Selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={23,45,65,6,99,9,0};
        System.out.println("Selection sort");
        System.out.println("before sorting: ");
        Selection(arr);
        System.out.println("After sorting: ");
    }
}