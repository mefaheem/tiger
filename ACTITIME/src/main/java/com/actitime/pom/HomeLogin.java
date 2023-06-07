package com.actitime.pom;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.baseclass;


	public class HomeLogin extends baseclass {
		@FindBy(id = "logoutLink")
		private WebElement logbtn;
		
		@FindBy(id = "container_tasks")
		private WebElement taskbtn;
		
		public HomeLogin() {
			PageFactory.initElements(driver, this);
		}
		
		
		public WebElement getLogbtn() {
			return logbtn;
		}

		public WebElement getTaskbtn() {
			return taskbtn;
		}

	}



