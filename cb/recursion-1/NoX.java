/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class NoX{
    /*
    Given a string, compute recursively a new string where all the 'x' chars have been removed.
    */
    public static String noX(String str) {
        if (str.equals("x")) {
          return "";
        }
        if (str.length() <= 1) {
          return str;
        }
        return noX( str.substring(0,str.length()/2) ) + noX( str.substring( str.length()/2 ) );
    }
    public static void main(String[] args){
        System.out.println(noX("xaxb") + "...should be ab");
        System.out.println(noX("abc") + "...should be abc");
        System.out.println(noX("xx") + "...should be ");
    }
}