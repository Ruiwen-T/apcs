/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class BunnyEars2{
    /*
    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    */
    public static int bunnyEars2(int bunnies) {
        if ( bunnies == 0 ) {
          return 0;
        }
        if ( bunnies%2 == 0 ) {
          return 3 + bunnyEars2( bunnies-1 );
        }
        return 2 + bunnyEars2( bunnies-1 );
       }
    public static void main(String[] args){
        System.out.println(bunnyEars2(0) + "...should be 0");
        System.out.println(bunnyEars2(1) + "...should be 2");
        System.out.println(bunnyEars2(2) + "...should be 5");
    }
}