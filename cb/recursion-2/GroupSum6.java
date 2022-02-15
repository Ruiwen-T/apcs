/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class GroupSum6{
    /*
    Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen. (No loops needed.)
    */
    public static boolean groupSum6(int start, int[] nums, int target) {
        if(target == 0 && start > nums.length-1){
         return true;
       }
      
       if(start > nums.length-1){
         return false;
       }
       if(nums[start] == 6){
         return groupSum6(start + 1, nums, target - nums[start]);
       }
       return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start+1, nums, target);
    }
    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 2;
        System.out.println(groupSum6(0, arr, 8) + "...should be true");
        System.out.println(groupSum6(0, arr, 9) + "...should be false");
        System.out.println(groupSum6(0, arr, 7) + "...should be false");
    }
}