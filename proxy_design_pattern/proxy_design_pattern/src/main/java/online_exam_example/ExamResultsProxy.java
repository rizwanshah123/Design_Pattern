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
class ExamResultsProxy {
    private Map<String, ExamResults> studentResults;

    public ExamResultsProxy() {
        this.studentResults = new HashMap<>();
    }

    public ExamResults getResults(String studentName) {
        // Simplified logic for protected proxy
        return studentResults.computeIfAbsent(studentName, ExamResults::new);
    }

    public void addResults(String studentName, ExamResults results) {
        studentResults.put(studentName, results);
    }
}
