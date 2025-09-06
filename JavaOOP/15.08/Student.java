class Student {
	int id;
	String name;


	/*void setStudent (int id, String name) {             //parameter method
		this.name = name;
		this.id = id;
	}*/
	
	/*Student () {             								//default constructor method
		this.name = "seelan";
		this.id = 1000;
	}*/
	
	Student (int id, String name) {             								//default constructor method
		this.name = name;
		this.id = id;
	}
	
	
	
	void getStudent () {								//default method
		System.out.println("id : "+this.id);
		System.out.println("name : "+this.name);
		
	}
}