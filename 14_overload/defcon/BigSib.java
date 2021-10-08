/*
Team SRM: Salaj Rijal, Raven (Ruiwen) Tang, May Qiu (collaborated with Rin Fukuoka b/c of team availability conflicts)
APCS
HW14 -- Customize Your Creation / building on HW13 with default and overload constructors
2021-10-08
*/

/* 
DISCO 
- We are more clear on the difference between a default constructor and an overload constructor. What we completed for homework seems to align with the definitions, notes, and conventions explained in class.
- It is helpful to add comments in the BigSib class denoting instance variables, default constructors, overload constructors, and methods to help maintin that order and differentiate between similar concepts.
- Both default and overloaded versions of Greet.java did not require the use of the setHelloMsg method.

QCC 
- As noted in our DISCO, both default and overloaded versions of Greet.java did not require the use of the setHelloMsg method. The functionality of initializing a unique helloMsg value was transferred from e setHelloMsg method to the overload constructor. However, is there a way to change the value of helloMsg after the initialization of an instance of class BigSib? We attempted "tracy = BigSib("Hello");" on a line after initializing BigSib tracy. But this yielded a compile time error that did not recognize the symbol method BigSib(String).
- Moreover, in the default version of Greet.java, there doesn't appear to be a way to change the value of helloMsg from "Word up".
*/

public class BigSib{
    //instance variable
    private String helloMsg;
    //constructors
    public BigSib(){
	helloMsg = "Word up";
    }
    //methods
    public String greet(String name){
        return (helloMsg + " " + name);
    }
}
