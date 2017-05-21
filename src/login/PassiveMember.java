public class PassiveMember extends Member {

    public PassiveMember(String firstName, String surName, String email, String birthDate, String memberID,
                        String password, boolean isFemale, boolean isTrainer, boolean isActive, double fee,) {
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
    }

    public void setIsActive() {
        isActive = false;
    }

    public double getFee() {
        return super.getFee() * 0.3125;
    }

}