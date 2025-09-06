class Student1 {
	int id;
	String name;
	int M1;
	int M2;
	int M3;
	
	Student1(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	void setMarks(int M1, int M2, int M3) {
		this.M1=M1;
		this.M2=M2;
		this.M3=M3;
	}
	
	int calcTotal () {
		int total = 0;
		total = this.M1+this.M2+this.M3;
		return total;
	}
	
	double calcAverage(int total) {
		double average = 0.0;
		average = total/3.0;
		return average;
	}
	
	char getResults(double average){
		char results ='\u0000';
		if(average>75){
			results='A';
		}
		else if(average>65){
			results='B';
		}
		else if(average>50){
			results='C';
		}
		else if(average>35){
			results='S';
		}
		else{
			results='F';
		}
		return results;
	}
	
	void display() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.M1);
		System.out.println(this.M2);
		System.out.println(this.M3);
		int Total = this.calcTotal();
		double Ave = this.calcAverage(Total);
		char Results = this.getResults(Ave);
		System.out.println("Total : "+Total);
		System.out.println("Average : "+Ave);
		System.out.println("Results : "+Results);
	}
}