/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class CountX{
    /*
    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
    */
    public static int countX(String str) {
        if (str.equals("x")) {
        return 1;
      }
      if ( str.length() <= 1 ) {
        return 0;
      }
      return countX( str.substring(0,str.length()-1 ) ) + countX( str.substring(str.length()-1 ) );
    }
    
    /* tree-y
    public static int countX(String str) {
        if (str.equals("x")) {
        return 1;
      }
      if ( str.length() <= 1 ) {
        return 0;
      }
      return countX( str.substring(0,str.length()/2 ) ) + countX( str.substring(str.length()/2 ) );
    }
    */
    public static void main(String[] args){
        System.out.println(countX("xxhixx") + "...should be 4");
        System.out.println(countX("xhixhix") + "...should be 3");
        System.out.println(countX("hi") + "...should be 0");
    }
}