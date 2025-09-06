class B extends A{
	int y;
	int x=100;
	
	B(){
		this.y=70;
	}
	
	void getY(){
		System.out.println("By "+this.y);
	}
	
	void getX(int x){
		System.out.println("Bx "+x);
		System.out.println("Ax "+this.x);   // firstly check x in  child class and then go to parent class 
		System.out.println("Ax "+super.x);
	}
}