/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class PowerN{
    /*
    Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    */
    public static int powerN(int base, int n) {
        if(n == 1){
          return base;
        }
        return base * powerN(base, n-1);
    }
    public static void main(String[] args){
        System.out.println(powerN(3, 1) + "...should be 3");
        System.out.println(powerN(3, 2) + "...should be 9");
        System.out.println(powerN(3, 3) + "...should be 27");
    }
}