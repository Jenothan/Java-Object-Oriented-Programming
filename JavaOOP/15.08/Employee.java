class Employee {
	int id;
	String name;
	int basicSalary;
	double Bonus;
	double Final_salary;
	
	void setEmployee(int id, String name, int basicSalary){
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	void calcBonus () {
		if(basicSalary>=100000) {
			Bonus = basicSalary*0.1;
		}
		else {
			 Bonus = basicSalary*0.05;
		}
		Final_salary = basicSalary+Bonus;
	}
	
	void display(){

		System.out.println("id : "+this.id);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Basic Salary : "+this.basicSalary +" LKR");
		System.out.println("Final Salary : "+this.Final_salary+" LKR");
		System.out.println("Bonus : "+this.Bonus+" LKR");
	}
}