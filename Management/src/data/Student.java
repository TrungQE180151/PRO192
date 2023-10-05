/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author QUỐC TRUNG
 */
public class Student extends Person {

    private String major;
    
    public Student(String name, String email, int yob, String gender, String phone, String address, String major) {
        super(name, email, yob, gender, phone, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public void displaySubject() {
        switch(major) {
            case "SE":
                System.out.println("Subject: PRF192");
                System.out.println("Subject: PRO192");
                break;
                
            case "AI":
                System.out.println("Subject: PFP191");
                System.out.println("Subject: CSI105");
                break;
                
            case "GD":
                System.out.println("Subject: AFA201");
                System.out.println("Subject: ANC301");
                break;
                
            default:
                System.out.println("Invalid major");
      
        }

   }

}