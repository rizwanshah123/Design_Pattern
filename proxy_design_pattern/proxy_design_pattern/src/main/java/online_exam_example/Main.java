/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_exam_example;

/**
 *
 * @author shahr
 */
public class Main {
    public static void main(String[] args) {
         Exam virtualProxyExam = new VirtualProxyExam();
        virtualProxyExam.display(); // On-demand loading and displaying

        // Smart Proxy
        ExamResults student1Results = new ExamResults("Student1");
        student1Results.addAnswer("Q1", "A1");
        student1Results.addAnswer("Q2", "A2");

        // Protected Proxy
        ExamResultsProxy resultsProxy = new ExamResultsProxy(); // No role distinction in this simplified version
        resultsProxy.addResults("Student1", student1Results);

        ExamResults student1View = resultsProxy.getResults("Student1");
        student1View.display(); // Student viewing their results
    }
}
