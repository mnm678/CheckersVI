import java.awt.Point;
import java.util.LinkedList;

 
public class Board
{
	//Grid with every other space indicated
	//knows which spaces are full
	///and the piece in the holes
	//board doesnt not move pieces, simply updates locations based on piece methods
	
	//8x8 grid
	  //0 1 2 3 4 5 6 7  x
	//0
	//1
	//y
	
	private int grid[][];
	private static Board instance = null;
	protected Board()
	{
		this.grid = new int[8][8];
	}
	
	public static Board getInstance()
	{
		if(instance==null)
			instance = new Board();
		return instance;
	}
	public LinkedList<Point>initalPieces(COLOR color) 
	{
		LinkedList<Point> initalList = new LinkedList<Point>();
		if(color.equals(color.RED))
		{
			
			for(int y =0; y < 3; y++)
			{
				for(int x =0; x<8; x++)
				{
					if(y%2==0 && x%2==0)
					{
						//System.out.println(x + " " + y);
						initalList.add(new Point(x,y));
					}
					else if(y%2==1 && x%2==1)
					{
						//System.out.println(x + " " + y);
						initalList.add(new Point(x,y));
					}
				}
			}
		}
		else
		{
			for(int y =5; y < 8; y++)
			{
				for(int x =0; x<8; x++)
				{
					if(y%2==0 && x%2==0)
						initalList.add(new Point(x,y));
					else if(y%2==1 && x%2==1)
						initalList.add(new Point(x,y));
				}
			}
		}
		return initalList;
	}
}
