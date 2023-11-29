package com.app.junitDemo;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterizedTestMethodSource {

	//argument = each value stored in method or enum or value source
	
	@ParameterizedTest
	@MethodSource("stringParameters")    //this will give the input
	public void getDataFromMethod(String input) {
		
		System.out.println("The value from method is:" +input);
	
	}
	
	//This method will pass a range of values
	
	public static Stream<String> stringParameters(){
		
		return Stream.of("Monday","Tuesday","Wednesday");
		
	}
}
