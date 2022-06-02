
public class Main {
    public static void main(String[] args) throws Exception {
        // create a default game
        BallGame G = new BallGame();
        System.out.println("-------------------------------------------------");
        G.Display();
        try {
            G.setNumOfPlayerInEachTeam(13);
            G.setFirstTeam("Cuba");
            G.setFirstTeamScore(-3);
        }catch (Exception e) {
            System.out.println("Message " + e.getMessage());
        }
        System.out.println("-------------------------------------------------");

        G.Display();
        try {
            SoccerGame S = new SoccerGame();
            System.out.println("-------------------------------------------------");
            S.Display();
            S.TeamAScored();
            S.TeamBScored();
            S.SubstitutionA();
            S.SubstitutionB();
            S.Display();
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
