package main.java.com.stdmgt.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.com.stdmgt.model.Student;
import main.java.com.stdmgt.service.StudentService;

@Controller
@RequestMapping(value="student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/getAllStudents", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getCountries(Model model) {
		
		List<Student> listOfStudents = studentService.getAllStudents();
		model.addAttribute("student", new Student());
		model.addAttribute("listOfStudents", listOfStudents);
		return "studentDisplay";
	}

	@RequestMapping(value = "/getStudent/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Student getStudentById(@PathVariable int id) {
		return studentService.getStudent(id);
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCountry(@ModelAttribute("student") Student student) {	
		if(student.getStdId()==0)
		{
			studentService.addStudent(student);
		}
		else
		{	
			studentService.updateStudent(student);
		}
		
		return "redirect:/student/getAllStudents";
	}

	@RequestMapping(value = "/updateStudent/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateCountry(@PathVariable("id") int id,Model model) {
		 model.addAttribute("student", this.studentService.getStudent(id));
	        model.addAttribute("listOfStudents", this.studentService.getAllStudents());
	        return "studentDisplay";
	}

	@RequestMapping(value = "/deleteStudent/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
		 return "redirect:/student/getAllStudents";

	}	

}
