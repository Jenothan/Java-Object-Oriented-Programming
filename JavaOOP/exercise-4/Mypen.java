class Mypen  {
	public static void main (String arg[]) {
		Pen p;
		p=new Pen();
		p.color="red";
		p.height=70.5;
		p.brand="Atlas";
		p.weight=40.5;
		p.madeIn="Japan";
		
		System.out.println(p.color);
		System.out.println(p.height);
		System.out.println(p.brand);
		System.out.println(p.weight);
		System.out.println(p.madeIn);
		
		p.write();
	}
}