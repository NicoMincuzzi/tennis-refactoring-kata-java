package kata;

import kata.domain.Player;

import java.util.List;

import static java.util.Arrays.asList;
import static kata.domain.Player.newPlayer;

public class TennisGame {

    private final Player player1;
    private final Player player2;
    private final List<Result> results;
    private final MatchResult matchResult;

    public TennisGame(String player1Name, String player2Name) {
        this.player1 = newPlayer(player1Name);
        this.player2 = newPlayer(player2Name);
        this.matchResult = new MatchResult(this.player1, this.player2);
        this.results = asList(new TieResult(this.player1, this.player2), new AdvantageResult(this.player1, this.player2));
    }

    public void wonPoint(String playerName) {
        if (player1.equals(newPlayer(playerName))) {
            player1.winPoint();
        } else {
            player2.winPoint();
        }
    }

    public String getScore() {
        return results.stream()
                .filter(Result::canApply)
                .findFirst()
                .map(Result::execute)
                .orElseGet(matchResult::execute);
    }
}
