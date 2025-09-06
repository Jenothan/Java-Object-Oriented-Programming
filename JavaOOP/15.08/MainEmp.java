class MainEmp {
	public static void main(String arg[]) {
		Emp Emp1 = new Emp(100, "Jenothan", 120000);
		Emp1.calcBonus();
		Emp1.display();
		System.out.println();
		Emp Emp2 = new Emp(101, "Luxshi", -56555);
		Emp2.calcBonus();
		Emp2.display();
	}
}
