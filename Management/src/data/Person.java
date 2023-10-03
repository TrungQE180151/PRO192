
package data;


public class Person {
    private String name;
    private String email;
    private int yob;
    private String gender;
    private String phone;
    private String address;

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

    public void setPhone(String newphone) {
        this.phone = newphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newaddress) {
        this.address = newaddress;
    }

    @Override
    public String toString() {
        return String.format("|%-20s|%-25s|%4d|%6s|%10s|%-25s|",
                name, email, yob, gender, phone, address);                                          
    }
    
    public void showProfile() {
        System.out.printf("Profile: |%-20s|%-25s|%4d|%6s|%10s|%-25s|\n",
                name, email, yob, gender, phone, address);
    }

}
