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
    private double bestTimedDogPaddle;

    public EliteSwimmer(String firstName, String surName, String email, String birthDate, String memberID,
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
        isActive = true;
    }

    public boolean getButterfly() {
        return butterfly;
    }

    public boolean setButterfly(boolean newButterfly) {
        butterfly = newButterfly;
    }

    public double getBestTimeButterfly() {
        return bestTimeButterfly;
    }

    public double setBestTimeButterfly(double newBestTimeButterfly) {
        bestTimeButterfly = newBestTimeButterfly;
    }

    public boolean getBreast() {
        return breast;
    }

    public boolean setBreast(boolean newBreast) {
        breast = newBreast;
    }

    public double getBestTimeBreast() {
        return bestTimeBreast;
    }

    public double setBestTimeBreast(double newBestTimeBreast) {
        bestTimeBreast = newBestTimeBreast;
    }

    public boolean getCrawl() {
        return crawl;
    }

    public boolean setCrawl(boolean newCrawl) {
        crawl = newCrawl;
    }

    public double getBestTimeCrawl() {
        return bestTimeCrawl;
    }

    public double setBestTimeCrawl(newBestTimeCrawl) {
        bestTimeCrawl = newBestTimeCrawl;
    }

    public boolean getBackCrawl() {
        return backCrawl;
    }

    public boolean setBackCrawl(boolean newBackCrawl) {
        backCrawl = newBackCrawl;
    }

    public double getBestTimeBackCrawl() {
        return bestTimeBackCrawl;
    }

    public double setBestTimeBackCrawl(double newBestTimeBackCrawl) {
        bestTimeBackCrawl = newBestTimeBackCrawl;
    }

    public boolean getBackStroke() {
        return backStroke;
    }

    public boolean setBackStroke(boolean newBackStroke) {
        backStroke = newBackStroke;
    }

    public double getBestTimeBackStroke() {
        return bestTimeBackStroke;
    }

    public double setBestTimeBackStroke(double newBestTimeBackStroke) {
        bestTimeBackStroke = newBestTimeBackStroke;
    }

    public boolean getMedley200Women() {
        return medley200Women;
    }

    public boolean setMedley200Women(boolean newMedley200Women) {
        medley200Women = newMedley200Women;
    }

    public double getBestTimeMedley200Women() {
        return bestTimeMedley200Women;
    }

    public double setBestTimeMedley200Women(double newBestTimeMedley200Women) {
        bestTimeMedley200Women = newBestTimeMedley200Women;
    }

    public boolean getMedley200Men() {
        return medley200Men;
    }

    public boolean setMedley200Men(boolean newMedley200Men) {
        medley200Men = newMedley200Men;
    }

    public double getBestTimeMedley200Men() {
        return bestTimeMedley200Men;
    }

    public double setBestTimeMedley200Men(double newBestTimeMedley200Men) {
        bestTimeMedley200Men = newBestTimeMedley200Men;
    }

    public boolean getMarathon10K() {
        return marathon10K;
    }

    public boolean setMarathon10K(boolean newMarathon10K) {
        marathon10K = newMarathon10K;
    }

    public double getBestTimeMarathon10K() {
        return bestTimeMarathon10K;
    }

    public double setBestTimeMarathon10K(double newBestTimeMarathon10K) {
        bestTimeMarathon10K = newBestTimeMarathon10K;
    }

    public boolean getDogPaddle() {
        return dogPaddle;
    }

    public boolean setDogPaddle(boolean newDogPaddle) {
        dogPaddle = newDogPaddle;
    }

    public double getBestTimeDogPaddle() {
        return bestTimeDogPaddle;
    }

    public double setBestTimeDogPaddle(double newBestTimeDogPaddle) {
        bestTimeDogPaddle = newBestTimeDogPaddle;
    }

}