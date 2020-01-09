package EdurekaMain;

import org.testng.Assert;
import org.testng.annotations.*;


public class  Test1 extends Main {
	

	

@Test
public void Test12()
{
	String TITLE= invokeBrowser();
	System.out.println(TITLE);
	Assert.assertEquals(TITLE,"Instructor-Led Online Training with 24X7 Lifetime Support | Edureka");
	System.out.println("Assertion Pass");
}
@Test
public void Test22() throws InterruptedException
{	String Url= login();
	Assert.assertEquals(Url,"https://www.edureka.co/" );
}

}