// can use min= Integer.MIN_VALUE and Integer.MAX_VALUE(in place of int max/min=arr[0])
// basically they are used to initialize the integer
// Integer.MIN_VALUE:  a constant in the Integer class that represents the minimum or least integer value that can be represented in 32 bits.
// Integer.MAX_VALUE: represents the maximum positive integer value that can be represented in 32 bits.

public class arrayMaxMinNo {
    public static void max(int arr[]){
//        int max=arr[0];
        int max= Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){  //here the length is (arr.length-1) to ensure that loop doesn't go out of bound.
            if(arr[i]>arr[i+1]){
                max=arr[i];
            }
        }
        System.out.println("The maximum number in the array is: "+ max );
    }
    public static void min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                min=arr[i+1];
            }
        }
        System.out.print("The minimum number in the array is: "+ min );
    }


    public static void main(String args[]){
        int arr[] = {4,10,1,7,9};
        max(arr);
        min(arr);

    }
}
