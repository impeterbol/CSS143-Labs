public class Point{
	public int x;
	private int y;
	//private field y is assigned but never accessed

	public Point(){
		x =0;
		y=0;
	}
	public void publicAdd2(){
		this.x = 2;
		this.y=2;
	}

	private void privateMinus2(){
		this.x = -2;
		this.y=-2;
	}

}