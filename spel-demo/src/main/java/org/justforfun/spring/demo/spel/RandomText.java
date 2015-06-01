package org.justforfun.spring.demo.spel;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {

	private static final String[] AVAILABLE_TEXTS = {
		"Got one eihei",
		"This is another text",
		"Fuck that shit"
	};
	private final Random random;

	public RandomText() {
		this.random = new Random();
	}
	
	
	public String getText() {
		int idx = this.random.nextInt(AVAILABLE_TEXTS.length);
		return AVAILABLE_TEXTS[idx];
	}
	
}
