/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newproject;

/**
 *
 * @author PC PARK nazirhat
 */
class newclass{
    
    String name="sakib";
    void add(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
      
    }

}


public class NewProject {

    public static void main(String[] args) {
       newclass obj=new newclass();
       obj.add();
       methodoverloading obj1=new methodoverloading();
       obj1.sum();
       obj1.sum("tamim");
    }
}
