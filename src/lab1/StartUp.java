/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author jstra
 */
public class StartUp {
    public static void main(String[] args) {
        ProgrammingCourse course1 = new IntroToProgrammingCourse("Introduction to Programming","123-456");
        ProgrammingCourse course2 = new IntroToProgrammingCourse("Introduction to Java","123-123");
        ProgrammingCourse course3 = new AdvancedJavaCourse("Advanced Java","456-456");
        
        System.out.println("Class Name: "+course1.getCourseName()+", Class Number: "+course1.getCourseNumber());
        System.out.println("Class Name: "+course2.getCourseName()+", Class Number: "+course2.getCourseNumber());
        System.out.println("Class Name: "+course3.getCourseName()+", Class Number: "+course3.getCourseNumber());
    }
}
