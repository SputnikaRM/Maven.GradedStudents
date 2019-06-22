package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Classroom {
    public Student [] students;

    public Student[] getStudents() {
        return students;
    }

    public Classroom(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student [] students){
        this.students=students;
    }

    public Classroom(){
        students=new Student[30];
    }

    public Double getAverageExamScore () {
        Double sum = 0.0;
        for (int x=0;x<students.length;x++){
            for(int y=0;y<students[x].getNumberOfExamsTaken();y++){
                sum+= students[x].examScores.get(y);
            }
        }
            Double average = sum / students.length;
        return average;
    }

    public void addStudent(Student student){
        ArrayList<Student> arr = new ArrayList<Student>();
            for(int x=0;x<students.length;x++){
                arr.add(students[x]);
            }
            arr.add(student);
           arr.toArray();
            }
    public void removeStudents(String firstName, String lastName){
        ArrayList<Student> arr = new ArrayList<>();
        for(int x=0; x<students.length;x++){
            arr.add(students[x]);
        }
        for (int x=0; x<students.length;x++){
            if((students[x].firstName == firstName) && (students[x].lastName== lastName)
                arr.remove(students[x]);

        }
        arr.toArray();
    }
    public void getStudentsByScore(){
        ArrayList<Student> arr =new ArrayList<>();
        for(int x=0;x<students.length;x++)
            arr.add(students[x]);
        Collections.sort(arr,Collections.reverseOrder());
        arr.toArray();

    }

    public void getGradeBook(){

        HashMap<Student,String> gradeBook = new HashMap<>();


            }

        // gotta make a hashmap with student, string gradebook


    }








}
