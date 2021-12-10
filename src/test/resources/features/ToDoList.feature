@Test1
Feature: To test the management of the to do list using the ToDoMVC tool

  Scenario Outline: To add an item to the to do list
    Given I open the page <URL>
    And I enter <task> I want to add to my Todo list and press enter

    Examples:
    | URL                                | task                            |
    | http://todomvc.com/examples/vue/   | Adding a task to the task list  |


  Scenario Outline:  To mark a task on the list as complete
     Given I open the page <URL>
     And I enter <task> I want to add to my Todo list and press enter
     And I search and mark <task> completed on the Todo list

    Examples:
      | URL                                | task                            |
      | http://todomvc.com/examples/vue/   | Adding a task to the task list  |

#  Commenting steps as state information is not saved in the application.
#  Scenario Outline: To view all pending tasks in the Todo list
#      Given I open the page <URL>
#      And I enter <task> I want to add to my Todo list and press enter
#      And I select <option> to view all the pending tasks
#
#  Scenario Outline: To view all the completed tasks in the Todo list
#    Given I open the page <URL>
#   # And I select <option> to view all the completed tasks
#
#  Scenario Outline: To remove all completed tasks in the Todo list
#    Given I open the page <URL>
#   # And I click on the clear completed option to remove completed tasks
#
#  Scenario Outline: To remove undo a task that has been marked complete
#    Given I open the page <URL>
#   # And I select <option> to view all the completed tasks
#   # And I uncheck the task that has been marked completed