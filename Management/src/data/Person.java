
package data;


public class Person {
    private String name;
    private String email;
    private int yob;
    private String gender;
    private String phone;
    private String address;
    
    public Person() {
        
    }
    
    public Person(String name, String email, int yob, String gender, String phone, String address) {
        this.name = name;
        this.email = email;
        this.yob = yob;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showProfile() {
        System.out.println("The profile is: ");
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Year of birth: " + this.yob);
        System.out.println("Gender: " + this.gender);
        System.out.println("Phone: " + this.phone);
        System.out.println("Address: " + this.address);
        
    } 
    
    public void changePhone(String newPhone) {
        this.phone = newPhone;
        
        
    }
    
    public void changeAddress(String newAddress) {
        this.address = newAddress;
        
        
    }

}

