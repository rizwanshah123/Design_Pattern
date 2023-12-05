/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_exam_example;

import java.util.*;

/**
 *
 * @author shahr
 */
class ExamResults {
    private String studentName;
    private Map<String, String> answers;

    public ExamResults(String studentName) {
        this.studentName = studentName;
        this.answers = new HashMap<>();
    }

    public void addAnswer(String question, String answer) {
        answers.put(question, answer);
    }

    public void display() {
        System.out.println("Student: " + studentName);
        for (Map.Entry<String, String> entry : answers.entrySet()) {
            System.out.println("Question: " + entry.getKey() + ", Answer: " + entry.getValue());
        }
    }
}
