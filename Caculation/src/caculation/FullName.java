/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculation;

import java.util.Scanner;

/**
 *
 * @author QUỐC TRUNG
 */
public class FullName {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.printf("Nhập họ của bạn: ");
    String Ho = sc.nextLine();
    System.out.print("Nhập tên của bạn: ");
    String Ten = sc.nextLine();
    System.out.println("Tên đầy đủ của bạn là: " + Ho + " " + Ten);    
    }
}
