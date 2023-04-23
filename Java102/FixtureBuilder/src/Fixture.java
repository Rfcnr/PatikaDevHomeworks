import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fixture {
    public void createFixtureFromDefaultTeamList() {

        List<Team> defaultTeams = new ArrayList<>();
        defaultTeams.add(new Team(1, "Beşiktaş"       ));
        defaultTeams.add(new Team(2, "Galatasaray"    ));
        defaultTeams.add(new Team(3, "Fenerbahçe"     ));
        defaultTeams.add(new Team(4, "Trabzonspor"    ));
        defaultTeams.add(new Team(5, "Sakaryaspor"    ));
        defaultTeams.add(new Team(6, "Edirnespor"     ));
        defaultTeams.add(new Team(7, "Antalyaspor"    ));
        defaultTeams.add(new Team(8, "Alanyaspor"     ));
        defaultTeams.add(new Team(9, "Sivasspor"      ));
        defaultTeams.add(new Team(10, "Adanaspor"     ));
        defaultTeams.add(new Team(11, "Kayserispor"   ));
        defaultTeams.add(new Team(12, "Ankaragücü"    ));
        defaultTeams.add(new Team(13, "Hatayspor"     ));
        defaultTeams.add(new Team(14, "Göztepe"       ));
        defaultTeams.add(new Team(15, "Karşıyaka"     ));
        defaultTeams.add(new Team(16, "Gençlerbirliği"));
        defaultTeams.add(new Team(17, "Denizlispor"   ));
        defaultTeams.add(new Team(18, "Malatyaspor"   ));

        createFixture(defaultTeams);
    }

    synchronized public void createFixture(List<Team> teams){
        if(teams.size() % 2 == 1)
        {
            teams.add(new Team(teams.size() + 1, "BYE WEEK!"));
        }

        Collections.shuffle(teams);

        int teamCount = teams.size();
        int matchPerWeek = teamCount / 2;
        int totalWeekCount = (teamCount - 1) * 2;

        List<List<Match>> weekList = new ArrayList<>();

        for (int week = 0; week < totalWeekCount; week++) {
            List<Match> matchesOfWeek = new ArrayList<>();

            for (int match = 0; match < matchPerWeek; match++)
            {
                int home = (week + match) % (teamCount - 1);
                int away = (teamCount - 1 - match + week) % (teamCount - 1);
                if (match == 0) {
                    away = teamCount - 1;
                }
                matchesOfWeek.add(new Match(teams.get(home), teams.get(away)));
            }
            weekList.add(matchesOfWeek);
        }

        List<List<Match>> interleaved = new ArrayList<>();

        int evn = 0;
        int odd = (teamCount / 2);
        for (int i = 0; i < weekList.size(); i++) {
            if (i % 2 == 0) {
                interleaved.add(weekList.get(evn++));
            } else {
                interleaved.add(weekList.get(odd++));
            }
        }

        weekList = interleaved;

        for (int roundNumber = 0; roundNumber < weekList.size(); roundNumber++) {
            if (roundNumber % 2 == 1) {
                Match match = weekList.get(roundNumber).get(0);
                weekList.get(roundNumber).set(0, new Match(match.getAwayTeam(), match.getHomeTeam()));
            }
        }

        List<Match> allMatches = new ArrayList<>();
        for (List<Match> weeks : weekList)
        {
            allMatches.addAll(weeks);
        }

        int halfSize = allMatches.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            Team home = allMatches.get(i).getHomeTeam();
            Team away = allMatches.get(i).getAwayTeam();

            for (int j = halfSize; j < allMatches.size(); j++) {
                Team homeMirror = allMatches.get(j).getHomeTeam();
                Team awayMirror = allMatches.get(j).getAwayTeam();
                if(home.getTeamId() == homeMirror.getTeamId() )
                {
                    if(away.getTeamId() == awayMirror.getTeamId())
                    {
                        Match mirrorMatch = new Match(awayMirror, homeMirror);
                        allMatches.set(j, mirrorMatch);
                        break;
                    }
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < allMatches.size(); i++) {
            if(i % matchPerWeek == 0){
                System.out.println("\nWEEK " + ++counter);
            }
            System.out.println(allMatches.get(i));
        }
    }
}
