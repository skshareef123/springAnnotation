package com.shareef.springAno;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Mediaphone implements Mobileprocessor {

	public void process() {
		System.out.println("i am the best");

	}

}
