/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class Triangle{
    /*
    We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
    */
    public static int triangle(int rows) {
        if ( rows == 0 ) {
        return 0;
        }
        return rows + triangle( rows-1 );
    }
    public static void main(String[] args){
        System.out.println(triangle(0) + "...should be 0");
        System.out.println(triangle(1) + "...should be 1");
        System.out.println(triangle(2) + "...should be 3");
    }
}