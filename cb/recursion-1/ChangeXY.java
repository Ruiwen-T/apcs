/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class ChangeXY{
    /*
    Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
    */
    // tree-y
    public static String changeXY(String str) {
        if (str.equals("x")) {
        return "y";
        }
        if (str.length() <= 1) {
        return str;
        }
        return changeXY( str.substring(0,str.length()/2) ) + changeXY( str.substring(str.length()/2) );
    }
    public static void main(String[] args){
        System.out.println(changeXY("codex") + "...should be codey");
        System.out.println(changeXY("xxhixx") + "...should be yyhiyy");
        System.out.println(changeXY("xhihix") + "...should be yhiyhiy");
    }
}