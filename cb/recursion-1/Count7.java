/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class Count7{
    /*
    Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    */
    // tree-y
    public static int count7(int n) {
        if ( n == 7 ) {
          return 1;
        }
        if ( n < 10 ) {
          return 0;
        }
        return count7( n%10 ) + count7( n/10 );
      }
    public static void main(String[] args){
        System.out.println(count7(717) + "...should be 2");
        System.out.println(count7(7) + "...should be 1");
        System.out.println(count7(123) + "...should be 0");
    }
}