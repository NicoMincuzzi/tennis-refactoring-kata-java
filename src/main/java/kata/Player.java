package kata;

public class Player {
    private final String name;
    private final Score score;

    public Player(String name) {
        this.name = name;
        this.score = new Score(0);
    }

    public void wonPoint() {
        score.addScore();
    }

    public String currentScore(Player opponent) {
        return score.scoreResult(opponent.score);
    }

    public boolean isTieScore(Player player) {
        return this.score.equals(player.score);
    }

    public String tieScore(Player player) {
        return score.tieScore(player.score);
    }

    public boolean isDeuce(Player opponent) {
        return score.isDeuce(score, opponent.score);
    }

    public boolean hasAdvantage(Player opponent) {
        return score.hasAdvantage(opponent.score);
    }

    public boolean hasWonAgainst(Player opponent) {
        return score.hasWonAgainst(opponent.score);
    }

    public String advantageMessage() {
        return "Advantage " + name;
    }

    public String winMessage() {
        return "Win for " + name;
    }

    @Override
    public boolean equals(Object obj) {
        Player player = (Player) obj;
        return name.equals(player.name);
    }
}
