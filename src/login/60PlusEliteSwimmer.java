package login;

public class 60PlusEliteSwimmer extends SeniorEliteSwimmer {

    public 60PlusEliteSwimmer(String firstName, String surName, String email, String birthDate, int memberID,
                        String password, boolean isFemale, boolean isTrainer, boolean isActive, double fee, boolean hasPaid) {
        super(firstName, surName, email, birthDate, memberID, password, isFemale, isTrainer, isActive, fee, hasPaid);
    }

    public double getFee() {
        return super.getFee() * 0.75;
    }

}