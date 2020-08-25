package com.shareef.springAno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class samsung {
	@Autowired 
	@Qualifier("snapdragon")
	Mobileprocessor cpu;
	
	public Mobileprocessor getCpu() {
		return cpu;
	}


	public void setCpu(Mobileprocessor cpu) {
		this.cpu = cpu;
	}


	public void config()
	{
		System.out.println("cor octa, 4 gb, 12MP camera" );
		cpu.process();
	}

}
