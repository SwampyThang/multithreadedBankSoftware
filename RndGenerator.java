import java.util.Random;

public class RndGenerator {
	
	public static int num(boolean operator) {
	  
		int rndNum = 0;
	
		if(operator == true) {
			
			rndNum = minMax(1, 200);
			return rndNum;
		} 
		
		else {
			
			rndNum = minMax(1, 50);
			return rndNum;
		}
	}
	  
	private static int minMax(int min, int max) {
	  
		Random rndGenerator = new Random();
		int x = 0;
	
		while(max <= x || min >= x) {
			
			x = rndGenerator.nextInt();
		}
	
		return x;
	}
	
}
