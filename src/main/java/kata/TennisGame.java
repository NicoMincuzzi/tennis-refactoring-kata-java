package kata;

import java.util.Map;

public class TennisGame {

    public static final int MAX_POINT_NUMBER = 4;
    private int m_score1 = 0;
    private int m_score2 = 0;

    private final String player1Name;
    private final String player2Name;

    private final Map<Integer, String> scoreMap = Map.of(
            0, "Love-All",
            1, "Fifteen-All",
            2, "Thirty-All");

    private final Map<Integer, String> gameScoreMap = Map.of(
            0, "Love",
            1, "Fifteen",
            2, "Thirty",
            3, "Forty");

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            m_score1 += 1;
        if (playerName.equals(player2Name))
            m_score2 += 1;
    }

    public String getScore() {
        if (m_score1 == m_score2) {
            if (scoreMap.get(m_score1) != null)
                return scoreMap.get(m_score1);
            return "Deuce";
        }

        if (m_score1 >= MAX_POINT_NUMBER || m_score2 >= MAX_POINT_NUMBER) {
            return advantageScore();
        }

        return gameScore();
    }

    private String advantageScore() {
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1)
            return "Advantage player1";
        if (minusResult == -1)
            return "Advantage player2";
        if (minusResult >= 2)
            return "Win for player1";
        return "Win for player2";
    }

    private String gameScore() {
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i != 1)
                score = score.concat("-");
            int tempScore = (i == 1) ? m_score1 : m_score2;
            score = score.concat(gameScoreMap.get(tempScore));
        }
        return score;
    }
}
