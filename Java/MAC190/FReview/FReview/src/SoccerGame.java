//Derive a class SoccerGame that has in addition the following:
public class SoccerGame extends BallGame{
    private String Referee;
    private int SubstitutedA, SubstitutedB;

    // - Provide a default constructor that sets team names and referee’s name to “unknown”,
    // number of payers to 11, number of substitutes to 5 and the score of each team as well as number of players substituted to 0.
    public SoccerGame() throws Exception {
        super("Unknown","Unknown",11,5,0,0);
        this.Referee = "Unknown";
        this.SubstitutedA = this.SubstitutedB = 0;
    }

    // - Provide a constructor that accepts the names of the teams and the referee’s name.
    public SoccerGame(String firstTeam, String secondTeam, int numOfPlayerInEachTeam, int numOfSubstitutes, int firstTeamScore, int secondTeamScore, int substitutedA, int substitutedB, String referee) throws Exception {
        super(firstTeam, secondTeam, numOfPlayerInEachTeam, numOfSubstitutes, firstTeamScore, secondTeamScore);
        this.Referee = referee;
        this.SubstitutedA = substitutedA;
        this.SubstitutedB = substitutedB;
    }

    public SoccerGame(int substitutedA, int substitutedB, String referee) throws Exception {
        super();
        this.SubstitutedB = substitutedB;
        this.SubstitutedA = substitutedA;
        this.Referee = referee;
    }

    // - Override the method display to display all private attributes.
    public void Display() {
        super.Display();
        System.out.println("Referee = " + Referee + " SubstitutedA = " + SubstitutedA + " SubstitutedB = " + SubstitutedB);
    }

    // - Override the method Equal to compare two SoccerGames
    public boolean equals(SoccerGame soccerGame) {
        if(super.equals(soccerGame) && this.Referee.equals(soccerGame.getReferee()) && this.SubstitutedA == soccerGame.SubstitutedA &&this.SubstitutedB == soccerGame.SubstitutedB) {
            return true;
        }
        return false;
    }

    // - Override  TeamAScored and TeamBScored that accepts an integer to increase the score of the appropriate team by 1 even if the number specified is larger than 1.
    public void TeamAScored(int n) throws Exception {
        if(n < 0) {
            throw new Exception("Can't be negative");
        }
        this.setFirstTeamScore(this.getFirstTeamScore() + 1);
    }
    public void TeamBScored(int n) throws Exception {
        if(n < 0) {
            throw new Exception("Can't be negative");
        }
        this.setSecondTeamScore(this.getSecondTeamScore() + 1);
    }

    //- Overload TeamAScored and TeamBScored (no input parameter) to increase the score of the appropriate team by 1.


    // Provide a method SubstitutionA, SubstitutionB that increases the number of players substituted for the appropriate team by 1 if it is less than 3,
    // otherwise it displays “No more substitutions allowed”.
    public void SubstitutionA() {
        if(SubstitutedA < this.getNumOfSubstitutes()) {
            this.SubstitutedA += 1;
        } else {
            System.out.println("No more substitution allowed");
        }
    }
    public void SubstitutionB() {
        if(SubstitutedB < this.getNumOfSubstitutes()) {
            this.SubstitutedB += 1;
        } else {
            System.out.println("No more substitution allowed");
        }
    }



    public String getReferee() {
        return Referee;
    }
    public void setReferee(String referee) {
        Referee = referee;
    }
    public int getSubstitutedA() {
        return SubstitutedA;
    }

    public void setSubstitutedA(int substitutedA) throws Exception{
        if(substitutedA < 0 || substitutedA > this.getNumOfSubstitutes()) {
            throw new Exception("Invalid number of substituted");
        }
        SubstitutedA = substitutedA;
    }

    public int getSubstitutedB() {
        return SubstitutedB;
    }

    public void setSubstitutedB(int substitutedB) throws Exception{
        if(substitutedB < 0 || substitutedB > this.getNumOfSubstitutes()) {
            throw new Exception("Invalid number of substituted");
        }
        SubstitutedB = substitutedB;
    }
}
