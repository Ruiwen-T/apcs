/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class Factorial{
    /*
    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
    */
    public static int factorial(int n) {
        if(n == 1){
          return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        System.out.println(factorial(1) + "...should be 1");
        System.out.println(factorial(2) + "...should be 2");
        System.out.println(factorial(3) + "...should be 6");
    }
}