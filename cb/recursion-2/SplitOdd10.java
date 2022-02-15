/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class SplitOdd10{
    /*
    Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
    */
    public static boolean splitOdd10(int[] nums) {
        return splitHelper(nums, 0, 0, 0);
      }
      
      public static boolean splitHelper(int[] nums, int sumA, int sumB, int start){
        if(start > nums.length-1){
          if(sumA % 10 == 0 && sumB % 2 == 1){
            return true;
          }
          if(sumB % 10 == 0 && sumA % 2 == 1){
            return true;
          }
          return false;
        }
        return splitHelper(nums, sumA+nums[start], sumB, start+1) || splitHelper(nums, sumA, sumB+nums[start], start+1);
      }
    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 5;
        arr[2] = 5;
        System.out.println(splitOdd10(arr) + "...should be true");
        arr[0] = 5;
        arr[1] = 5;
        arr[2] = 6;
        System.out.println(splitOdd10(arr) + "...should be false");
        arr = new int[4];
        arr[0] = 5;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 1;
        System.out.println(splitOdd10(arr) + "...should be true");
    }
}