package com.jsf.test;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TagBean implements Serializable {

	private int count = 1;

	public TagBean() {

	}

	public String next() {
		return "index";
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}