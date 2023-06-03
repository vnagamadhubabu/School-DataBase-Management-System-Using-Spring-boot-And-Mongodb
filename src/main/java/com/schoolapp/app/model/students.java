package com.schoolapp.app.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@ToString
@Document(collection= "students")
public class students {
	@Id
	private int id;
	private String name;
	private int englishMarks;
	private int mathsMarks;
	private int socialMarks;
	private int scienceMarks;
	private String Grade;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getEnglishMarks() {
		return englishMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public int getSocialMarks() {
		return socialMarks;
	}
	public int getScienceMarks() {
		return scienceMarks;
	}
	public String getGrade() {
		return Grade;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public void setSocialMarks(int socialMarks) {
		this.socialMarks = socialMarks;
	}
	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	
	
	
	
}
