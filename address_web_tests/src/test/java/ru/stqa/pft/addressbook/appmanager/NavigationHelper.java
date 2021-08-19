package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroupPage(String s) {
        click(By.linkText(s));
    }

    public void returnToHomePage(String h) {
        click(By.linkText(h));
    }

    public void openContactPage(String contact) {
        if (isElementPresent(By.id("maintable"))){
            return;
        }
        click(By.linkText(contact));
    }

    public void openGroupPage(String groups) {
        if (isElementPresent(By.tagName("h1")) && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
           return;
        }
        click(By.linkText(groups));
    }
}
