package login;

public class EliteSwimmer extends Member {

    private boolean butterfly;
    private double bestTimeButterfly;
    private boolean breast;
    private double bestTimeBreast;
    private boolean crawl;
    private double bestTimeCrawl;
    private boolean backCrawl;
    private double bestTimeBackCrawl;
    private boolean backStroke;
    private double bestTimeBackStroke;
    private boolean medley200Women;
    private double bestTimeMedley200Women;
    private boolean medley200Men;
    private double bestTimeMedley200Men;
    private boolean marathon10K;
    private double bestTimeMarathon10K;
    private boolean dogPaddle;
    private double bestTimeDogPaddle;
    private int coachChoice1;
    private int coachChoice2;
    private int coachChoice3;

    public EliteSwimmer(String firstName, String surName, String email, String birthDate, int memberID,
                        String password, boolean isFemale, boolean isTrainer, boolean isActive, double fee, boolean hasPaid) {
        super(firstName, surName, email, birthDate, memberID, password, isFemale, isTrainer, isActive, fee, hasPaid);
    }

    public void setIsActive() {
        isActive = true;
    }

    public boolean getButterfly() {
        return butterfly;
    }

    public boolean setButterfly(boolean newButterfly) {
        butterfly = newButterfly;
        return newButterfly;
    }

    public double getBestTimeButterfly() {
        return bestTimeButterfly;
    }

    public double setBestTimeButterfly(double newBestTimeButterfly) {
        bestTimeButterfly = newBestTimeButterfly;
        return newBestTimeButterfly;
    }

    public boolean getBreast() {
        return breast;
    }

    public boolean setBreast(boolean newBreast) {
        breast = newBreast;
        return newBreast;
    }

    public double getBestTimeBreast() {
        return bestTimeBreast;
    }

    public double setBestTimeBreast(double newBestTimeBreast) {
        bestTimeBreast = newBestTimeBreast;
        return newBestTimeBreast;
    }

    public boolean getCrawl() {
        return crawl;
    }

    public boolean setCrawl(boolean newCrawl) {
        crawl = newCrawl;
        return newCrawl;
    }

    public double getBestTimeCrawl() {
        return bestTimeCrawl;
    }

    public double setBestTimeCrawl(double newBestTimeCrawl) {
        bestTimeCrawl = newBestTimeCrawl;
        return newBestTimeCrawl;
    }

    public boolean getBackCrawl() {
        return backCrawl;
    }

    public boolean setBackCrawl(boolean newBackCrawl) {
        backCrawl = newBackCrawl;
        return newBackCrawl;
    }

    public double getBestTimeBackCrawl() {
        return bestTimeBackCrawl;
    }

    public double setBestTimeBackCrawl(double newBestTimeBackCrawl) {
        bestTimeBackCrawl = newBestTimeBackCrawl;
        return newBestTimeBackCrawl;
    }

    public boolean getBackStroke() {
        return backStroke;
    }

    public boolean setBackStroke(boolean newBackStroke) {
        backStroke = newBackStroke;
        return newBackStroke;
    }

    public double getBestTimeBackStroke() {
        return bestTimeBackStroke;
    }

    public double setBestTimeBackStroke(double newBestTimeBackStroke) {
        bestTimeBackStroke = newBestTimeBackStroke;
        return newBestTimeBackStroke;
    }

    public boolean getMedley200Women() {
        return medley200Women;
    }

    public boolean setMedley200Women(boolean newMedley200Women) {
        medley200Women = newMedley200Women;
        return newMedley200Women;
    }

    public double getBestTimeMedley200Women() {
        return bestTimeMedley200Women;
    }

    public double setBestTimeMedley200Women(double newBestTimeMedley200Women) {
        bestTimeMedley200Women = newBestTimeMedley200Women;
        return newBestTimeMedley200Women;
    }

    public boolean getMedley200Men() {
        return medley200Men;
    }

    public boolean setMedley200Men(boolean newMedley200Men) {
        medley200Men = newMedley200Men;
        return newMedley200Men;
    }

    public double getBestTimeMedley200Men() {
        return bestTimeMedley200Men;
    }

    public double setBestTimeMedley200Men(double newBestTimeMedley200Men) {
        bestTimeMedley200Men = newBestTimeMedley200Men;
        return newBestTimeMedley200Men;
    }

    public boolean getMarathon10K() {
        return marathon10K;
    }

    public boolean setMarathon10K(boolean newMarathon10K) {
        marathon10K = newMarathon10K;
        return newMarathon10K;
    }

    public double getBestTimeMarathon10K() {
        return bestTimeMarathon10K;
    }

    public double setBestTimeMarathon10K(double newBestTimeMarathon10K) {
        bestTimeMarathon10K = newBestTimeMarathon10K;
        return newBestTimeMarathon10K;
    }

    public boolean getDogPaddle() {
        return dogPaddle;
    }

    public boolean setDogPaddle(boolean newDogPaddle) {
        dogPaddle = newDogPaddle;
        return newDogPaddle;
    }

    public double getBestTimeDogPaddle() {
        return bestTimeDogPaddle;
    }

    public double setBestTimeDogPaddle(double newBestTimeDogPaddle) {
        bestTimeDogPaddle = newBestTimeDogPaddle;
        return newBestTimeDogPaddle;
    }
        public int getCoachChoice1() {
        return coachChoice1;
    }

    public int setCoachChoice1(int newCoachChoice1) {
        coachChoice1 = newCoachChoice1;
        return newCoachChoice1;
    }

    public int getCoachChoice2() {
        return coachChoice2;
    }

    public int setCoachChoice2(int newCoachChoice2) {
        coachChoice2 = newCoachChoice2;
        return newCoachChoice2;
    }

    public int getCoachChoice3() {
        return coachChoice3;
    }

    public int setCoachChoice3(int newCoachChoice3) {
        coachChoice3 = newCoachChoice3;
        return newCoachChoice3;
    }

}