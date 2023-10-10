/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.Scanner;


public class Stacks {
public static int size = 5;
public int[] data = new int [size];
private int top;

public void push(int element)throws Exception {
    if (top==size) {
        throw new Exception("Stack is full");
    }
    top++;
    data[top] = element;
}
   public int pop ()throws Exception {
       if (top==0) {
           throw new Exception("stack is empty");
       }
       int temp = peek();
       data[top]=0;
       top--;
       return temp;
   }
   
   public void display()throws Exception {
       if (top==0) {
           throw new Exception("Stack is empty");
           
       }
       for (int i = top; i < 10; i--) {
           System.out.println(data[i]+ "->");
       }
       System.out.println("NULL");
   
   }
   public int peek()throws Exception {
       if (top==0) {
           throw new Exception("Stack is empty");
       }
       return data[top];
   }
   
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        Stacks list = new Stacks();
        
        while (true) {            
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display");
            System.out.println("Enter your choice");
            
            int element;
            int choice = scn.nextInt();
        try {    
         switch (choice) {
             case 1:
                 System.out.println("Enter value of node ");
                element = scn.nextInt();
                list.push(element);
                 System.out.println("\n");
              break;
             case 2:
                 System.out.println(list.pop() +"deleted");
                 System.out.println("\n");
             break;
             case 3:
                 list.display();
                 System.out.println("\n");
                 break;
             case 4:
                 scn.close();
                 System.exit(0);
             default :
                 System.out.println("invalid");
         } 
        } catch (Exception e) {
            System.out.println("Exception"+ e.getMessage());
        }
           
        }
    }
    
}
