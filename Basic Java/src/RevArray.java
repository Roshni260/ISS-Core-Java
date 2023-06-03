//an array is a collection of similar type of elements which has contiguous memory location.
// Loops in java: for, while, do while.
// Decision making in java: if, if-else, if-elif-else, switch, jump
import java.util.Arrays;
import java.util.Scanner;

public class RevArray {
    static void reverse(int[] arr){
        int j=arr.length-1;
        for(int i=0;i<j;i++){ // for loop
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the size of nums and index array: ");
        int n= s.nextInt();
        System.out.println("Enter the elements of the array: ");
        int nums[]=new int[n]; // Declaring an array
        for (int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        reverse(nums);
    }
}
