import java.util.Scanner;

public class BubbleSort {
    void bubbleSort(int arr[],int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter te elements in the array");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        BubbleSort obj=new BubbleSort();
        obj.bubbleSort(arr,n);
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
