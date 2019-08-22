package com.exam;

public class Questions {

	
	int serial;
	String Question,option_1,option_2,option_3,option_4,option_crt;
	
	
	
	public Questions() {
		super();
	}

	public int getSerial() {
		return serial;
	}
	
	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	public String getQuestion() {
		return Question;
	}
	
	public Questions(int serial, String question, String option_1, String option_2, String option_3, String option_4,
			String option_crt) {
		super();
		this.serial = serial;
		Question = question;
		this.option_1 = option_1;
		this.option_2 = option_2;
		this.option_3 = option_3;
		this.option_4 = option_4;
		this.option_crt = option_crt;
	}
	
	public void setQuestion(String question) {
		Question = question;
	}
	
	public String getOption_1() {
		return option_1;
	}
	public void setOption_1(String option_1) {
		this.option_1 = option_1;
	}
	public String getOption_2() {
		return option_2;
	}
	public void setOption_2(String option_2) {
		this.option_2 = option_2;
	}
	public String getOption_3() {
		return option_3;
	}
	public void setOption_3(String option_3) {
		this.option_3 = option_3;
	}
	public String getOption_4() {
		return option_4;
	}
	public void setOption_4(String option_4) {
		this.option_4 = option_4;
	}
	public String getOption_crt() {
		return option_crt;
	}
	public void setOption_crt(String option_crt) {
		this.option_crt = option_crt;
	}
	
	
	
}
