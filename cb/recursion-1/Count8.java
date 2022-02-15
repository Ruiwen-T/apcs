/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class Count8{
    /*
    Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    */
    // tree-y
    public static int count8(int n) {
        if ( n == 0 ) {
          return 0;
        }
        if ( n%10 == 8 && (n/10)%10 == 8 ) {
          return 2 + count8( n/10 );
        }
        if ( n%10 == 8 ) {
          return 1 + count8( n/10 );
        }
        return count8( n/10 );
    }
    public static void main(String[] args){
        System.out.println(count8(8) + "...should be 1");
        System.out.println(count8(818) + "...should be 2");
        System.out.println(count8(8818) + "...should be 4");
    }
}