 class B extends A {
	int y;
	
	B(){
		this.y=10;
	}
	
	void getY() {
		System.out.println("By : "+this.y);
	}
	
	void getX() {
		System.out.println("Ax : "+super.x);
	}
}