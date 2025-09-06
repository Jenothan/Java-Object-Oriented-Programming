class Emp {
	int id;
	String name;
	int basicSalary;
	double Bonus;
	double Final_salary;
	
	Emp(int id, String name, int basicSalary){
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	void calcBonus () {
		if(this.basicSalary>=100000) {
			this.Bonus = this.basicSalary*0.1;
		}
		else {
			 this.Bonus = this.basicSalary*0.05;
		}
		this.Final_salary = this.basicSalary+this.Bonus;
	}
	
	void display(){
		if (this.basicSalary<0) {
			System.out.println("Please Enter Valid Salary...!");
		}
		else {
		System.out.println("id : "+this.id);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Basic Salary : "+this.basicSalary +" LKR");
		System.out.println("Final Salary : "+this.Final_salary+" LKR");
		System.out.println("Bonus : "+this.Bonus+" LKR");
		}
	}
}