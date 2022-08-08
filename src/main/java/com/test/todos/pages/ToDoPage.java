package com.test.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.todos.utils.BasePage;

public class ToDoPage extends BasePage {

	/* @FindBy WebElement */
	@FindBy(how = How.XPATH, using = "//input[@ng-model='newTodo']")
	public static WebElement inputText;
	
	@FindBy(how = How.XPATH, using = "/html/body/ng-view/section/section/ul/li/div/label")
	public static WebElement textToDo;
	
	@FindBy(how = How.XPATH, using = "//input[@ng-model='todo.completed']")
	public static WebElement checkBox;
	
	public ToDoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	/* Create Methods */
	public void fillToDo(String todo_txt) {
		inputText.sendKeys(todo_txt);
		inputText.sendKeys(Keys.ENTER);
	}

	public Boolean isElementDisplayed(WebElement element) {
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
		
	}
	
	public String checkFieldContains(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public Boolean isCheckBoxSelected(WebElement element) {
		Boolean isCheckBoxSelected = element.isSelected();
		return isCheckBoxSelected;
	}
	
	public String verifyTextOnPageSource() {
		String element = driver.getPageSource();
		return element;
		
	}

}
