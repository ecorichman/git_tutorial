package com.jsf.test;
import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

public class StudentDataModel extends ListDataModel<Student> implements SelectableDataModel<Student> {

	@Override
	public Object getRowKey(Student object) {
		// TODO 自動生成されたメソッド・スタブ
		return object.getFirstName();
	}

	@Override
	public Student getRowData(String rowKey) {
		// TODO 自動生成されたメソッド・スタブ
		Student student = (Student) getWrappedData();
		if(student.getFirstName().equals(rowKey)) {
			return student;
		}

		return null;
	}

}