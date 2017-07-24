package main.java.com.stdmgt.service;

import java.util.List;

import main.java.com.stdmgt.model.Student;

public interface StudentService {
	
	
	public List<Student> getAllStudents();

	
	public Student getStudent(int id);

	
	public void addStudent(Student student);

	
	public void updateStudent(Student student) ;

	
	public void deleteStudent(int id);


}
