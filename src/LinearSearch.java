import java.util.Scanner;

public class LinearSearch {
    public static int linearsearch(int[] arr ,int search)
    {
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == search) {
                return i;
            }
        }
                return-1;
    }

    public static void main(String[] args) {
        int[] arr={10,2,73,4,6,3,35,78,23};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to be search for");
        int search=sc.nextInt();
        System.out.println("the element  " + search + "  is found at index  " +linearsearch(arr,search));
    }
}
