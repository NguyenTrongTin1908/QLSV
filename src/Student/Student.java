/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Keyer
 */
public class Student {
    
    
    
     
    private int id ;
    private String fullname;
    private String gender;
    private int age;
    private String email;
    private String phone;

    
    public Student() {
    }

    public Student(int id, String fullname, String gender, int age, String email, String phone) {
        this.id = id;
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }
    public Student(String fullname, String gender, int age, String email, String phone) {
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}


