/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class GroupNoAdj{
    /*
    Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint: If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen. (No loops needed.)
    */
    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if(target == 0){
         return true;
       }
      
       if(start > nums.length-1){
         return false;
       }
       return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start+1, nums, target);
      }
    public static void main(String[] args){
        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 10;
        arr[3] = 4;
        System.out.println(groupNoAdj(0, arr, 12) + "...should be true");
        System.out.println(groupNoAdj(0, arr, 14) + "...should be false");
        System.out.println(groupNoAdj(0, arr, 7) + "...should be false");
    }
}