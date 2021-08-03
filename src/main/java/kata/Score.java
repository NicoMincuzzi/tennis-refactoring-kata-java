package kata;

import java.util.Map;

public class Score {
    private final Map<Integer, String> gameScoreMap = Map.of(
            0, "Love",
            1, "Fifteen",
            2, "Thirty",
            3, "Forty");
    private int score;

    public Score(int point) {
        this.score = point;
    }

    public void addScore() {
        score += 1;
    }

    public String scoreResult(Score opponentScore) {
        return gameScoreMap.get(score).concat("-").concat(gameScoreMap.get(opponentScore.score));
    }

    public String tieScore(Score score) {
        return gameScoreMap.get(score.score).concat("-All");
    }

    public boolean isDeuce(Score player1Score, Score player2Score) {
        return score >= 3 && player1Score.equals(player2Score);
    }

    public boolean hasAdvantage(Score opponent) {
        return score >= 4 && score - opponent.score == 1;
    }

    public boolean hasWonAgainst(Score opponent) {
        return score >= 4 && score - opponent.score >= 2;
    }

    @Override
    public boolean equals(Object obj) {
        Score score = (Score) obj;
        return this.score == score.score;
    }
}
