/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.facadedesignpattern;

import java.util.Scanner;

/**
 *
 * @author shahr
 */
public class FacadeDesignPattern {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names of shapes to draw using Comma Seperated \n\n Example (circle,triangle): ");
        String input = scanner.nextLine();

        ShapeMaker shapeMaker = new ShapeMaker(input);
       shapeMaker.drawShapes();

        scanner.close();
      
   
     
      
      
      
      
    }
}

