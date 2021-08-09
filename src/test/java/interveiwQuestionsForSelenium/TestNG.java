package interveiwQuestionsForSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test(dataProvider = "dp")

	public void testMethod(int number)
	{
	    System.out.println("The Thread ID for "+ number + " Is :  " + Thread.currentThread().getId());
	}


	@DataProvider(name = "dp",parallel=true)
	public Object[][] dp1() {
	  return new Object[][] {
	      new Object[] { 1 },
	      new Object[] { 2 },
	      new Object[] { 3 },
	      new Object[] { 4 },
	      new Object[] { 5 },
	      new Object[] { 6 },
	      new Object[] { 7 },
	      new Object[] { 8 }

	  };
	}
	}


