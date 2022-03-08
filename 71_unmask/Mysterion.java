// Avocado: Raven (Ruiwen) Tang {in-class collaboration with May Qiu, Jeffery Tang}
// APCS pd06
// HW71 -- Reading for intent, tracing for VICTORY / observing and hypothesizing purpose of mystery method
// 2022-03-07
// time spent:  hrs

/***
 * SKEELTON for
 * class Mysterion
 * tests preliminary hypotheses re: utility of mystery algo
 * 
 * <h1>It's a Bird, It's a Plane! It's.... MYSTERION</h1>
 * The Mysterion method ... rearranges the elements from index a to b so that the values from index a to c are the smallest values in the range, and the values from c to b are the largest values in the range.
 * <p>
 * <b>Note:</b> BLAH blah blah, yakkety schmakketty...
 * @author  Trey Parker, Matt Stone
 * @version 3.1415926535897932384626433
 * @since   2022-03-07m 
 *
 * algo as pseudocode:
 * ------------------------------
 *     v = arr[c]
 *     swap arr[c], arr[b]  
 *     s = a
 *     for i in [a..b-1]
 *         if arr[i] < v
 *             swap arr[s], arr[i]
 *             s+=1
 *     swap arr[b], arr[s] 
 * 
 * DISCO
 * Storing a value in a temporary variable is the key to swapping. 
 * a should be less than b if we would like to make a number of swaps based on comparisons, as the for loop iterates from index a to b-1.
 * Running mysterion with each c from a to b will sort the array in that interval.
 * 
 * QCC
 * Is s or c a reasonable value to return in mysterion()? s records a + the number of swaps made, and c records the original index of interest.
 * a, b, and c must be within the valid indices of the array. 
 * If a > c > b, the value at position a is flipped to b, the value at position b is flipped to c, and the value at position c is flipped to a.
 * If a > b > c, the value at position a is flipped to b, the value at position b is flipped to c, and the value at position c is flipped to a.
 * 
 * q0: What does it do?
 * a0: The method rearranges the elements from index a to b so that the values from index a to c are the smallest values in the range, and the values from c to b are the largest values in the range.
 * 
 * q1: O(?)
 * a1: O(n), because it iterates through the elements from index a to c once.
 * 
 ***/


public class Mysterion 
{    
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array 
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }
    
  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  /**
   * int smallest(int[],int,int,int)
   * DESCRIP: rearranges the elements from index a to b so that the values from index a to c are the smallest values in the range, and the values from c to b are the largest values in the range
   * 
   * @param arr - passes in the array of interest, which will be rearranged
   * @param a - the first index of interest for the method, the beginning of the window it will look at
   * @param b - the last index of interest for the method, the end of the window it will look at
   * @param c - the index that represents the split. to the left are the smallest in the window, to the right are the largest in the window
   * @return int 
   *
   */
  public static int smallest( int arr[], int beginWindow, int endWindow, int split)
  {
    int v = arr[split];
    swap(split, endWindow, arr);
    int s = beginWindow;
    for(int i = beginWindow; i < endWindow; i++){
       if(arr[i] < v){
           swap(s, i, arr);
           s += 1;
       }
    }
    swap(endWindow, s, arr); 
    return s;
  }//end mysterion


  //main method for testing
  public static void main( String[] args )
  {
    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};
    int[] arr6 = {8,21,17,69,343};
    /**
    smallest(arr6, 4, 2, 3);
    printArr(arr6);
    smallest(arr6, 4, 2, 1);
    printArr(arr6);
    **/
    // run mysterion on each array,
    // holding a & b fixed, varying c...
    for( int testC = 0; testC < 5; testC++ ) {
    System.out.println("arr1: ");
    printArr(arr1);
    smallest(arr1,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c=" 
    + testC +"...");
    printArr(arr1);
    System.out.println("-----------------------");
    System.out.println("arr3:");
    printArr(arr3);
    smallest(arr3,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c=" 
    + testC +"...");
    printArr(arr3);
    System.out.println("-----------------------");
    System.out.println("arr4:");
    printArr(arr4);
    smallest(arr4,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c=" 
    + testC +"...");
    printArr(arr4);
    System.out.println("-----------------------");
    System.out.println("arr5:");
    printArr(arr5);
    smallest(arr5,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c=" 
    + testC +"...");
    printArr(arr5);
    System.out.println("-----------------------");
    }
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main

}//end class Mysterion