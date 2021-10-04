/*
Long Island Railroad: Lawrence Joa (duckies: Steve, John), Ivina Wang (ducky: Sealie), Raven (Ruiwen) Tang (ducky: Bernard)
APCS
HW09 -- What Are BigSibs Good For? / building on HW08, adding BigSib.java 
2021-10-04
*/

/*
DISCOVERIES:
- BigSib.java does not need to be explicitly compiled if Greet.java is compiled (we don't need to run javac BigSib.java)
- When Greet.java is compiled, a BigSib.class file is created as well
- BigSib does not require a main function. It is not being run, but Greet is able to use it.
- We use className.functionName(arguments) to use a function in another class

UNRESOLVED MYSTERIES:
- What would be the use of another java file? Does it help with organization or serve a more technical purpose?  
*/

public class Greet {
        public static void main(String[] args){
      		BigSib.greet("Flim");
		BigSib.greet("Flam");
		BigSib.greet("Kazaam");
        }
}



