package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class GroupDelTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().groupPage();
        if (app.group().all().size() == 0){
            app.group().create(new GroupData().withName("name").withHeader("header").withFooter("footer"));
        }
    }

    @Test
    public void testGroupDel(){
        Groups before = app.group().all();
        GroupData deleteGroup = before.iterator().next();
        app.group().delete(deleteGroup);
        assertEquals(app.group().count(), before.size() - 1);
        Groups after = app.group().all();
        assertThat(after, equalTo(before.without(deleteGroup)));
    }
}
