import java.util.HashMap;;
public class CheckersVI
{
	 public static HashMap<Integer, Integer> yConvert;
	 public static HashMap<String, Integer> xConvert;

	 public static void main(String[] args)
	 {
		 yConvert = new HashMap<Integer, Integer>();
		 xConvert = new HashMap<String, Integer>();
		 Board test1 = Board.getInstance();
		 test1.initalPieces(COLOR.RED);
	     fillConverts();
	     

	 }

	 private static void fillConverts()
	 {
		   xConvert.put("a", 0);
		   xConvert.put("b", 1);
		   xConvert.put("c", 2);
		   xConvert.put("d", 3);
		   xConvert.put("e", 4);
		   xConvert.put("f", 5);
		   xConvert.put("g", 6);
		   xConvert.put("h", 7);
	
		   int key = 8;
		   for(int i=0; i<8; i++)
		   {
		       yConvert.put(key, i);
		       key--;
		   }
	 }
    
}