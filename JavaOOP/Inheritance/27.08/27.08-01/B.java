package packB;
import packA.A;
public class B extends A{
	public int y;
	
	public B() {
		this.y = 10;
	}
	
	public void getY() {
		System.out.println("By : "+this.y);
	}
}