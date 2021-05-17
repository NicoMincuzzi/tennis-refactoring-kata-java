package kata;

import java.util.Map;

public class Score {

    private final Map<Integer, String> scoreMap = Map.of(
            0, "Love-All",
            1, "Fifteen-All",
            2, "Thirty-All");

    private final Map<Integer, String> gameScoreMap = Map.of(
            0, "Love",
            1, "Fifteen",
            2, "Thirty",
            3, "Forty");

    public String deuceScore(int score) {
        if (scoreMap.get(score) != null)
            return scoreMap.get(score);
        return "Deuce";
    }

    public String advantageScore(int score1, int score2) {
        int minusResult = score1 - score2;
        if (minusResult == 1)
            return "Advantage player1";
        if (minusResult == -1)
            return "Advantage player2";
        if (minusResult >= 2)
            return "Win for player1";
        return "Win for player2";
    }

    public String gameScore(int score1, int score2) {
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i != 1)
                score = score.concat("-");
            int tempScore = (i == 1) ? score1 : score2;
            score = score.concat(gameScoreMap.get(tempScore));
        }
        return score;
    }
}
