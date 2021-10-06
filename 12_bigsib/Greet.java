/*
Team Bernard Jr.: May Qiu (ducky: Perry Jr), Raven (Ruiwen) Tang (ducky: Bernard)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz / building on HW10 
2021-10-06
*/

/* 
DISCO
- We could successfully compile BigSib.java with javac. Then, $ java BigSib yields the error: Main method not found in class BigSib, please define the main method as: public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application. This discovery aligns with our expectations from class, as we learned that a class must have a main() method to be executable. We now also know that the compiler doesn’t necessarily check for a main() method.
- We encountered the error: non-static variable helloMsg cannot be referenced from a static context. We were able to resolve this error by removing “static” from the greet and setHelloMsg methods.
- Since a class is the blueprint for objects of the same type, we were able to use BigSib name = new BigSib() to initialize many objects of type BigSib.

QCC
- Why is there an error when referencing a non-static variable in a static method?
- Are “//end main()” and “//end Greet” standard notation for labelling closing brackets?
- Seems like one could have created multiple BigSibs, one for each line of output, or used richard for all lines and utilizing setHelloMsg and greet?
*/

public class Greet {
    public static void main( String[] args ){
        String greeting;

    	BigSib richard = new BigSib();
    	richard.setHelloMsg("Word up");

    	greeting = richard.greet("freshman");
    	System.out.println(greeting);

	BigSib allison = new BigSib();
	allison.setHelloMsg("Salutations");
	
	greeting = allison.greet("Dr. Spaceman");
	System.out.println(greeting);

	BigSib alexander = new BigSib();
	alexander.setHelloMsg("Hey ya");

	greeting = alexander.greet("Kong Fooey");
	System.out.println(greeting);

	BigSib gertrude = new BigSib();
	gertrude.setHelloMsg("Sup");

	greeting = gertrude.greet("mom");
	System.out.println(greeting);

  } //end main()
} //end Greet
