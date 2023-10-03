
package management;

import data.Person;
import java.util.Scanner;


public class Management {

   
    public static void main(String[] args) {
        inputAPerson();
        
    }
    
    public static void inputAPerson() {
        String name, email, gender, phone, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        System.out.print("Input email: ");
        email = sc.nextLine();
        
        System.out.print("Input gender: ");
        gender = sc.nextLine();
        
        System.out.print("Input phone: ");
        phone = sc.nextLine();
        
        System.out.print("Input address: ");
        address = sc.nextLine();
        
        System.out.print("Input year of birth: ");
        yob = sc.nextInt();
        
        Person Trung = new Person(name, email, yob, gender, phone, address);
        Trung.showProfile();
    }
    
}
