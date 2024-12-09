public class abc{
	public static void main(String[]args){
		Point fp = new Point();
		Point sp = new Point();
		add(fp, sp);
	}
	void add(Point a, Point b)
	{
	 	Point c = new Point();
		c.xloc = a.xloc + b.xloc;
		c.yloc = a.yloc + b.yloc;
		c.display();
	}
}
