package login;

public class JuniorExerciseSwimmer extends ExerciseSwimmer {

    public JuniorExerciseSwimmer(String firstName, String surName, String email, String birthDate, int memberID,
                        String password, boolean isFemale, boolean isTrainer, boolean isActive, double fee, boolean hasPaid) {
        super(firstName, surName, email, birthDate, memberID, password, isFemale, isTrainer, isActive, fee, hasPaid);
    }

    public double getFee() {
        return super.getFee() * 0.625;
    }

}