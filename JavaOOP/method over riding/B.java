class B extends A{
	int y;
	
	B(){
		this.y=70;
	}
	
	void getY(){
		super.getX();
		System.out.println("By "+this.y);
	}
	
	void getX(){
		System.out.println("By "+this.y);
		System.out.println("Bx "+this.x);
		super.getX();
	}
}