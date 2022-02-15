/*
Junior: Josiah Moltz, Raven (Ruiwen) Tang
APCS pd06
HW64 -- Revisitation / completing CodingBat Recursion-1 and Recursion-2
2022-02-14
time spent: 02.0 hrs
*/

public class BunnyEars{
    /*
    We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    */
    public static int bunnyEars(int bunnies) {
        if(bunnies == 0){
          return 0;
        }
        return 2 + bunnyEars(bunnies-1);
    }
    public static void main(String[] args){
        System.out.println(bunnyEars(0) + "...should be 0");
        System.out.println(bunnyEars(1) + "...should be 2");
        System.out.println(bunnyEars(2) + "...should be 4");
    }
}