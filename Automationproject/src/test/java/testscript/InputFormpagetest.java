package testscript;

import java.sql.Driver;

import org.testng.annotations.Test;

import Pages.InputForm;

public class InputFormpagetest extends Base {
  @Test
  public void sumOfTwoValues() {
	  
	  String valuea1="10";
	  String valueb1="20";
	  
	  InputForm input=new InputForm(driver);
	  input.enterValueforA(valuea1);
	  input.enterValueforB(valueb1);
	  input.clickOnGettotal();
	  
  }
}
