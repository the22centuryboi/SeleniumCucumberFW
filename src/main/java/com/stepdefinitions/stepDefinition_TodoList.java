package com.stepdefinitions;

import com.codeBehind.baseClass;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class stepDefinition_TodoList {
    com.codeBehind.baseClass baseClass= new baseClass();
    @Before
    public void beforeScenario(Scenario scenario) {
    }
    @Given("^I open the page (.+)$")
    public void I_open_the_page(String URL) throws Exception {
        Reporter.addStepLog("Open the TodoList homepage");
        baseClass.goTo(URL);
        Thread.sleep(1000);
        Reporter.addScenarioLog("The ToDoList homepage is opened");
    }

    @And("^I enter (.+) I want to add to my Todo list and press enter$")
    public void I_enter_task_I_want_to_add_to_my_Todo_list_and_press_enter(String task) throws Exception {
        Reporter.addStepLog("Enter the task and save it to the list");
        baseClass.enterTask(task);
        Thread.sleep(1000);
        Reporter.addScenarioLog("The task has been entered to the list");
    }

    @And("^I search and mark (.+) completed on the Todo list$")
    public void I_search_for_task_completed_on_the_Todo_list(String task) throws Exception{
        Reporter.addStepLog("Search for the task on the list");
        baseClass.searchAndMarkTaskComplete(task);
        Thread.sleep(1000);
        Reporter.addScenarioLog("The task has been found in the list");
    }
    @After
    public void afterScenario(Scenario scenario) throws Exception{
        baseClass.closeDriver();
    }
}
