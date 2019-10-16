/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author CIT
 */
 class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee[] staff = new Employee[3];
        
        staff[0] = new Employee("Carl Aznavure",7500,1987,12,15);
        staff[1] = new Employee("Annette Maher",5000,1989,10,1);
        staff[2] = new Employee("James Fiztpatrick",3500,1990,3,15);
        
        //raise everyone's salary by 5%
        
        for(Employee e: staff) {
            e.raiseSalary(5);
            
        }//
            
            //print
            
            for(Employee e: staff) {
                System.out.println(" name = " + e.getName()+ ", salary = " + e.getSalary()+
                        ", hireDay = "+ e.getHireDay());
            }//
        }//
 }

        public class Employee {
            
            public Employee(String n,double s,int year,int month,int day) {
                
                name = n;
                salary = s;
                
                GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
                hireDay = calendar.getTime();
                
            
        }//end
            
            //getter methods
            
            public String getName() {
                return name;
            }//end
            
            public double getSalary() {
                return salary;
                
            }//end
            
            public Date getHireDay() {
                return hireDay;
            }//end
            
            public void raiseSalary(double byPercent) {
                
                double raise = salary*byPercent/100;
                salary += raise;
            }//
            
            private String name;
            private double salary;
            private Date hireDay;
        
        
    }//
    

