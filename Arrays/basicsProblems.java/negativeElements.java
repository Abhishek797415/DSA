//// given an array, print negative elements only.
import java.util.Scanner;
public class negativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,-3,-4,6,7};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){System.out.print(arr[i]+" ");}
            else continue;     
        }  
    }
}