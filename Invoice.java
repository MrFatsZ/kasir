/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invoice;

/**
 *
 * @author Aryo W
 */
import java.util.Scanner;
import java.lang.Math;
public class Invoice {

    public static void main(String[] args) {
        System.out.println("KONOHA Companies Portal");
        System.out.println("=======================");
    Scanner l = new Scanner (System.in);
    System.out.print("PRESS ENTER TO CONTINUE");
    String m = l.nextLine();
    Scanner s = new Scanner(System.in);
    System.out.print("Input Item's Name : ");
    String a = s.nextLine();
    Scanner r = new Scanner(System.in);
    System.out.print("Input Item's Price (USE DECIMAL) : ");
    Double t = r.nextDouble();
    Scanner y = new Scanner (System.in);
    System.out.print("Input Item's quantity : ");
    Integer n = y.nextInt();
    Scanner op = new Scanner(System.in);
    System.out.print("Input Item's Discount : ");
    Integer po = op.nextInt();
    System.out.println("KONOHA Companies Invoice");
    System.out.println("=======================");
    Scanner ad = new Scanner(System.in);
    System.out.println("PRESS ENTER TO CONTINUE");
    String hg = ad.nextLine();
    System.out.println("Item's Name : " + a);
    System.out.println("Item's Price : $" + t);
    System.out.println("Item's Quantity : " + n);
    System.out.println("Item's Discount : "+po+"%");
    System.out.println("Total : $" + (t*n*(100-po)/100) );
    Scanner oj = new Scanner(System.in);
    System.out.print("Input your money (use decimal) : $");
    Double ok = oj.nextDouble();
    System.out.println("Thank you for purchasing !");
    System.out.println("Your change : $" + (ok-(t*n*(100-po)/100)));
    
    
    
    
    }
}
