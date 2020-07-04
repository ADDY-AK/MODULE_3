import java.util.Scanner;

public class InsertionSort {
    void insertionSort(int[] arr, int n)
    {
        for (int i=0;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
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
        InsertionSort obj=new InsertionSort();
        obj.insertionSort(arr,n);
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
