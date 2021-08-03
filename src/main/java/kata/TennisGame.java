package kata;

public class TennisGame {
    private final Player player1;
    private final Player player2;

    public TennisGame(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (new Player(playerName).equals(player1)) {
            player1.wonPoint();
            return;
        }
        player2.wonPoint();
    }

    public String getScore() {
        if (player1.isDeuce(player2))
            return "Deuce";

        if (player1.isTieScore(player2)) {
            return player1.tieScore(player2);
        }

        if (player1.hasAdvantage(player2))
            return player1.advantageMessage();
        if (player2.hasAdvantage(player1))
            return player2.advantageMessage();

        if (player1.hasWonAgainst(player2))
            return player1.winMessage();
        if (player2.hasWonAgainst(player1))
            return player2.winMessage();

        return player1.currentScore(player2);
    }
}
