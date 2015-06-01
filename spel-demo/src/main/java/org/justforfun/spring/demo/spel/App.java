package org.justforfun.spring.demo.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		try{
			Robot robot = (Robot) context.getBean("robot");
			robot.speak();
			robot.sayPI();
		}finally{
			context.close();
		}

	}
}
