class MainStudent{
	public static void main(String args[]){
		Student stu= new Student();
		stu.setStudent();
		stu.getStudent();
		
		Student stu1= new Student();
		stu1.setStudent(1000);
		stu1.getStudent();
		
		Student stu2= new Student();
		stu2.setStudent("Jana");
		stu2.getStudent();
		
		Student stu3= new Student();
		stu3.setStudent(2000,"Jana");
		stu3.getStudent();   
		
		Student stu4= new Student();
		stu4.setStudent("Jeni",3000);
		stu4.getStudent();
	}
}