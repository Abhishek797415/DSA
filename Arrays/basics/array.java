public class array{
    public static void main(String[] args){
        // /// method-1
        // int[] x = {6,7,11,14,25};  /// indexing
        // System.out.println(x[0]);  /// accessing
        // x[2] = 36;  /// update
        // System.out.println(x[2]);

        // /// method-2
        int[] arr = new int[4]; /// size = 4
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        for(int i=0; i<arr.length; i++){
           System.out.println(arr[i]);
        }    
    }
}