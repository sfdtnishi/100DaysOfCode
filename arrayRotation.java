package com.arrays;

public class arryaRotate {

    public static void reverse(int[] nums, int start, int end){
        while(end>start){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] =temp;

        }
    }
    public static void Rightrotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public static void Leftrotate(int[] nums, int k) {
        k %= nums.length;


        reverse(nums, 0, k-1);
        
        reverse(nums, k, nums.length-1);

        reverse(nums, 0, nums.length-1);
    }


  //right rotation
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8};
       int k =3;
       Rightrotate(arr,k);
       for(int i : arr){
           System.out.print(i+" ");
       }
        System.out.println();

        int[] nums={1,2,3,4,5,6,7,8};
        int n =3;
       Leftrotate(nums,n);
        
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}


