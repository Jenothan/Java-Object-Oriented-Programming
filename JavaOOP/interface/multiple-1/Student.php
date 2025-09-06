<?php
class Student {
	public $id;
	public $name;
	
	function setStudent($id, $name) {
		$this -> id=id;
		$this -> name=name;
	}
	
	function getStudent() {
		echo $this -> id;
		echo $this -> name;
	}
	
}

$Stu = new Student;
$Stu->setStudent(200, "Jenothan");
$Stu->getStudent();

?>