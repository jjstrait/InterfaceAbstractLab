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
        ProgrammingCourse couse1 = new IntroToProgrammingCourse("Introduction to Programming","123-456");
        ProgrammingCourse couse2 = new IntroToProgrammingCourse("Introduction to Java","123-123");
        ProgrammingCourse couse3 = new AdvancedJavaCourse("Advanced Java","456-456");
    }
}
