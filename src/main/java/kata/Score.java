package kata;

import java.util.Map;

public class Score {
    private int score;

    public Score(int point) {
        this.score = point;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score += 1;
    }

    public static final Map<Integer, String> gameScoreMap = Map.of(
            0, "Love",
            1, "Fifteen",
            2, "Thirty",
            3, "Forty");

    @Override
    public boolean equals(Object obj) {
        Score score = (Score) obj;
        return this.score == score.score;
    }
}
