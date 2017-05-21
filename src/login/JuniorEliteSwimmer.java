package login;

public class JuniorEliteSwimmer extends EliteSwimmer {

    public JuniorEliteSwimmer(String firstName, String surName, String email, String birthDate, String memberID,
                        String password, boolean isFemale, boolean isTrainer, boolean isActive, double fee, boolean hasPaid) {
        super(firstName);
        super(surName);
        super(email);
        super(birthDate);
        super(memberID);
        super(password);
        super(isFemale);
        super(isTrainer);
        super(isActive);
        super(fee);
        super(hasPaid);
    }

    public double getFee() {
        return super.getFee() * 0.625;
    }

}