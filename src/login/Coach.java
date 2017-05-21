package login;

public class Coach extends Member {

    public Coach(String firstName, String surName, String email, String birthDate, int memberID,
                 String password, boolean isFemale, boolean isTrainer, boolean isActive, double fee, boolean hasPaid) {
        super(firstName, surName, email, birthDate, memberID, password, isFemale, isTrainer, isActive, fee, hasPaid);
    }

    public double getFee() {
        return super.getFee() * -1;
    }

}