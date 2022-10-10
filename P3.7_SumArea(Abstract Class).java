import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int r1=sc.nextInt();
    int r2=sc.nextInt();
    int l1=sc.nextInt();
    int w1=sc.nextInt();
    int l2=sc.nextInt();
    int w2=sc.nextInt();
    GeometricObject[] array = {new Circle(r1), new Circle(r2), new Rectangle(l1, w1), new Rectangle(l2, w2)};
	System.out.println(sumArea(array));
  }
  public static double sumArea(GeometricObject[] a) 
  {
		double sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			sum += a[i].getArea();
		}
        sum= Math.round(sum * Math.pow(10, 5))/ Math.pow(10, 5);
		return sum;
	}
}
class Circle extends GeometricObject  
{
    private double radius;
    public Circle(double radius) 
    {
		this.radius = radius;
	}
    public double getArea() 
    {
		return radius * radius * Math.PI;
	}
}
abstract class GeometricObject 
{
  public abstract double getArea();
}
class Rectangle extends GeometricObject 
{
	private double width;
	private double height;
    public Rectangle(double width, double height) 
    {
		this.width = width;
		this.height = height;
	}
  @Override
	public double getArea() 
	{
		return width * height;
	}
}
