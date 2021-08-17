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
        click(By.linkText(contact));
    }
}
