package com.springcore.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class student {
			@Value("deep")
			private String studentName;
			@Value("nagpur")
			private String city;
			public String getStudentName() {
				return studentName;
			}
			public void setStudentName(String studentName) {
				this.studentName = studentName;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			@Override
			public String toString() {
				return "student [studentName=" + studentName + ", city=" + city + "]";
			}
	
}
