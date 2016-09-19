/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author jstra
 */
public class StartUp {
    
    public static void main(String[] args) {
        lab1.ProgrammingCourse course1 = new lab1.IntroToProgrammingCourse("Introduction to Programming","123-456");
        lab1.ProgrammingCourse course2 = new lab1.IntroToProgrammingCourse("Introduction to Java","123-123");
        lab1.ProgrammingCourse course3 = new lab1.AdvancedJavaCourse("Advanced Java","456-456");
        
        System.out.println("Class Name: "+course1.getCourseName()+", Class Number: "+course1.getCourseNumber());
        System.out.println("Class Name: "+course2.getCourseName()+", Class Number: "+course2.getCourseNumber());
        System.out.println("Class Name: "+course3.getCourseName()+", Class Number: "+course3.getCourseNumber());
    }

}   
