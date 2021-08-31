package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;
import ru.stqa.pft.addressbook.appmanager.NavigationHelper;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupHelper extends NavigationHelper {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void del() {
        click(By.name("delete"));
    }

    public void selectById(int id) {
        wd.findElement(By.cssSelector("input[value='" + id  + "']")).click();
    }

    public void initGroupEdit() {
        click(By.name("edit"));
    }

    public void submitGroupEdit() {
        click(By.name("update"));
    }

    public void create(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        groupCashe = null;
        returnToGroupPage();
    }

    public void createBad(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        groupCashe = null;
        if (isElementPresent(By.linkText("group page"))){
            returnToGroupPage();
        }
    }

    public void edit(GroupData group) {
        selectById(group.getId());
        initGroupEdit();
        fillGroupForm(group);
        submitGroupEdit();
        groupCashe = null;
        returnToGroupPage();
    }

    public void delete(GroupData group) {
        selectById(group.getId());
        del();
        groupCashe = null;
        returnToGroupPage();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public int count() {
        return wd.findElements(By.name("selected[]")).size();
    }

    private Groups groupCashe = null;

    public Groups all() {
        if (groupCashe != null){
            return new Groups(groupCashe);
        }
        groupCashe = new Groups();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for (WebElement element: elements){
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            groupCashe.add(new GroupData().withId(id).withName(name));
        }
        return new Groups(groupCashe);
    }
}
