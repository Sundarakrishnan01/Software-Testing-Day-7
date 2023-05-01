package test.Day6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Ex2 {
	
	int a=8,b=2;
	int c;
  @Test
  public void add() {
	  c=a+b;
	  Assert.assertEquals(c, 10);
  }
  @Test(priority=2)
  public void sub() {
	  c=a-b;
	  Assert.assertEquals(c, 6);
  }
  @Test (priority=1)
  public void multi() {
	  c=a*b;
	  Assert.assertEquals(c, 16);
  }
  @Test(priority=3)
  public void div() {
	  c=a/b;
	  Assert.assertEquals(c, 4);
  }
  
  

}
