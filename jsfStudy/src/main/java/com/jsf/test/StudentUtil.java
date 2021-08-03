package com.jsf.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class StudentUtil {

	private List<Student> students;

	private StudentDataModel model;

	public StudentDataModel getModel() {
		return model;
	}

	public void setModel(StudentDataModel model) {
		this.model = model;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public StudentUtil() {
		init();
	}

	public void actionButton01() {

		if(model != null) {
			model.getRowData();
		}
	}

	@PostConstruct
	public void init() {
		students = new ArrayList<Student>();

		students.add(new Student("Mary", "Public", "mary@luv2code.com"));
		students.add(new Student("John", "Doe", "john@luv2code.com"));
		students.add(new Student("Ajay", "Rao", "ajya@luv2code.com"));
	}

	public List<Student> getStudents() {
		return students;
	}

}
