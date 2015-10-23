public class CheckersVI
{
	 private HashMap<int, int> yConvert;
	 private HashMap<char, int> xConvert;

	 public static void main(String[] args)
	 {
		 Board test1 = Board.getInstance();
		 test1.initalPieces(COLOR.RED);
	     fillConverts();

	 }

	 private void fillConverts()
	 {
		   xConvert.put('a', 0);
		   xConvert.put('b', 1);
		   xConvert.put('c', 2);
		   xConvert.put('d', 3);
		   xConvert.put('e', 4);
		   xConvert.put('f', 5);
		   xConvert.put('g', 6);
		   xConvert.put('h', 7);
	
		   int key = 8;
		   for(int i=0, i<8, i++)
		   {
		       yConvert.put(key, i);
		       key--;
		   }
	 }
    
}