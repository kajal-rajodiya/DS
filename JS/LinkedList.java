import java.util.Scanner;

public class LinkedList {
    public class SinglyList{
        static class Node
        {
            private int data;
            private Node next;
            public Node()
            {
                data=0;
                next=null;
            }
            public Node(int val)
            {
                data= val;
                next= null;
            }

        }
    
        private Node head;
        public SinglyList()
        {
            head=null;
        }
    }


    public static void main(String args[])
    {
        int choice;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("\n\n0. Exit\n1. Display");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }while(choice != 0);
    }
    
}
