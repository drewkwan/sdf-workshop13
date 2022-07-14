package vttp2022b2.workshop13.workshop13.model;

import java.io.Serializable;
import java.util.Random;

import org.springframework.boot.ApplicationArguments;
import org.springframework.ui.Model;

public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String email;
    private int phoneNumber;
    private String id;

    public Contact() {
        this.id = generateID(0);
    }

    public Contact(String name, String email, int phoneNumber) {
        this.id = generateID(0);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String id, String name, String email, int phoneNumber) {
        this.id = generateID(0);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    } //Overloading, this is for "future use" and isn't relevant to this workshop necessarily

    private synchronized String generateID(int numChars) {    //what is synchronized keyword in java?  //what is a race condition? 
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < numChars) {
            sb.append(Integer.toHexString(r.nextInt()));
        }

        return sb.toString().substring(0,numChars);

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
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void saveContact(Contact contact, Model model, ApplicationArguments appArgs) {
    }

}
