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
                  Image fake = new VirtualProxy("test_10mb.jphh");


      //image will be loaded from disk
      image.display(); 
      System.out.println("");
      image.display(); 
            System.out.println("");
      System.out.println("");
      System.out.println("");

      
      
        fake.display(); 
      System.out.println("");
      
      fake.display(); 
    }
}
