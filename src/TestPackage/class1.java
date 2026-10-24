package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class class1 {

	@Test
	public static void Demo() {
		
		
		System.out.println("Hello");
	}
	
	@Test
	public static void Demo2() {
		
		
		System.out.println("smokefrom1");
	}
	
	
	@AfterSuite
	public static void Suiteafter() {
	System.out.println("AfterSuite from class1");	
	}
	
	
	
	
@AfterTest
	public static void Demo1() {
	System.out.println("Demo1");	
	}
	
	

}
