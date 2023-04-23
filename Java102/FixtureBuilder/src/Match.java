public class Match {

    private final Team homeTeam;
    private final Team awayTeam;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    @Override
    public String toString() {
        return homeTeam.getTeamName() + " (" + homeTeam.getTeamId() + ") vs (" + awayTeam.getTeamId() + ") " + awayTeam.getTeamName();
    }
}
