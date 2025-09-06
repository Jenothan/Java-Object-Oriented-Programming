class C implements IB {
	int z;
	
	C() {
		this.z=10;
	}
	
	void getZ() {
		System.out.println("Cz : "+this.z);
	}
	
	public void getX(){
		System.out.println("IA : "+x);
	}
	
	public void getY(){
		System.out.println("IB : "+y);
	}
}