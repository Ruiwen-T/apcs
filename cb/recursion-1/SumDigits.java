/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class SumDigits{
    /*
    Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    */
    public static int sumDigits(int n) {
        if ( n == 0 ) {
          return 0;
        }
        return n%10 + sumDigits( n/10 );
    }
    public static void main(String[] args){
        System.out.println(sumDigits(126) + "...should be 9");
        System.out.println(sumDigits(49) + "...should be 13");
        System.out.println(sumDigits(12) + "...should be 3");
    }
}