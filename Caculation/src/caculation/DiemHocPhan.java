/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculation;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author QUỐC TRUNG
 */
public class DiemHocPhan {
    public static void main(String[] args) {
    double ChuyenCan, GiuaKy, CuoiKy, DiemHocPhan;  
    Scanner sc=new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.#");
    
        System.out.printf("Nhap diem chuyen can: ");
        ChuyenCan = sc.nextDouble();
        System.out.printf("Nhap diem giua ky: ");
        GiuaKy = sc.nextDouble();
        System.out.printf("Nhap diem cuoi ky: ");
        CuoiKy = sc.nextDouble();
        
        DiemHocPhan = (ChuyenCan * 10 + GiuaKy * 20 + CuoiKy * 70)/100;
        decimalFormat.format(DiemHocPhan);
        System.out.printf("Diem hoc phan cua ban la: "+DiemHocPhan);
    }
}