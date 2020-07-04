import java.util.Scanner;

public class QuickSort {
    int partition(int[] arr, int lb, int ub)
    {
        int pivot=arr[ub];
        int i=lb-1;
        for (int j=lb;j<ub;j++)
        {
            if (arr[j]<pivot)
            {
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[ub];
        arr[ub]=temp;

        return i+1;
    }

    void quickSort(int arr[] , int lb, int ub)
    {
        if (lb<ub) {
            int loc = partition(arr, lb, ub);
            quickSort(arr, lb, loc - 1);
            quickSort(arr, loc + 1, ub);
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
        QuickSort obj=new QuickSort();
        obj.quickSort(arr,0,n-1);
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
