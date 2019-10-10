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
public class Student {
    
    private int id;
    private String name;
    private java.util.Date dateCreated;
    
    public Student(int ssn,String newName){
        
        id = ssn;
        name = newName;
    }//end two args constructors
    
    //returns method
    
    public int getID() {
        return id;
    }//end
    
    public String getName(){
        return name;
    }//end
    
    //return DateCreated method
    
    public java.util.Date getDateCreated() {
        return dateCreated;
    }//end method return
    
    @Override
    
    public String toString() {
        
        return name;
    }//end method toString
    
}//end class Student
