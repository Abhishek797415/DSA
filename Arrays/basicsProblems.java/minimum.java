/// print minimum of the array.
import java.util.Scanner;
public class minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter array elements : ");
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]<min) {min = arr[i];}
        }
        System.out.println(min);
    }
}
