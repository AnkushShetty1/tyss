package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter2 {
	@Test
	@Parameters({"Pname"})
	
	public void test(@Optional("ankush") String value) {
		System.out.println("This is"+ value);
		
	}

}
