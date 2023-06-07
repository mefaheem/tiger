package com.actitime.pom;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.baseclass;

	public class loginpage extends baseclass {
		@FindBy(id = "username")
		private WebElement untbx;
		
		@FindBy(name = "pwd")
		private WebElement pwtbx;
		
		@FindBy(xpath = "//div[text()='Login ']")
		private WebElement lgbtn;
		
		public loginpage() {
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getUntbx() {
			return untbx;
		}

		public WebElement getPwtbx() {
			return pwtbx;
		}

		public WebElement getLgbtn() {
			return lgbtn;
		}

		

	}



