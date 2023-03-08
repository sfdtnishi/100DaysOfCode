public class arraySortingCheck {
    public static void sortingCheck(int arr[]){
        boolean isAscending = true;
        boolean isDescending = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
            else if (arr[i]<arr[i+1]){
                isDescending = false;
            }
        }
            if (isAscending) {
                System.out.println("is sorted in ascending order");
            }
            else if (isDescending) {
                System.out.println("is sorted in descending order");
            } else {
                System.out.println("is not sorted");
            }
    }
    public static void main(String args[]){
        int arr1[]={3,7,2,1,3};
        int arr2[]={1,2,3,4,5};
        int arr3[]={9,4,2,1,1};
        System.out.print("Array1 ");
        sortingCheck(arr1);
        System.out.print("Array2 ");
        sortingCheck(arr2);
        System.out.print("Array3 ");
        sortingCheck(arr3);

    }
}
