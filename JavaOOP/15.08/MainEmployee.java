class MainEmployee {
	public static void main(String arg[]) {
		Employee Emp1 = new Employee();
		Emp1.setEmployee(100, "Jenothan", 120000);
		Emp1.calcBonus();
		Emp1.display();
		
		Employee Emp2 = new Employee();
		Emp2.setEmployee(101, "Luxshi", 150000);
		Emp2.calcBonus();
		Emp2.display();
	}
}
