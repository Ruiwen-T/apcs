//Long Island Railroad: Lawrence Joa, Ivina Wang, Raven (Ruiwen) Tang
//APCS
//HW08 - Refactor Freshie Zero: building upon HW07
//2021-09-30
/*
DISCOVERIES:
- We reached the conclusion that “hardcoded” means pre-programmed into the function.
- We reviewed information about random from our summer prework, since we considered implementing random in the function greet().

UNRESOLVED MYSTERIES:
- Should we use random in implementing greet()? Our team numbers had separate opinions about this question. 
- Without the use of random, our idea was to use if statements and case on the value of string s. However, this approach pre-determines which person will always be greeted, and the argument in the function call must be modified to change the person greeted.
*/

public class Greet {
        public static void main(String[] args){
                System.out.println("No hablo queso.");
		greet("Foo");
        }
	public static void greet(String s){ //greets 3 hardcoded persons of interest
		if(s == "Foo"){
			System.out.println("Why, hello there, Foo. How do you do?");
		}
		else if(s == "Moo"){
			System.out.println("Why, hello there, Moo. How do you do?");
		}
		else{
			System.out.println("Why, hello there, NotFooNorMoo. How do you do?");
		}
	}

}
