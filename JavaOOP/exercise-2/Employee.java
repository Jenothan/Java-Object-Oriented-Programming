class Employee {
	int id;
	String em_name;
	int basicSalary;
	double Bonus;
	double Final_salary;
	
	void setEmployee(){
		id = 100;
		em_name = "Jenothan";
		basicSalary = (-12);
	}
	void calcBonus () {
		if(basicSalary>=100000) {
			Bonus = basicSalary*0.1;
			Final_salary = basicSalary+Bonus;
		}
		else {
			 Bonus = basicSalary*0.05;
			 Final_salary= basicSalary+Bonus;
		}
	}
	void display(){

		System.out.println("id : "+id);
		System.out.println("Employee Name : "+em_name);
		System.out.println("Basic Salary : "+basicSalary +" LKR");
		System.out.println("Final Salary : "+Final_salary+" LKR");
		System.out.println("Bonus : "+Bonus+" LKR");
	}
}