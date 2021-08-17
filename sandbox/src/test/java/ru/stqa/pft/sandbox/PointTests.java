package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.MyFirstProgramm;


public class PointTests {

    @Test
    public void Point1(){
        Point p1 = new Point(7,4);
        Point p2 = new Point(13, 25);
        Assert.assertEquals(p1.distance(p2), 21.840329667841555);
    }

    @Test
    public void Point2(){
        Point p1 = new Point(2,2);
        Point p2 = new Point(8, 8);
        Assert.assertEquals(p1.distance(p2), 8.48528137423857);
    }

    @Test
    public void Point3(){
        Point p1 = new Point(10,10);
        Point p2 = new Point(8, 142);
        Assert.assertEquals(p1.distance(p2), 132.015150645674);
    }
}
