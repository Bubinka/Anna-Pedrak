/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author annap
 */
public class Subject {
    
    //initialize variables
    
    private String subjectName;
    private Student[] students = new Student[100];
    private int numberOfStudents;
    
    //constructor 
    public Subject(String subjectName){
        this.subjectName = subjectName;
    }//end constructor
    
    //add method
    
    public void addStudent(String student){
        
        this.students[numberOfStudents] = new Student(0,student);
        numberOfStudents++;
    }//end add method
    
    //returns method
    
    public Student[] getStudents() {
        return students;
    }//end
    
    public int getNumberOfStudents() {
        return numberOfStudents;
    }//end method getNumberOfStudents
    
    public String getSubjectName() {
        return subjectName;
    }//end method getSubjectName
    
    public void dropStudent(String student) {
        
    }//end method dropStudent
    
}//end class Subject
