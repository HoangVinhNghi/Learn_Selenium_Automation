package webdriver_api;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class T01_Check_EVN {
	  
  @BeforeTest
  public void beforeTest() {
	  System.out.print("Chay dau tien");
	  }
  
  @Test
  public void TC_01_Check_URL() {
	  System.out.print("Chay TC 01");
  }

  @Test
  public void TC_02_Check_Title() {
	  System.out.print("Chay TC 02");
  }



  @AfterTest
  public void afterTest() {
	  System.out.print("Chay sau cung");
  }

}
