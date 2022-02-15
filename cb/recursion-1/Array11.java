/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class Array11{
    /*
    Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
    */
    public static int array11(int[] nums, int index) {
        if ( index == nums.length ) {
          return 0;
        }
        if ( nums[index] == 11 ) {
          return 1 + array11( nums, index+1 );
        }
        return array11( nums, index+1 );
      }
    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 11;
        System.out.println(array11(arr, 0) + "...should be 1");
        arr = new int[2];
        arr[0] = 11;
        arr[1] = 11;
        System.out.println(array11(arr, 0) + "...should be 2");
        arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        System.out.println(array11(arr, 0) + "...should be 0");
    }
}