package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>();



    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName=firstName;
        this.lastName=lastName;
        this.examScores = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken () {

        return this.examScores.size(); // change
    }

    public String getExamScores() {
        int count = 1;
        String getExamScore = "";
        for (int x=0; x<examScores.size();x++ ){
            getExamScore +="Exam " +count + "  ->" + examScores.get(x);
            count++;
        }
        return getExamScores();
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);

    }

    public void setExamScores(int examNumber, Double newScore){
        examScores.set(examNumber-1,newScore);

    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        for(int x=0;x<examScores.size();x++){
            sum+=examScores.get(x);
        }
        Double average = sum/examScores.size();
        return average;

    }

    @Override
    public String toString (){
        String str = "Student Name :  "+ firstName +" "+lastName + "\n" + "> Average Score:  "+ getAverageExamScore()+
                "\n" + "> Exam Score:  "+ "\n" + getExamScores();
        return str;
    }}












