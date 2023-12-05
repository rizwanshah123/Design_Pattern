/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proxy_design_pattern;

/**
 *
 * @author shahr
 */
public class Proxy_design_pattern {

    public static void main(String[] args) {
         Image image = new VirtualProxy("test_10mb.jpg");

      //image will be loaded from disk
      image.display(); 
      System.out.println("");
      
      //image will not be loaded from disk
      image.display(); 	
    }
}
