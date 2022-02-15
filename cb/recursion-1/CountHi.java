/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class CountHi{
    /*
    Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
    */
    // tree-y
    public static int countHi(String str) {
        if (str.equals("hi")) {
          return 1;
        }
        if (str.length() <= 2) {
          return 0;
        }
        return countHi(str.substring(0,str.length()-1)) + countHi(str.substring(str.length()-2)); //iterate by ONE to ensure we don't skip stuff - Raven
    }
    public static void main(String[] args){
        System.out.println(countHi("xxhixx") + "...should be 1");
        System.out.println(countHi("xhixhix") + "...should be 2");
        System.out.println(countHi("hi") + "...should be 1");
    }
}