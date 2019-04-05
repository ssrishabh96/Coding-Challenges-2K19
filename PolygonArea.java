// 7.Program to compute the area of the polygon where each vertex is a Point with an x and a y coordinate 

public class PolygonArea{
	
	public static class Point{

		public Point(double x, double y){
			this.x=x;
			this.y=y;
		}

		public double x;
		public double y;
	}

	static double cross_Product(Point a, Point b){
		return Math.abs((a.x*b.y)-(a.y*b.x));
	}

	static double calculateArea(Point[] vertices, int size){
		double sum=0;

		for(int i=0; i<size;i++){
			sum+=cross_Product(vertices[i], vertices[(i+1)%size]);

		}

		return sum/2;
	}

	public static void main(String args[]){

		Point point[]=new Point[5];

		for(int i=0; i<5;i++){
			point[i]=new Point(i+1, i+2);
		}
		System.out.println("Area for the polygon is: "+calculateArea(point, 5));


	}
}