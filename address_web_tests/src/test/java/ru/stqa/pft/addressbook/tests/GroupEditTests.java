package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Set;

public class GroupEditTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().groupPage();
        if (app.group().all().size() == 0){
            app.group().create(new GroupData().withName("name").withHeader("header").withFooter("footer"));
        }
    }

    @Test
    public void testGroupEdit(){
        Set<GroupData> before = app.group().all();
        GroupData editGroup = before.iterator().next();
        GroupData group = new GroupData().
                withId(editGroup.getId()).withName("name").withHeader("header").withFooter("footer");
        app.group().edit(group);
        Set<GroupData> after = app.group().all();
        Assert.assertEquals(after.size(), before.size());

        before.remove(editGroup);
        before.add(group);
        Assert.assertEquals(before, after);
    }
}
