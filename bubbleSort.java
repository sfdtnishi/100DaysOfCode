public class bubbleSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {8,7,10,6,4};
        for(int i = 0; i < arr.length-1;i++){
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted(ascending order) array is: ");
        printArray(arr);
        }
    }
