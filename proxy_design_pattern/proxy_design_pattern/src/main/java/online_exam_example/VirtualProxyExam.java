/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_exam_example;

/**
 *
 * @author shahr
 */
class VirtualProxyExam implements Exam {
    private Exam realExam;

    @Override
    public void display() {
        if (realExam == null) {
            realExam = new RealExam();
        }
        realExam.display();
    }
}
