package com.schoolapp.app.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@ToString
@Document(collection = "teachers")
public class teachers {
	@Id
	private int id;
	private String name;
	private String jobTitle;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
