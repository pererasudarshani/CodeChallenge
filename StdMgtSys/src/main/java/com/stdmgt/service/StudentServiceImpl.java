package main.java.com.stdmgt.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.stdmgt.dao.StudentDao;
import main.java.com.stdmgt.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	@Transactional
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Transactional
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}

	@Transactional
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Transactional
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);

	}

	@Transactional
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}

}
