/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.io.Serializable;

/**
 *
 * @author Nikolaj Reichardt
 */
public class UserOld implements Serializable {
    private int memberID;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String gender;
    private boolean payStatus;
    
    public UserOld(int memberID, String password, String firstName, String lastName, int age, String email, String gender, boolean payStatus)
    {
        this.memberID = memberID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.payStatus = payStatus;
    }
    public String toString()
    {
        return "\n\nMedlems ID: " + memberID +
        "\nFornavn: " + firstName + 
        "\nEfternavn: " + lastName + 
        "\nAlder: " + age + 
        "\nE-mail: " + email + 
        "\nKøn: "+gender +
        "\nBetalt? " + payStatus;
    
    }
    
    public void setMemberID(int memberID)
    {
        this.memberID = memberID;
    }
    public int getMemberID()
    {
        return this.memberID;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return this.password;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public void setAge (int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public String getGender()
    {
        return this.gender;
    }
    public void setPayStatus(boolean payStatus)
    {
        this.payStatus = payStatus;
    }
    public boolean getPayStatus()
    {
        return this.payStatus;
    }
}
