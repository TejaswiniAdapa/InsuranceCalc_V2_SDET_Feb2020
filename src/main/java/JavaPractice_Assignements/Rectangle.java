package JavaPractice_Assignements;

public class Rectangle 
{

	 int length;
	 int breadth;
	 int Area;
	
	public Rectangle()
	{
		
	}
	public Rectangle(int ln, int br)
	{
		length=ln;
		breadth=br;
		
	}
	
	public Rectangle(int ln){
		length=ln;
		breadth=ln;
	}
	
	public void AreaOfRectangle()
	{
		Area=length*breadth;
		System.out.println("Area of Rectangle is : " + Area);
	}
	public static void main(String[] args) 
	{
		Rectangle c1=new Rectangle();
		c1.AreaOfRectangle();
		
		Rectangle c2=new Rectangle(10);
		c2.AreaOfRectangle();
		
		Rectangle c3=new Rectangle(2,5);
		c3.AreaOfRectangle();
		
		
	}

}
