package kata;

import static kata.Score.gameScoreMap;

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

    public int currentScore() {
        return score.getScore();
    }

    public String tieScore() {
        return gameScoreMap.get(currentScore()).concat("-All");
    }

    public boolean isDeuce(Player opponent) {
        return currentScore() >= 3 && score.equals(opponent.score);
    }

    public boolean hasAdvantage(Player opponent) {
        return currentScore() >= 4 && currentScore() - opponent.currentScore() == 1;
    }

    public boolean hasWonAgainst(Player opponent) {
        return currentScore() >= 4 && currentScore() - opponent.currentScore() >= 2;
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
