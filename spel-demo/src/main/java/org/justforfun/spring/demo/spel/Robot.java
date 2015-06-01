package org.justforfun.spring.demo.spel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	private int id;
	private String speech;
	@Autowired 
	@Value("#{T(Math).PI}")
	private double PI;

	public int getId() {
		return id;
	}

	@Autowired
	public void setId(@Value("#{randomText.text.length()}") int id) {
		this.id = id;
	}

	public String getSpeech() {
		return speech;
	}

	@Autowired
	public void setSpeech(@Value("#{randomText.text}") String speech) {
		this.speech = speech;
	}

	public double getPI() {
		return PI;
	}


	public void speak() {
		System.out.println(this.id + ":" + this.speech);
	}
	
	public void sayPI() {
		System.out.println(this.PI);
	}
}
