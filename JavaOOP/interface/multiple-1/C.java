class C extends B implements IA{
	int z;
	
	C() {
		this.z=50;
	}
	
	void getZ(){
		System.out.println("Cz : "+this.z);
	}
	
	public void getX(){
		System.out.println("IA : "+x);
	}
}