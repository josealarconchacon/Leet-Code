public class BallGame {
    private String FirstTeam, SecondTeam;
    private int NumOfPlayerInEachTeam, NumOfSubstitutes;
    private int FirstTeamScore, SecondTeamScore;

    // Provide a default constructor
    public BallGame() throws Exception {
        this("Unknown","Unknown",0,0,0,0);
    }

    // Provide a constructor that accepts specific values for each of the private members.
    // Throw an exception (of your design) if the numbers are negative.
    public BallGame(String firstTeam, String secondTeam, int numOfPlayerInEachTeam, int numOfSubstitutes, int firstTeamScore, int secondTeamScore) throws Exception {
        this.FirstTeam = firstTeam;
        this.SecondTeam = secondTeam;
        if(numOfPlayerInEachTeam < 0) {
            throw new Exception("Number of Player can't be zero or negative number");
        }
        if(numOfSubstitutes < 0) {
            throw new Exception("Max Substitutes can't be negative");
        }
        if(firstTeamScore < 0 || secondTeamScore < 0) {
            throw new Exception("Score for both teams can't be negative");
        }
        this.NumOfPlayerInEachTeam = numOfPlayerInEachTeam;
        this.NumOfSubstitutes = numOfSubstitutes;
        this.FirstTeamScore = firstTeamScore;
        this.SecondTeamScore = secondTeamScore;
    }

    // Provide a method TheFirstTeamScore and TheSecondTeamScore that increases the score of the appropriate team by a specified value
    // (i.e TheFirstTeamScore and TheSecondTeamScore accepts an integer). Throw an exception if the values are negative.
    public void TheFirstTeamScore(int n) throws Exception {
        if(n < 0) {
            throw new Exception("Score can't be negative");
        }
        this.FirstTeamScore += n;
    }
    public void TheSecondTeamScore(int n) throws Exception {
        if(n < 0) {
            throw new Exception("Score can't be negative");
        }
        this.SecondTeamScore += n;
    }

    // A method display that displays all attributes of an object
    public void Display() {
        System.out.println("First Team = " + this.FirstTeam + "\n" +
                            "Second Team = " + this.SecondTeam + "\n" +
                            "Num of Player = " + this.NumOfPlayerInEachTeam + "\n" +
                           " Num of Substitutes = " + this.NumOfSubstitutes + "\n" +
                           " First Team Score = " + this.FirstTeamScore + "\n" +
                           " Second Team Score = " + this.SecondTeamScore);
    }


    //Provide a method Equal that accepts an object BallGame and returns true if the object is equal to current object and false otherwise.
    public boolean equals(BallGame ballGame) {
        if(this.FirstTeam.equals(ballGame.FirstTeam) && this.SecondTeam.equals(ballGame.SecondTeam) &&
            this.NumOfPlayerInEachTeam == ballGame.NumOfPlayerInEachTeam && this.NumOfSubstitutes == ballGame.NumOfSubstitutes &&
            this.FirstTeamScore == ballGame.FirstTeamScore && this.SecondTeamScore == ballGame.SecondTeamScore) {
            return true;
        }
        return false;
    }

    // Provide a method WhoIsWinning that returns the name of the winning team or “Draw” if both have same score.
    public String WhoIsWinning() {
        if(this.FirstTeamScore > this.SecondTeamScore) {
            return FirstTeam;
        } else if(this.SecondTeamScore > this.FirstTeamScore) {
            return SecondTeam;
        } else {
            return "Draw";
        }
    }

    // Provide accessors for each of the members
    public String getFirstTeam() {
        return FirstTeam;
    }
    public void setFirstTeam(String firstTeam) {
        FirstTeam = firstTeam;
    }
    public String getSecondTeam() {
        return SecondTeam;
    }
    public void setSecondTeam(String secondTeam) {
        SecondTeam = secondTeam;
    }
    public int getNumOfPlayerInEachTeam() {
        return NumOfPlayerInEachTeam;
    }
    public void setNumOfPlayerInEachTeam(int numOfPlayerInEachTeam) throws Exception{
        if(numOfPlayerInEachTeam <= 0) {
            throw new Exception("Number of players can't be zero of negative");
        }
        NumOfPlayerInEachTeam = numOfPlayerInEachTeam;
    }
    public int getNumOfSubstitutes() {
        return NumOfSubstitutes;
    }
    public void setNumOfSubstitutes(int numOfSubstitutes) throws Exception{
        if(numOfSubstitutes <= 0) {
            throw new Exception("Max Substitutes can't be negative");
        }
        NumOfSubstitutes = numOfSubstitutes;
    }
    public int getFirstTeamScore() {
        return FirstTeamScore;
    }
    public void setFirstTeamScore(int firstTeamScore) throws Exception{
        if(firstTeamScore <= 0) {
            throw new Exception("Score for firstTeamScore can't be negative");
        }
        FirstTeamScore = firstTeamScore;
    }
    public int getSecondTeamScore() {
        return SecondTeamScore;
    }
    public void setSecondTeamScore(int secondTeamScore) throws Exception{
        if(secondTeamScore <= 0) {
            throw new Exception("Score for secondTeamScore can't be negative");
        }
        SecondTeamScore = secondTeamScore;
    }
}
