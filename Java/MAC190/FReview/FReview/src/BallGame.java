public class BallGame {
    private String FirstTeam, SecondTeam;
    private int NumOfPlayerInEachTeam;
    private int NumOfSubstitutes;
    private int Score;

    // Provide a default constructor
    public BallGame() throws Exception {
        this("Unknown","Unknown",0,0,0);
    }

    public BallGame(String firstTeam, String secondTeam, int numOfPlayerInEachTeam, int numOfSubstitutes, int score) throws Exception {
    }


    // Provide accessors for each of the members
    public String getFirstTeam() {
        return FirstTeam;
    }
    public void setFirstTeam(String firstTeam) throws Exception{
        FirstTeam = firstTeam;
    }
    public String getSecondTeam() {
        return SecondTeam;
    }
    public void setSecondTeam(String secondTeam) throws Exception{
        SecondTeam = secondTeam;
    }
    public int getNumOfPlayerInEachTeam() {
        return NumOfPlayerInEachTeam;
    }
    public void setNumOfPlayerInEachTeam(int numOfPlayerInEachTeam) throws Exception{
        NumOfPlayerInEachTeam = numOfPlayerInEachTeam;
    }
    public int getNumOfSubstitutes() {
        return NumOfSubstitutes;
    }
    public void setNumOfSubstitutes(int numOfSubstitutes) throws Exception{
        NumOfSubstitutes = numOfSubstitutes;
    }
    public int getScore() {
        return Score;
    }
    public void setScore(int score) throws Exception{
        Score = score;
    }
}
