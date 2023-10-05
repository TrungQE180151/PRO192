
package management;

import data.Student;
import data.Lecturer;
import java.util.ArrayList;




public class Management {

   
    public static void main(String[] args) {
        Student Trung = new Student("Nguyễn Quốc Trung", "trungnqqe180151@gmail.com", 2004, "Male", "0862027542", "Bình Định", "SE");
        Trung.showProfile();
        Trung.changeAddress("TP.HCM");
        Trung.showProfile();
        Trung.displaySubject();
        Lecturer Dung = new Lecturer();
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("PRO192");
        subjects.add("PRF192");
        Dung.setSubject(subjects);
        Dung.displaySubject();
        
        Dung.addSubject("MAE101");
        Dung.displaySubject();
        Dung.addSubject("MAD101");
        Dung.displaySubject();
        Dung.addSubject("IOT102");
        Dung.displaySubject();
        
    }
}

