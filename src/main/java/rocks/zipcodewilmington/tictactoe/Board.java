package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private char r1c1, r1c2, r1c3, r2c1, r2c2, r2c3, r3c1, r3c2, r3c3;
    private String winner;
    private Boolean favorOfX, favorOfY, tied;



    public Board(Character[][] matrix) {
        this.r1c1 = matrix[0][0];
        this.r1c2 = matrix[0][1];
        this.r1c3 = matrix[0][2];
        this.r2c1 = matrix[1][0];
        this.r2c2 = matrix[1][1];
        this.r2c3 = matrix[1][2];
        this.r3c1 = matrix[2][0];
        this.r3c2 = matrix[2][1];
        this.r3c3 = matrix[2][2];


    }

    public Boolean isInFavorOfX() {

        Boolean xWinner = false;

        /* Extract some methods when I get some time
         for now, just getting in something that I can reason out
         Getting the character at each location on the board
         Checking if the rows, then columns, then diagnols all have X or O
        */

        if (r1c1 == 'X' && r1c2 == 'X' && r1c3 == 'X') {
            xWinner = true;
        } else if (r2c1 == 'X' && r2c2 == 'X' && r2c3 == 'X') {
            xWinner = true;
        } else if (r3c1 == 'X' && r3c2 == 'X' && r3c3 == 'X') {
            xWinner = true;
        } else if (r1c1 == 'X' && r2c1 == 'X' && r3c1 == 'X') {
            xWinner = true;
        } else if (r1c2 == 'X' && r2c2 == 'X' && r3c2 == 'X') {
            xWinner = true;
        } else if (r1c3 == 'X' && r2c3 == 'X' && r3c3 == 'X') {
            xWinner = true;
        } else if (r1c1 == 'X' && r2c2 == 'X' && r3c3 == 'X') {
            xWinner = true;
        } else if (r1c3 == 'X' && r2c2 == 'X' && r3c1 == 'X') {
            xWinner = true;
        }
        return xWinner;
    }

    public Boolean isInFavorOfO() {

        Boolean oWinner = false;
        if (r1c1 == 'O' && r1c2 == 'O' && r1c3 == 'O') {
            oWinner = true;
        } else if (r2c1 == 'O' && r2c2 == 'O' && r2c3 == 'O') {
            oWinner = true;
        } else if (r3c1 == 'O' && r3c2 == 'O' && r3c3 == 'O') {
            oWinner = true;
        } else if (r1c1 == 'O' && r2c1 == 'O' && r3c1 == 'O') {
            oWinner = true;
        } else if (r1c2 == 'O' && r2c2 == 'O' && r3c2 == 'O') {
            oWinner = true;
        } else if (r1c3 == 'O' && r2c3 == 'O' && r3c3 == 'O') {
            oWinner = true;
        } else if (r1c1 == 'O' && r2c2 == 'O' && r3c3 == 'O') {
            oWinner = true;
        } else if (r1c3 == 'O' && r2c2 == 'O' && r3c1 == 'O') {
            oWinner = true;
        }
        return oWinner;
    }

    public Boolean isTie() {
        Boolean tied = false;
        Boolean xWin = isInFavorOfX();
        Boolean oWin = isInFavorOfO();

        if (isInFavorOfO() && isInFavorOfX()) {
            tied = true;
        } else if (!isInFavorOfO() && !isInFavorOfX()) {
            tied = true;
        }

        return tied;
    }

    public String getWinner() {
        Boolean tied = isTie();
        Boolean oWins = isInFavorOfO();
        Boolean xWins = isInFavorOfX();
        String winner = "";

        if (!tied && oWins) {
            winner = "O";
        } else if (!tied && xWins) {
            winner = "X";
        }


        return winner;
    }

}
