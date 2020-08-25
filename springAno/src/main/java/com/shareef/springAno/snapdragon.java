package com.shareef.springAno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class snapdragon implements Mobileprocessor {

	public void process() {
		System.out.println("worlds best cpu");

	}

}
 