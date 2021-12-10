package com.codeBehind;

import Selenium.DriverFactory;
import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import com.pages.basePage;

public class baseClass {
    public boolean taskFound;
    final static Logger LOGGER = LoggerFactory.getLogger(baseClass.class);
    public WebDriver driver= DriverFactory.getDriver();

    public baseClass goTo(String URL) throws Exception{
        try{
            LOGGER.info("Opening the link :"+URL);
            driver.get(URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public baseClass enterTask(String task) throws Exception{
        try{
            LOGGER.info("Entering the task  :"+task);
            driver.findElement(basePage.enterTaskTxt).sendKeys(task);
            driver.findElement(basePage.enterTaskTxt).sendKeys(Keys.ENTER);
            LOGGER.info("Task entered to the Todo list :"+task);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public baseClass searchAndMarkTaskComplete(String task) throws Exception{
        try{
            LOGGER.info("Searching for the task : "+task);
            if (driver.findElement(By.xpath(basePage.searchTaskLbl+task+"')]")).isDisplayed()){
                driver.findElement(By.xpath(basePage.searchTaskLbl+task+"')]/../input")).click();
                LOGGER.info("Task searched and marked complete in the Todo list :"+task);
            }
            else{
                LOGGER.info("Task searched not in the Todo list :"+task);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }

    public baseClass closeDriver() throws Exception{
        driver.close();
        return this;
    }
}
