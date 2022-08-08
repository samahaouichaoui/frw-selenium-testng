package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.test.todos.pages.ToDoPage;
import com.test.todos.utils.Setup;

public class RemoveToDoTest  extends Setup{

	public RemoveToDoTest() throws IOException {
		super();
	}
ToDoPage toDoPage;
@Test
public void iRemoveToDoTest() throws IOException {

	toDoPage = new ToDoPage();
	String text_SourcePage = toDoPage.verifyTextOnPageSource();
	Assert.assertFalse(text_SourcePage.contains(prop.getProperty("todo1")));
}
	
}
