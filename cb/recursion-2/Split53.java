/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class Split53{
    /*
    Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)
    */
    public static boolean split53(int[] nums) {
        return splitHelper(nums, 0, 0, 0);
      }
      
      public static boolean splitHelper(int[] nums, int sumA, int sumB, int start){
        if(start > nums.length-1 && sumA == sumB){
          return true;
        }
        if(start > nums.length-1 && sumA != sumB){
          return false;
        }
        if(nums[start] % 5 == 0){
          return splitHelper(nums, sumA+nums[start], sumB, start+1);
        }
        if(nums[start] % 3 == 0){
          return splitHelper(nums, sumA, sumB+nums[start], start+1);
        }
        return splitHelper(nums, sumA+nums[start], sumB, start+1) || splitHelper(nums, sumA, sumB+nums[start], start+1);
    }
    public static void main(String[] args){
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 1;
        System.out.println(split53(arr) + "...should be true");
        arr = new int[3];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        System.out.println(split53(arr) + "...should be false");
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 2;
        System.out.println(split53(arr) + "...should be true");
    }
}