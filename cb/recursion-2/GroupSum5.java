/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class GroupSum5{
    /*
    Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints: all multiples of 5 in the array must be included in the group. If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)
    */
    public static boolean groupSum5(int start, int[] nums, int target) {
        if(target == 0 && start > nums.length-1){
         return true;
       }
      
       if(start > nums.length-1){
         return false;
       }
       if(nums[start] % 5 == 0){
         if(start < nums.length-1 && nums[start+1] == 1){
           return groupSum5(start + 2, nums, target - nums[start]);
         }
         return groupSum5(start + 1, nums, target - nums[start]);
       }
       return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start+1, nums, target);
    }
    public static void main(String[] args){
        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 10;
        arr[3] = 4;
        System.out.println(groupSum5(0, arr, 19) + "...should be true");
        System.out.println(groupSum5(0, arr, 17) + "...should be true");
        System.out.println(groupSum5(0, arr, 12) + "...should be false");
    }
}