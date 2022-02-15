/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class GroupSum{
    /*
    Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target? This is a classic backtracking recursion problem. Once you understand the recursive backtracking strategy in this problem, you can use the same pattern for many problems to search a space of choices. Rather than looking at the whole array, our convention is to consider the part of the array starting at index start and continuing to the end of the array. The caller can specify the whole array simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.
    */
    public static boolean groupSum(int start, int[] nums, int target) {
        if(target == 0){
          return true;
        }
       
        if(start > nums.length-1){
          return false;
        }
        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start+1, nums, target);
    }
    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 8;
        System.out.println(groupSum(0, arr, 10) + "...should be true");
        System.out.println(groupSum(0, arr, 14) + "...should be true");
        System.out.println(groupSum(0, arr, 9) + "...should be false");
    }
}