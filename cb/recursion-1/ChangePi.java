/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class ChangePi{
    /*
    
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
    */
    public static String changePi(String str) {
        if (str.length() <= 1) {
          return str;
        }
        if (str.substring(str.length()-2).equals("pi")) { // we need to ensure length >= 2 to call this
          return changePi( str.substring(0,str.length()-2) ) + "3.14";
        }
        return changePi( str.substring(0,str.length()-1) ) + str.substring(str.length()-1);
      }
    public static void main(String[] args){
        System.out.println(changePi("xpix") + "...should be x3.14x");
        System.out.println(changePi("pipi") + "...should be 3.143.14");
        System.out.println(changePi("pip") + "...should be 3.14p");
    }
}