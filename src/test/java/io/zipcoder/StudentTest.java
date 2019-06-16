package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void constructorTest(){
        String firstName = "Will";
        String lastName = "Reyes";
        ArrayList <Double> examScores = new ArrayList<>();

        //when
        Student testStudent = new Student (firstName,lastName,examScores);
        String expected = "Will";
        String actual = testStudent.getFirstName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFirstNameTest(){

        Student testStudent = new Student("Will","Reyes",new ArrayList<Double>());

        String expected= "Will";
        String actual = testStudent.getFirstName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setFirstName() {
        Student testStudent = new Student("Will","Reyes",new ArrayList<Double>());

        String expected = "William";
        testStudent.setFirstName("William");

        String actual = testStudent.getFirstName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getLastName () {
        Student testStudent = new Student("Will","Reyes",new ArrayList<Double>());

        String expected= "Reyes";
        String actual = testStudent.getLastName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setLastName() {
        Student testStudent = new Student("Will","Reyes",new ArrayList<Double>());

        String expected = "William;
        testStudent.setLastName("William");

        String actual = testStudent.getLastName();

        Assert.assertEquals(expected,actual);
    }




}