/***
Fresh :: Brianna Tieu, Raven (Ruiwen) Tang, William Vongphanith
APCS pd06
HW65: How Many Queens Can A Thinker Place, If a Thinker Can Place Queens... / recursive solution to find n queen configuration on n * n board
2022-02-16
time spent: 0.5 hrs
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

    private int[][] _board;

    public QueenBoard( int size )
    {
        _board = new int[size][size];
    }


    /***
     * precondition: board is filled with 0's only.
     * postcondition:
     * If a solution is found, board shows position of N queens,
     * returns true.
     * If no solution, board is filled with 0's,
     * returns false.
     */
    public boolean solve()
    {
        int queenCount = 0;
        for (int i = 0; i < _board[0].length; i++) {
            solveH(i);
            if (solveH(i) == false) {
                _board = new int[_board.length][_board.length];
            }
        }
        return true;
    }


    /**
     *Helper method for solve.
     */
    private boolean solveH( int col )
    {
        if( col == _board[0].length ) {
            return true;
        }
        for( int r = 0; r < _board.length; r++ ) {
            if( addQueen( r, col ) ) {
		addQueen( r, col);
                return solveH( col + 1 );
            }
            removeQueen( r, col );
        }
        return false;
    }


    public void printSolution()
    {
        /** Print board, a la toString...
         Except:
         all negs and 0's replaced with underscore
         all 1's replaced with 'Q'
         */
        String ans = "";
        for (int i = 0; i < _board.length; i++) {
            for (int j = 0; j < _board[0].length; j++) {
                if (_board[i][j] == 1) {
                    ans += "Q";
                }
                else {
                    ans += "_";
                }
                if (j != _board[0].length - 1) {
                    ans += "\t";
                }
            }
            ans += "\n";
        }
        System.out.println(ans);
    }



    //================= YE OLDE SEPARATOR =================

    /***
     * returns if queen can be placed at (row, col). 
       if true: sets (row, col) to 1 and decreases every square attacked by 1

     * precondition: col < _board[row].length
		     row < _board.length
		     _board and its elements have been initialized

     * postcondition: if true: queen is placed at (row, col) and all other squares in queen's region of attack have decreased value
		      if false: board remains the same
     */
    private boolean addQueen(int row, int col)
    {
        if(_board[row][col] != 0){
            return false;
        }
        _board[row][col] = 1;
        int offset = 1;
        while(col+offset < _board[row].length){
            _board[row][col+offset]--;
            if(row - offset >= 0){
                _board[row-offset][col+offset]--;
            }
            if(row + offset < _board.length){
                _board[row+offset][col+offset]--;
            }
            offset++;
        }
        //System.out.println(this.toString());
        return true;
    }


    /***
     * Returns if there is a queen at (row, col)
       If true: removes queen and updates board accordingly

     * precondition: col < _board[row].length
		     row <_board.length
		     _board and its elements have been initialized

     * postcondition: if true: queen has been removed from (row, col) - the value of that element = 0
		               all squares in queen's region of attack increase in value
		      if false: baord remains the same
     */
    private boolean removeQueen(int row, int col){
        if ( _board[row][col] != 1 ) {
            return false;
        }
        _board[row][col] = 0;
        int offset = 1;

        while( col+offset < _board[row].length ) {
            _board[row][col+offset]++;
            if( row - offset >= 0 ) {
                _board[row-offset][col+offset]++;
            }
            if( row + offset < _board.length ) {
                _board[row+offset][col+offset]++;
            }
            offset++;
        }
        return true;
    }


    /***
     * Returns a string representing _board, with elements separated by tabs and rows separated by new lines
    
     * precondition: _board and its elements are initialized

     * postcondition: _board elements have not been manipulated
     */
    public String toString()
    {
        String ans = "";
        for( int r = 0; r < _board.length; r++ ) {
            for( int c = 0; c < _board[0].length; c++ ) {
                ans += _board[r][c]+"\t";
            }
            ans += "\n";
        }
        return ans;
    }


    //main method for testing...
    public static void main( String[] args )
    {
      QueenBoard b = new QueenBoard(5);
         System.out.println(b);
         /** should be...
            0	0	0	0	0
            0	0	0	0	0
            0	0	0	0	0
            0	0	0	0	0
            0	0	0	0	0
         */

         b.addQueen(3,0);
         b.addQueen(0,1);
         System.out.println(b);
         /** should be...
            0	1	-1	-2	-1
            0	0	-2	0	0
            0	-1	0	-1	0
            1	-1	-1	-1	-2
            0	-1	0	0	0
         */

         b.removeQueen(3,0);
         System.out.println(b);
         /** should be...
            0	1	-1	-1	-1
            0	0	-1	0	0
            0	0	0	-1	0
            0	0	0	0	-1
            0	0	0	0	0
         */

	QueenBoard eight = new QueenBoard(8);
	System.out.println(eight.solve());
	System.out.println(eight);
       }
}//end class
