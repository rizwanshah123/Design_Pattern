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
public class RealExam implements Exam{

     private List<String> questions;

    public RealExam() {
        System.out.println("Loading Exam Questions...");
        questions = Arrays.asList("Q1", "Q2", "Q3");
    }

    @Override
    public void display() {
        System.out.println("Displaying Exam Questions...");
        for (String question : questions) {
            System.out.println(question);
        }
    }
}
