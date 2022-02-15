/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class SplitArray{
    /*
    Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)
    */
    public static boolean splitArray(int[] nums) {
        return splitHelper(nums, 0, 0, 0);
      }
      
      public static boolean splitHelper(int[] nums, int sumA, int sumB, int start){
        if(start > nums.length-1 && sumA == sumB){
          return true;
        }
        if(start > nums.length-1 && sumA != sumB){
          return false;
        }
        return splitHelper(nums, sumA+nums[start], sumB, start+1) || splitHelper(nums, sumA, sumB+nums[start], start+1);
    }
    public static void main(String[] args){
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 2;
        System.out.println(splitArray(arr) + "...should be true");
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(splitArray(arr) + "...should be false");
        arr = new int[3];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(splitArray(arr) + "...should be true");
    }
}