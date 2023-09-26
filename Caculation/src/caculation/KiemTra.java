/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculation;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author QUỐC TRUNG
 */
public class KiemTra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> hs = new ArrayList<String>();
        hs.add("Miyako");
        hs.add("Saki");
        hs.add("Miyu");
        hs.add("Moe");
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        
        for(int i=0; i<hs.size(); i++){
            if(hs.contains(name)){
               System.out.println("Yes");
               
            break;
           }
            else
               System.out.println("No");
        
            break;   
        
        }
    }
}
