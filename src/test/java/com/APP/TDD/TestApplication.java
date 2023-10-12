package com.APP.TDD;

import org.testng.Assert;
import org.testng.annotations.Test;
public class TestApplication {
@Test
public void findapplication()
{
 String courses = "Selenium";
int Expectedvideos = 10;
ApplicationSearch as = new ApplicationSearch();
int count = as.getapplication(courses);
 System.out.println(count);
Assert.assertEquals(count, Expectedvideos);
}
@Test
public void findapplicationEmptyInput()
{
 try {
String courses = "";
int Expectedvideos = 0;
ApplicationSearch as = new ApplicationSearch();
int count = as.getapplication(courses);
}
catch(NullPointerException e)
{
System.out.println("Course name cannot be empty");
}
}
@Test
public void findapplicationInvalidInput()
{
 try {
String courses = "Cucumber";
int Expectedvideos = 25;
ApplicationSearch as = new ApplicationSearch();
int count = as.getapplication(courses);
}
catch(NullPointerException e1)
{
System.out.println("Courses name doesn't exisit in the list");
}
}
}
