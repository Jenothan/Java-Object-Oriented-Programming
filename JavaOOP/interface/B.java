class B implements A {
	int y;
	B() {
		this.y=15;
	}
	public void getX() {
		System.out.println(x);
	}
	
	void getY() {
		System.out.println(this.y);
	}
}