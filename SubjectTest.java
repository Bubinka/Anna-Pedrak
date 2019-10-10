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
public class SubjectTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Subject subject1 = new Subject("Data Structures");
        Subject subject2 = new Subject("MySQL database");
        
        subject1.addStudent("Peter Jones");
        subject1.addStudent("Brian Adams");
        subject1.addStudent("Marie O'connor");
        
        subject2.addStudent("Peter Jones");
        subject2.addStudent("Steve Brown");
        
        System.out.println(" Number of students in " + subject1.getSubjectName()+
                ":" + subject1.getNumberOfStudents());
        
        Student[] students = subject1.getStudents();
        for(int i = 0;i <subject1.getNumberOfStudents();i++) {
            System.out.println(students[i] + ",");
            System.out.println();
            System.out.print(" Number of students in " + subject2.getSubjectName()+
                     ":" + subject2.getNumberOfStudents());
            
            System.out.println();
            
        }//
            
            Student[] students1 = subject2.getStudents();
            
            for(int i = 0;i < subject2.getNumberOfStudents();i++) {
                System.out.println(students1[i]+ ",");
                
            }//end
           
        }//end
    }//end class Subject|Test
    

