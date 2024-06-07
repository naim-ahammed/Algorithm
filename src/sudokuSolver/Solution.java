package sudokuSolver;

import java.util.Scanner;

public  class Solution {
     public boolean isSafe(char[][] board, int row, int col, int number){
     // row & column
         for (int i = 0; i < board.length; i++) {
             if (board[i][col]==(char) (number+ '0')){ //check row != same column cover
             return false;
             }
             if (board[row][i]==(char) (number+ '0')){ //check column != same row
                 return false;
             }
         }

         //grid
         int startingRow = (row/3)*3;  // find starting Row
         int startingColumn = (col/3)*3;  // find starting Column

         for (int i = startingRow; i <startingRow+3; i++) {
             for (int j = startingColumn; j <startingColumn+3 ; j++) {
                 if (board[i][j]==(char) (number+'0')){  //type cust ,,, int number to board char + string
                 return false;
                 }
             }
         }
         return true;
     }


     public boolean helper(char[][] board, int row, int col) {  //recreation
         if (row == board.length) {   //all board cover
             return true;
         }
         int newRow = 0;
         int newCol = 0;
         if (col != board.length - 1) {   //!=last column
             newRow = row;
             newCol = col + 1;
         } else { //last colum --> 2nd column
             newRow = row + 1;
             newCol = 0;
         }
         if (board[row][col] != '.') {    //bord != empty --> call helper
             if (helper(board, newRow, newCol)) {
                 return true; //solve the problem
             }
         } else {
             for (int i = 0; i < 9; i++) {  // check 1 to 9 recreatively
                 if (isSafe(board, row, col, i)) {   // check validity
                     board[row][col] = (char) (i + '0');  //type cust ,,, int i to board char + string
                     if (helper(board, newRow, newCol)) {  //next cells
                         return true;
                     } else {
                         board[row][col] = '.'; //null
                     }}}}
         return false;
     }
     public void SodokuSolve(char[][] board){
         helper(board,0,0); //recreation
     }
}

  class SudokuSolverApp {
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solver = new Solution();

        char[][] sudokuBoard = new char[9][9];

        System.out.println("Enter the Sudoku board (use '.' for empty cells):");
        for (int i = 0; i < 9; i++) {
            String row = scanner.next();
            for (int j = 0; j < 9; j++) {
                sudokuBoard[i][j] = row.charAt(j);
            }
        }

//        char[][] sudokuBoard = {
//                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        };

        System.out.println("Sudoku board before solving:");
        printBoard(sudokuBoard);

        solver.SodokuSolve(sudokuBoard);

        System.out.println("\nSudoku board after solving:");
        printBoard(sudokuBoard);
    }
}



//         input
//        53..7....
//        6..195...
//        .98....6.
//        8...6...3
//        4..8.3..1
//        7...2...6
//        .6....28.
//        ...419..5
//        ....8..79