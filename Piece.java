import java.lang.Enum;
import java.util.HashMap;

public class Piece
{
    //color ENUM
    //location
    //king bool
    //can move bool

    //convert move
    //move

    private Enum color;
    private int locX;
    private int locY;
    private boolean king;

    public Piece(Enum color, int locX, int locY)
    {
        this.color = color;
        this.locX = locX;
        this.locY = locY;
        this.king = false;
    }

    public void makeKing()
    {
        this.king = true;
    }

    public boolean canMove()
    {
        //check board for moves, jumps
        //if king, check backwards too
    }

    public void move(int newX, int newY)
    {
        //validate move
        //change loc values
        //update grid
    }

    //assuming traditional chess/checkers conventions
    /*a b c d e f g h
    8
    7
    6
    5
    4
    3
    2
    1
    */
    public void move(char Xval, int Yval)
    {
        convertMove(Xval, Yval);
    }

    private void convertMove(char Xval, int Yval)
    {
        //convert char
        int newX = CheckersVI.xConvert.get(Xval);
        int newY = CheckersVI.yConvert.get(Yval);
        move(newX, newY);
    }
}
