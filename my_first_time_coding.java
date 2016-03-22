/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirst1;

/**
 *
 * @author Любомир
 */


import javax.swing.*;

import java.awt.event.*;


public class MyFirst1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*        
        System.out.println("Hello, XXI Century World!"); 
        JOptionPane.showMessageDialog(null,"Hello, world!");
        int degree; String ToDo;
       // name = JOptionPane.showInputDialog("Скільки градусів на стовпчику термометра сьогодні?");
        ToDo = JOptionPane.showInputDialog("Шо будем робити?");
        JOptionPane.showMessageDialog(null,"\'"+ToDo+"\'"+"---OK");
        int number=456;
        String not_number = "456";
        int StrToInt = Integer.parseInt(not_number);
        String title1 = "number+not_number";
        String title2 = "number+StrToInt";
        int type1 = JOptionPane.ERROR_MESSAGE;
        int type2 = JOptionPane.WARNING_MESSAGE;
        JOptionPane.showMessageDialog(null, number+not_number,title1,type1);
        JOptionPane.showMessageDialog(null, number+StrToInt,title2,type2);
        int Parity_check = Integer.parseInt(JOptionPane.showInputDialog("Введіть ціле число:"));
        String CheckResult = Parity_check%2==0?"парне число":"непарне число";
        JOptionPane.showMessageDialog(null, "Ви ввели число: "+Parity_check+"\n Це "+CheckResult);
        */
        
//        
//        double x,y;
//        String title = "Ділення чисел";
//        String text = "Результат ділення ";
//        int type;
//        x = Double.parseDouble(JOptionPane.showInputDialog("Чисельник:"));
//        y = Double.parseDouble(JOptionPane.showInputDialog("Знаменник:"));
//        if(y!=0)
//        {
//            type=JOptionPane.ERROR_MESSAGE;
//            text = text + x + "/" + y + "=" + x/y;
//        }
//        else
//        {
//            type=JOptionPane.ERROR_MESSAGE;
//            text = text + "ділення на нуль!";
//        }
//        JOptionPane.showMessageDialog(null, text, title, type);
        
      
        GUI_test gui = new GUI_test();
        //herznasho yu = new herznasho();
    }
    
}
