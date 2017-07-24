package main.java.com.stdmgt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="std_id")
	private int stdId;
	
	
	@Column(name="std_code")
	String stdCode;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="middle_name")
	String middleName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="age")
	int age;
	
	@Column(name="adress")
	String adress;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdCode() {
		return stdCode;
	}

	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stdId, String stdCode, String firstName, String middleName, String lastName, int age,
			String adress) {
		super();
		this.stdId = stdId;
		this.stdCode = stdCode;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.adress = adress;
	}
	
	
	
	
	
}

