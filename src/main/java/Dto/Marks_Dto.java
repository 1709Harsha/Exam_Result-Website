package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marks_Dto {
    
	@Id
	private int UNIVERSITY_SEAT_NUMBER;
	private String Student_name;
	private String gender;
	private String dob;
	private String Father_name;
	private int Kannada;
	private int English;
	private int Hindi;
	private int Mathmatics;
	private int Social_Science;
	private int Science;
	private int Total_marks;
	private int Secured_marks;
	private String Percentage;
	public int getUNIVERSITY_SEAT_NUMBER() {
		return UNIVERSITY_SEAT_NUMBER;
	}
	public void setUNIVERSITY_SEAT_NUMBER(int uNIVERSITY_SEAT_NUMBER) {
		UNIVERSITY_SEAT_NUMBER = uNIVERSITY_SEAT_NUMBER;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public int getKannada() {
		return Kannada;
	}
	public void setKannada(int kannada) {
		Kannada = kannada;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getHindi() {
		return Hindi;
	}
	public void setHindi(int hindi) {
		Hindi = hindi;
	}
	public int getMathmatics() {
		return Mathmatics;
	}
	public void setMathmatics(int mathmatics) {
		Mathmatics = mathmatics;
	}
	public int getSocial_Science() {
		return Social_Science;
	}
	public void setSocial_Science(int social_Science) {
		Social_Science = social_Science;
	}
	public int getScience() {
		return Science;
	}
	public void setScience(int science) {
		Science = science;
	}
	public int getTotal_marks() {
		return Total_marks;
	}
	public void setTotal_marks(int total_marks) {
		Total_marks = total_marks;
	}
	public int getSecured_marks() {
		return Secured_marks;
	}
	public void setSecured_marks(int secured_marks) {
		Secured_marks = secured_marks;
	}
	public String getPercentage() {
		return Percentage;
	}
	public void setPercentage(String percentage) {
		Percentage = percentage;
	}
	
	 
	           
}