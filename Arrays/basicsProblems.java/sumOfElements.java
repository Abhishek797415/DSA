/// print sum of elements of the array.
import java.util.Scanner;
public class sumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter array elements : ");
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
