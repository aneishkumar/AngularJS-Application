package com.project2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table(name="job")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
private String jobtitle;
private String jobdescription;
private String position;

private String skillsRequired;

private String location;

private String companyname;

private String salary;

private String exp;

private Date postedon;

private String imagename;
private String interviewdate;
	
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getJobtitle() {
	return jobtitle;
}
public void setJobtitle(String jobtitle) {
	this.jobtitle = jobtitle;
}
public String getJobdescription() {
	return jobdescription;
}
public void setJobdescription(String jobdescription) {
	this.jobdescription = jobdescription;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public String getSkillsRequired() {
	return skillsRequired;
}
public void setSkillsRequired(String skillsRequired) {
	this.skillsRequired = skillsRequired;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getExp() {
	return exp;
}
public void setExp(String exp) {
	this.exp = exp;
}
public Date getPostedon() {
	return postedon;
}
public void setPostedon(Date postedon) {
	this.postedon = postedon;
}
public String getImagename() {
	return imagename;
}
public void setImagename(String imagename) {
	this.imagename = imagename;
}
public String getInterviewdate() {
	return interviewdate;
}
public void setInterviewdate(String interviewdate) {
	this.interviewdate = interviewdate;
}
	
    

	

}
