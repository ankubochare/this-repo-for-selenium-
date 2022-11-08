package taskseleniumfirst;

import org.testng.annotations.Test;

public class retails {



	@Test(groups = ("one"))
	public void box() {
		System.out.println("peparBox");
	}

	@Test
	public void books() {
		System.out.println("coverdBooks");
	}

	@Test
	public void pen() {
		System.out.println("inkPen");
	}


}
