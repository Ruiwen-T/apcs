public class Stats{
	
  //brute force, while loop beginning at 1 and working up to lesser input
  public static int gcd(int a, int b){
  	//determine which input is lesser
    int lesser;
    if(a < b){
    	lesser = a;
    }
    else{
    	lesser = b;
    }
    int x = 1;
    int curr = x;
    while(x <= lesser){
      if(a%x == 0 && b%x == 0){
        curr = x;
      }
			x += 1;
    }
    return curr;
  }
  
  //recursion
	public static int gcdER(int a, int b){
  	if(a == b) {
    	return a;
    } else if(a > b) {
    	return gcd(a-b, b);
    } else {
    	return gcd(a, b-a);
    }
  
  }
  
  //iteration
  public static int gcdEW(int a, int b){
  	while(a != b){
    	if(a < b){
      	b = b-a;
      }
      else{
      	a = a-b;
      }
    }
    return a;
  }
  
  public static void main(String[] args){
    
  	//testing brute force
    System.out.println(gcd(3, 3)); //expected: 3
    System.out.println(gcd(9, 15)); //expected: 3
    System.out.println(gcd(15, 18)); //expected: 3
    System.out.println(gcd(3, 14)); //expected: 1
    System.out.println(gcd(16, 28)); //expected: 4
    System.out.println(gcd(1, 40)); //expected: 1
    System.out.println(gcd(20, 12)); //expected: 4
    System.out.println(gcd(-20, -12));
    
    //testing recursion
    System.out.println(gcdER(3, 3)); //expected: 3
    System.out.println(gcdER(9, 15)); //expected: 3
    System.out.println(gcdER(15, 18)); //expected: 3
    System.out.println(gcdER(3, 14)); //expected: 1
    System.out.println(gcdER(16, 28)); //expected: 4
    System.out.println(gcdER(1, 40)); //expected: 1
    System.out.println(gcdER(20, 12)); //expected: 4
    System.out.println(gcdER(-20, -12));    
    //testing iteration
    System.out.println(gcdEW(3, 3)); //expected: 3
    System.out.println(gcdEW(9, 15)); //expected: 3
    System.out.println(gcdEW(15, 18)); //expected: 3
    System.out.println(gcdEW(3, 14)); //expected: 1
    System.out.println(gcdEW(16, 28)); //expected: 4
    System.out.println(gcdEW(1, 40)); //expected: 1
    System.out.println(gcdEW(20, 12)); //expected: 4
    System.out.println(gcdEW(-20, -12));
  }

}
