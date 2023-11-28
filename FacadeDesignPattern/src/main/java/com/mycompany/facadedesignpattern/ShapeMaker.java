/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facadedesignpattern;

/**
 *
 * @author shahr
 */
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
   private Shape cylinder;
   private Shape oval;
   private Shape triangle;
   
   private String input;

   public ShapeMaker(String input ) {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
      cylinder=new Cylinder();
      oval =new Oval();
      triangle=new Trianlge();
      this.input=input;
      
   }
    
        public void drawShapes(){   
             String[] shapeNames = input.split(",");
            for (String shapeName : shapeNames){
            switch (shapeName.trim().toLowerCase()) {
                case "circle":
                    circle.draw();
                    break;
                case "rectangle":
                    rectangle.draw();
              
                    break;
                case "square":
                    square.draw();
                    break;
                case "triangle":
                    triangle.draw();
                    break;
                case "oval":
                    oval.draw();
                    break;
                case "cylinder":
                    cylinder.draw();
                    break;
                default:
                    System.out.println("Unknown shape: " + shapeName);
            }
        }
        }
}
