/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author annap
 */
public class GradeExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int marks[] = new int[6];
        float total = 0,average;
        
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < 6;i++){
            System.out.println("Enter marks of subject:" + (i + 1)+ ":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
            
        }//end
        scanner.close();
        
        //Calculating the average
        
        average = total/6;
        System.out.println("The student grade is:");
        if(average >=80){
            System.out.println("A");
        }else if(average >=60 && average <80){
            System.out.println("B");
        }else if(average >= 40 && average <60){
            System.out.println("C");
        }else {
            System.out.println("D");
        }//end else statement
    }//end else if
    
}//end class GradeExams
