package TestPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class classs4 {
	
	
	
	
@Test(dependsOnMethods= {"Dtop3"})
	public static void Top1() {
	System.out.println("Top1");	
	}	
	
@Test
public static void Top2() {
System.out.println("Top2");	
}
	

@BeforeSuite
public static void suiteBefore() {
System.out.println("Before suite executed from class4");	
}


@Test
public static void Top3() {
System.out.println("Top3");

}


@BeforeTest
public static void Top4() {
System.out.println("Top4");	
}


@Test
public static void Atop() {
System.out.println("ATop");	
}



@Test(enabled=false)
public static void Btop() {
System.out.println("BTop3");	
}

@Test(dataProvider="getData")
public static void Ctop3(String userr, String pass) {
System.out.println("CTop3");

System.out.println(userr);
System.out.println(pass);


}

@Test
public static void Dtop3() {
System.out.println("DTop3");	
}



@DataProvider
public Object[][] getData() {
	
	//combintion== username and password--good credit
	// no credit
	//fraud credit
	Object[][] data = new Object[3][2];
	
	data[0][0]="FirstUser";
	data[0][1]="Password1";
	
	
	
	data[1][0]="SecodnUser";
	data[1][1]="password2";
	
	
	data[2][0]="ThirdUser";
	data[2][1]="password3";
	return data;
	
	
	
}









}
