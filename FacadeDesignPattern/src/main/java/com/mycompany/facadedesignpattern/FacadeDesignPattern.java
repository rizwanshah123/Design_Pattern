/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.facadedesignpattern;

/**
 *
 * @author shahr
 */
public class FacadeDesignPattern {

    public static void main(String[] args) {
       ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();	
    }
}
