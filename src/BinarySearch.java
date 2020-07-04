import java.util.Scanner;

public class BinarySearch {
    public static void binarysearch(int[] arr, int first , int last , int search)
    {
        int mid=(first + last)/2;
        while (first<=last)
        {
            if (arr[mid]<search)
            {
                first=mid + 1;
            }
            else if (arr[mid]==search)
            {
                System.out.println("element is found at index " +mid);
                break;
            }
            else
            {
                last=mid - 1;
            }
            mid=(first+last)/2;
        }
        if (first>last)
        {
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        System.out.println("enter the element to be search for");
        Scanner sc=new Scanner(System.in);
        int search=sc.nextInt();
        int last=arr.length-1;
        binarysearch(arr,0,last,search);
    }
}
