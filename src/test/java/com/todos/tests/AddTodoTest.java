package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.test.todos.pages.ToDoPage;
import com.test.todos.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
	}

	ToDoPage toDoPage;

	@Test
	public void iCanAddTodo() throws IOException {

		toDoPage = new ToDoPage();
		boolean result = toDoPage.isElementDisplayed(ToDoPage.inputText);
		Assert.assertTrue(result);
		toDoPage.fillToDo(prop.getProperty("todo1"));
		String txtTodo = toDoPage.checkFieldContains(ToDoPage.textToDo);
		Assert.assertTrue(txtTodo.contains(prop.getProperty("todo1")));
		boolean result1 = toDoPage.isCheckBoxSelected(ToDoPage.checkBox);
		Assert.assertFalse(result1);
	}

}
