package taskseleniumfirst;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class demopera {

	@Test

	@Parameters({ "val1", "val2" })
	public void sum(int v1, int v2) {
		int finalsum = v1 + v2;
		System.out.println("the final sum of the given value is :" + finalsum);
	}

	@Test
	@Parameters({ "val1", "val2" })
	public void sub(int v1, int v2) {
		int finalsum = v1 - v2;
		System.out.println("the final sub of the given value is :" + finalsum);
	}

}
