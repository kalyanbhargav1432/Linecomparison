package Linecomparison;

public class Comparison {
		double length(int x1,int y1,int x2,int y2) {
		double distance;
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return distance;
	}
		public static void main(String[] args) {
			Comparison line = new 	Comparison();
			Double length1 = line.length(3, 6, 8, 9);
			Double length2 = line.length(4, 6, 8, 9);
			if(Double.compare(length1,length2 ) == 0) {
				System.out.println("two results are equal");
			}
			else if(Double.compare(length1, length2 ) < 0) {
				System.out.println("length1 is lessthan length2 ");
			}
			else {
				System.out.println("length1 is greaterthan length2 ");
		}
			
	}
}
