private class A{
	int x;
	
	private A(){
		this.x= 20;
	}
	
	void getX(){
		System.out.println("Ax "+this.x);
	}
}