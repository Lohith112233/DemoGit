package TestPackage;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class classs2 {
	
	
	
	@Test(groups={"Smoke"})
	public static void Loan1() {
	System.out.println("Loan1");	
	}
@Parameters({"URL"})	
@Test
	public static void Loan2(String url) {
	System.out.println("Loan2");	
	System.out.println(url);	
	}


@Test(groups={"Smoke"})
public static void Loan3() {
System.out.println("Loan3");	
}

@BeforeMethod
public static void methodBefore() {
System.out.println("methodBefore is executed from class2 check for each method");	
}


}
