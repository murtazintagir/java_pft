package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void returnToGroupPage(String s) {
        wd.findElement(By.linkText(s)).click();
    }

    public void returnToHomePage(String h) {
        wd.findElement(By.linkText(h)).click();
    }

    public void openContactPage(String contact) {
        wd.findElement(By.linkText(contact)).click();
    }
}
