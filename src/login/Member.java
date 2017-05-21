
package login;
import java.io.Serializable;

public class Member implements Serializable {

    private String firstName;
    private String surName;
    private String email;
    private String birthDate;
    private int memberID;
    private String password;
    private boolean isFemale;
    private boolean isTrainer;
    private boolean isActive;
    private double fee;
    private boolean hasPaid;

    public Member(String firstName, String surName, String email, String birthDate, int memberID,
                  String password, boolean isFemale, boolean isTrainer, boolean isActive, double fee, boolean hasPaid) {   
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.birthDate = birthDate;
        this.memberID = memberID;
        this.password = password;
        this.isFemale = isFemale;
        this.isTrainer = isTrainer;
        this.isActive = isActive;
        this.fee = fee;
        this.hasPaid = hasPaid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getSurName() {
        return surName;
    }

    public String setSurName(String newSurName) {
        surName = newSurName;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String newEmail) {
        email = newEmail;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String setBirthDate(String newBirthDate) {
        birthDate = newBirthDate;
    }

    public int getMemberID() {
        return memberID;
    }

    public int setMemberID(int newMemberID) {
        memberID = newMemberID;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String newPassword) {
        password = newPassword;
    }

    public boolean getIsFemale() {
        return isFemale;
    }

    public boolean setIsFemale(boolean newIsFemale) {
        isFemale = newIsFemale;
    }

    public boolean getIsTrainer() {
        return isTrainer;
    }

    public boolean setIsTrainer(boolean newIsTrainer) {
        isTrainer = newIsTrainer;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public boolean setIsActive(boolean newIsActive) {
        isActive = newIsActive;
    }

    public double getFee() {
        return 1600;
    }

    public double setFee(double newFee) {
        fee = newFee;
    }

    public boolean getHasPaid() {
        return hasPaid;
    }

    public boolean setHasPaid(boolean newHasPaid) {
        hasPaid = newHasPaid;
    }

}