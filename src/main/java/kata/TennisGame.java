package kata;

import java.util.List;

import static java.util.Arrays.asList;

public class TennisGame {

    private final Player player1;
    private final Player player2;
    private final List<Result> results;

    public TennisGame(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, new Score(0));
        this.player2 = new Player(player2Name, new Score(0));
        this.results = asList(new TieResult(this.player1, this.player2), new AdvantageResult(this.player1, this.player2), new MatchResult(this.player1, this.player2));
    }

    public void wonPoint(String playerName) {
        if (player1.equals(new Player(playerName, new Score(0))))
            player1.winPoint();
        else
            player2.winPoint();
    }

    public String getScore() {
        return results.stream()
                .filter(Result::canApply)
                .findFirst()
                .map(it -> it.execute(player1.getScore(), player2.getScore())).get();
    }
}
