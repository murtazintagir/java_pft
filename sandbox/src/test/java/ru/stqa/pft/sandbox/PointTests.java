package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void Point1(){
        Point p1 = new Point(7,4);
        Point p2 = new Point(13, 25);
        Assert.assertEquals(p1.distance(p2), Math.sqrt(477));
    }

    @Test
    public void Point2(){
        Point p1 = new Point(2,2);
        Point p2 = new Point(8, 8);
        Assert.assertEquals(p1.distance(p2), Math.sqrt(72));
    }

    @Test
    public void Point3(){
        Point p1 = new Point(10,10);
        Point p2 = new Point(8, 142);
        Assert.assertEquals(p1.distance(p2), Math.sqrt(17428));
    }
}