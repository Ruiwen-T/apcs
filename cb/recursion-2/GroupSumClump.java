/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class GroupSumClump{
    /*
    Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target, with this additional constraint: if there are numbers in the array that are adjacent and the identical value, they must either all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group. (one loop can be used to find the extent of the identical values).
    */
    public static boolean groupSumClump(int start, int[] nums, int target) {
        if(target == 0 && start > nums.length-1){
         return true;
       }
      
       if(start > nums.length-1){
         return false;
       }
       int count = 0;
       while(start + count < nums.length - 1 && nums[start + count + 1] == nums[start + count]){
         count += 1;
       }
       return groupSumClump(start + count + 1, nums, target - nums[start]*(count + 1)) || groupSumClump(start+count+1, nums, target);
    }
    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 8;
        System.out.println(groupSumClump(0, arr, 10) + "...should be true");
        arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 8;
        arr[4] = 1;
        System.out.println(groupSumClump(0, arr, 14) + "...should be true");
        arr = new int[4];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 4;
        arr[3] = 8;
        System.out.println(groupSumClump(0, arr, 14) + "...should be false");
    }
}