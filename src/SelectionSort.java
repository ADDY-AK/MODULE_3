import java.util.Scanner;

public class SelectionSort {
    void selectionSort(int arr[],int n)
    {
        for (int i=0;i<n-1;i++)
        {
            int index=i;
            for (int j=i+1;j<n;j++)
            {
                if (arr[j]<arr[index])
                {
                    index=j;
                }
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements int the array");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        SelectionSort obj=new SelectionSort();
        obj.selectionSort(arr,n);
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }

}
