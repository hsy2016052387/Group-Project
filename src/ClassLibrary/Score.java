package ClassLibrary;

import java.io.Serializable;

public class Score implements Serializable{
	String academic_year;//
	String term;//
	String course;//
	String credit;//
	String grades;//
	String GPA;//
	String exam_date;//
	String exam_properties;//
	String course_type;//
	String study_type;//
	String status;//
	public String getStudy_type() {
		return study_type;
	}
	public void setStudy_type(String study_type) {
		this.study_type = study_type;
	}
	public String getAcademic_year() {
		return academic_year;
	}
	public void setAcademic_year(String academic_year) {
		this.academic_year = academic_year;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	public String getGPA() {
		return GPA;
	}
	public void setGPA(String gPA) {
		GPA = gPA;
	}
	public String getExam_date() {
		return exam_date;
	}
	public void setExam_date(String exam_date) {
		this.exam_date = exam_date;
	}
	public String getExam_properties() {
		return exam_properties;
	}
	public void setExam_properties(String exam_properties) {
		this.exam_properties = exam_properties;
	}
	public String getCourse_type() {
		return course_type;
	}
	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}