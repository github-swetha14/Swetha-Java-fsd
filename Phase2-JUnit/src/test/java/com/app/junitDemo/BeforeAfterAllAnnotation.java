package com.app.junitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllAnnotation {

        @BeforeAll
		public void init() {   // It will be executed before all test methods
			
			System.out.println("Start the DB");
			System.out.println("Initalization Done..");

		}
		
        @AfterAll
	    public void tearDown() {   // It will be executed after all test methods execution completed
	    	
	    	System.out.println("Stop the DB");
	    	
	    }
	    
        @Test
	    public void method1() {

			System.out.println("Executing method 1 of code class");
		}
	    
        @Test
	    public void method2() {

			System.out.println("Executing method 2 of code class");
		}
}
