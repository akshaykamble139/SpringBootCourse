package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		var str = context.getBean("name");
		var age = context.getBean("age");
		var person = context.getBean("person");
		
		var person2 = context.getBean("person2MethodCall");
		var person3 = context.getBean("person3Parameters");
		var address = context.getBean("address2");
		
		System.out.println(str);
		System.out.println(age);
		System.out.println(person);
		System.out.println(address);
		System.out.println(context.getBean(Address.class));
		System.out.println(person2);
		System.out.println(person3);


	}

}
