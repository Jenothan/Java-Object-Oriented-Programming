class Student{
	private int id;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	
	Student(int id, String name){
		this.id= id;
		this.name= name;
	}
	
	void setMarks(int m1,int m2,int m3){
		this.m1= m1;
		this.m2= m2;
		this.m3= m3;
	}
	
	private int CalcTotal(){
		int total= 0;
		total= this.m1+ this.m2+this.m3;
		return total;
	}
	
	private double CalcAverage(int total){
		double average= 0.0;
		average= total/ 3.0;
		return  average;
	}
	
	private char getResult(double avg){	
		char result = '\u0000';
		if (avg>=75){
			result='A';
		}else if (avg>=65) {
			result='B';
		}else if (avg>=50) {
			result='C';
		}else if (avg>=35) {
			result='S';
		}else{
			result='F';
		}
		return result;
	}
	
	void display(){
		System.out.println("id: "+this.id);
		System.out.println("name: "+this.name);
		System.out.println("m1: "+this.m1);
		System.out.println("m2: "+this.m2);
		System.out.println("m3: "+this.m3);
		
		int total= this.CalcTotal();
		double average= this.CalcAverage(total);
		char result= this.getResult( average);
		
		System.out.println("Total: "+total);
		System.out.println("Average: "+average);
		System.out.println("Result: "+result);
	}
}