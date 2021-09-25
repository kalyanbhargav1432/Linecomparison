package Linecomparison;

public class Comparison {
		double length(int x1,int y1,int x2,int y2) {
		double distance;
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return distance;
	}
		public static void main(String[] args) {
			Comparison line = new 	Comparison();
			Double result1 = line.length(3, 6, 8, 9);
			Double result2 = line.length(4, 6, 8, 9);
			if(Double.compare(result1,result2) == 0) {
				System.out.println("two results are equal");
			}else if(Double.compare(result1, result2) < 0) {
				System.out.println("result1 is lessthan result2");
			}else {
				System.out.println("result1 is greaterthan result2");
		}
			
	}
}
