class C extends B {
	int z;
	
	C() {
		this.z=70;
	}
	
	void getZ() {
		final int w=20;
		System.out.println("Cz : "+this.z+", w:"+w);
	}
}