package Linecomparison;

public class Comparison {
	double length(int x1,int y1,int x2,int y2) {
		double distance;
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return distance;
	}
		public static void main(String[] args) {
			Comparison line = new 	Comparison();
			Double length1 = line.length(2, 5, 6, 7);
			Double length2 = line.length(3, 6, 8, 9);
			Double length3 = line.length(3, 6, 8, 9);
			System.out.println("to check the equality of lengths are true or false:" + length1.equals(length2));
			System.out.println("to check the equality of lengths are true or false:" + length2.equals(length3));
		
	}
}
