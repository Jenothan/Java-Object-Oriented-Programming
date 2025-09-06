class B1 extends A1{
	int y;
	
	B1 (int y, int x){
		super(x);		
		this.y=y;
	}
	
	void gety(){
		System.out.println("B1y : "+this.y);
	}
}