/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class Array6{
    /*
    Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
    */
    public static boolean array6(int[] nums, int index) {
        if ( index == nums.length ) {
        return false;
        }
        if ( nums[index] == 6 ) {
        return true;
        }
        return array6( nums, index+1 );
    }
    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 6;
        arr[2] = 4;
        System.out.println(array6(arr, 0) + "...should be true");
        arr = new int[2];
        arr[0] = 1;
        arr[1] = 4;
        System.out.println(array6(arr, 0) + "...should be true");
        arr = new int[1];
        arr[0] = 6;
        System.out.println(array6(arr, 0) + "...should be true");
    }
}