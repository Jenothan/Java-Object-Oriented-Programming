class MainStudent{
	public static void main(String args[]){
		Student stu= new Student();
		stu.getStudent();
		
		Student stu1= new Student(1000);
		stu1.getStudent();
		
		Student stu2= new Student("Jana");
		stu2.getStudent();
		
		Student stu3= new Student(2000,"Jana");
		stu3.getStudent();   
		
		Student stu4= new Student("Jeni",3000);
		stu4.getStudent();
	}
}