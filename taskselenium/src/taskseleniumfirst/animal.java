package taskseleniumfirst;

import org.testng.annotations.Test;

public class animal {





	@Test
	public void dogs() {
		System.out.println("pappay");
	}

	@Test(groups = ("one"))
	public void cows() {
		System.out.println("cafs");
	}

	@Test
	public void cat() {
		System.out.println("mini");
	}



}
