/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculation;

/**
 *
 * @author QUỐC TRUNG
 */
import java.util.Scanner;
public class Caculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    //Khai bao bien
    double a, b;
    double Tong, Hieu, Tich, Thuong;   
    
    //Nhap du lieu
    System.out.print("Nhap a: ");
    a=sc.nextDouble();
    System.out.print("Nhap b: ");
    b=sc.nextDouble();
    
    //Tinh
    Tong = a+b;
    Hieu = a-b;
    Tich = a*b;
    Thuong = a/b;
    
    //Hien thi ket qua
    System.out.println("Tong 2 so la: "+Tong);
    System.out.println("Hieu 2 so la: "+Hieu);
    System.out.println("Tich 2 so la: "+Tich);
    System.out.println("Thuong 2 so la: "+Thuong);
    sc.close();
    }
}
