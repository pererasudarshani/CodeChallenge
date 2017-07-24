package main.java.com.stdmgt.dao;

import java.util.List;

import main.java.com.stdmgt.model.Student;

public interface StudentDao {
	
	public List<Student> getAllStudents() ;

	public Student getStudent(int id);

	public Student addStudent(Student student);

	public void updateStudent(Student student);

	public void deleteStudent(int id);

}
