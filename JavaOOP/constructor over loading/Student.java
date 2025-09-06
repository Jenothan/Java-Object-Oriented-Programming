class Student{
	int id;
	String name;
	
	Student(){
		this.id= 1000;
		this.name= "Seelan";
	}
	
	Student(int id){
		this.id= id;
		this.name= "Seelan";
	}
	
	Student(String name){
		this.id= 1000;
		this.name= name;
	}
	
	Student(int id, String name){
		this.id= id;
		this.name= name;
	}
	
	Student(String name, int id){
		this.id= id;
		this.name= name;
	}
	
	void getStudent(){
		System.out.println("id "+this.id);
		System.out.println("name "+this.name);
	}
}