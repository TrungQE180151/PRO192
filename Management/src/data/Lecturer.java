/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author QUỐC TRUNG
 */
public class Lecturer extends Person {
    
    public ArrayList<String> subject = new ArrayList<>();

    public Lecturer() {
        
    }
    public Lecturer(String name, String email, int yob, String gender, String phone, String address, ArrayList<String> subject) {
        super(name, email, yob, gender, phone, address);
        this.subject = subject;
    }

    public ArrayList<String> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<String> subject) {
        this.subject = subject;
    }
    
    public void addSubject(String otherSubject) {
        subject.add(otherSubject);
    }
       
    public ArrayList<String> displaySubject() {
        System.out.println("Subject: " + subject);
        return subject;
    }
}
