package Linecomparison;

public class Comparison {
	double length(int x1,int y1,int x2,int y2) {
		double distance;
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return distance;
	}
		public static void main(String[] args) {
			Comparison line = new 	Comparison();
			double length = line.length(2, 5, 6, 7);
			System.out.println("the length:"+ length);
	}
}
