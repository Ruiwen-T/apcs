// Avocado: Brianna Tieu, Raven (Ruiwen) Tang
// APCS pd06
// HW68 -- ...and T-, Tr-, Tri-, Tries Again Until It's Done / recursively probing for a closed cycle
// 2022-03-01
// time spent:  hrs

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO
 * Pick a starting position.
 * If the number of moves = n*n, you have successfully completed a tour, and you're done.
 * If the position you are at has already been visited or is in the "moat," this tour is unsuccessful. 
 * Else, mark the position you are at with the current number of moves.
 * Repeat steps 2-4 with all of the positions that are a valid knight's move away from your current position. Incrememnt the moves counter by 1.
 * If none of the paths above led to a tour, "backtrack" and set this position to 0.
 * DISCO
 * - We can use Thread.sleep to slow down the process of our code and visualize the board becoming populated by knights.
 * - Since we check if the position is in the moat or already visited, we can simply call findTour() for all of the possible knight moves. We don't have to worry about whether these moves are valid or not, because the previous conditional will catch all of these illegal cases.
 * - We use return in a void method to "break" from the process that is running and stop progressing through the method.
 * QCC
 * - Why are we getting an "[0;0H" in the top left corner of our board when it is printed?
 * - We need to add by 2 to the random integer between 0 and n, inclusive of 0, when we generate startX and startY to ensure that we do not land in the moat.
 * - Both classes (Knighttour and TourFinder) are in the same file.
 *** The following times are taken with delay() commented out. ***
 * Mean execution times for boards of size n*n:
 * n=5   0.793s    across 3 executions
 * n=6   1.142s    across 3 executions
 * n=7   179.701s    across 3 executions
 * n=8   631.674s    across 3 executions
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( " [2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    int startX = (int)(Math.random() * n) + 2;
    int startY = (int)(Math.random() * n) + 2;
    //tf.findTour( startX, startY, 1 );   // 1 or 0 ? either is fine as long as it is kept consistent throughout, and the offset is taken into consideration
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    /*
    for(int i = 2; i < n+2; i++){
        for(int j = 2; j < n+2; j++){
            tf.findTour( i, j, 1);
        }
    }
    */
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n;

    //init 2D array to represent square board with moat
    _board = new int[n+4][n+4];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    for(int i = 0; i < n+4; i++){
        for(int j = 0; j < n+4; j++){
            if(i < 2 || j < 2 || i > n+1 || j > n+1){
                _board[i][j] = -1;
            }
            else{
                _board[i][j] = 0;
            }
        }
    }
    //---------------------------------------------------------

  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = " [0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength+4; i++ ) {
      for( j=0; j < _sideLength+4; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/
  public void findTour( int x, int y, int moves )
  {
    //delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if ( moves == _sideLength * _sideLength ) System.exit(0);

    //primary base case: tour completed
    if ( moves == _sideLength * _sideLength ) {
      _solved = true;
      System.out.println( this ); //refresh screen
      return;
    }
    //other base case: stepped off board or onto visited cell
    if ( _board[x][y] != 0 ) {
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves;

      System.out.println( this ); //refresh screen

      //delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      findTour(x+1, y+2, moves+1);
      findTour(x+2, y+1, moves+1);
      findTour(x+2, y-1, moves+1);
      findTour(x+1, y-2, moves+1);
      findTour(x-1, y-2, moves+1);
      findTour(x-2, y-1, moves+1);
      findTour(x-2, y+1, moves+1);
      findTour(x-1, y+2, moves+1);

      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
      _board[x][y] = 0;

      System.out.println( this ); //refresh screen
    }
  }//end findTour()

}//end class TourFinder