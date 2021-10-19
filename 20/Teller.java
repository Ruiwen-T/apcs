public class Teller{
	public static void main(String[] args){
		BankAccount leopard = new BankAccount();
		
		//test setName
		System.out.println(leopard.setName("Leopards")); //expected: null
		System.out.println(leopard.name); //expected: Leopards
		
		//test setPasswd
		System.out.println(leopard.setPasswd("password")); //exppected: null
		System.out.println(leopard.setPasswd("password")); //expected: password, trying to break by setting same password twice
		
		//test setPin
		System.out.println(leopard.setPin(1234)); //expected: 0
		System.out.println(leopard.setPin(1000)); //expected: 1234
		System.out.println(leopard.setPin(9999)); //expected: Your pin input was invalid, it has been set to its default value. 1000
		System.out.println(leopard.setPin(9)); //expected: Your pin input was invalid, it has been set to its default value. 9999
		System.out.println(leopard.setPin(-9999)); //expected: Your pin input was invalid, it has been set to its default value. 9999
		
		//test setAcctNum
		System.out.println(leopard.setAcctNum(123456789)); //expected: 0
		System.out.println(leopard.setAcctNum(100000000)); //expected: 123456789
		System.out.println(leopard.setAcctNum(999999999)); //expected: Your account number input was invalid, it has been set to its default value. 1000000000
		System.out.println(leopard.setAcctNum(9)); //expected: Your account number input was invalid, it has been set to its default value. 999999999
		System.out.println(leopard.setAcctNum(leopard.pin*100000)); //expected: 999999999
		
		//test setBalance
		System.out.println(leopard.setBalance(123456789)); //expected: 0
		System.out.println(leopard.setBalance(-123456789)); //expected: 0
		System.out.println(leopard.setBalance(19*2.0)); //expected: 0
		System.out.println(leopard.setBalance()); //expected: 0

	}
}
