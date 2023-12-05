/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy_design_pattern;

/**
 *
 * @author shahr
 */

enum SupportedImage{
   jpg,
   png,
   jpeg,
   webP,
   RAW,
   GIF
}
public class VirtualProxy implements Image{

   private RealImage realImage;
   private String fileName;
   
   

   public VirtualProxy(String fileName){
      this.fileName = fileName;
   }

   @Override
   public void display() {
       
      if(checkImageExtension(fileName)){
          if(realImage == null){
         realImage = new RealImage(fileName);
      }
      realImage.display();
      }
      else{
          System.out.println("Displaying fake image for unsupported type: " + fileName);
      }
   }
   
   
   private boolean checkImageExtension(String fileName){
       
      String[] split = fileName.split("\\.");
if (split.length > 1) {
    String fileExtension = split[split.length - 1];
     for (var string : SupportedImage.values()) {
            if(string.name().toLowerCase().equals(fileExtension)){
                 return true;
      }
       }   
}       
       return false;
   }
}
