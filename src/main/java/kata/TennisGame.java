package kata;

import java.util.Map;

public class TennisGame {

    public static final int DEFAULT_SCORE = -1;
    private int m_score1 = 0;
    private int m_score2 = 0;
    private final String player1Name;
    private final String player2Name;

    private final Map<Integer, String> scoreMap = Map.of(
            0, "Love-All",
            1, "Fifteen-All",
            2, "Thirty-All",
            -1, "Deuce");

    private final Map<Integer, String> scoreMap_2 = Map.of(
            0, "Love",
            1, "Fifteen",
            2, "Thirty",
            3, "Forty");

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore;

        if (m_score1 == m_score2) {
            if (scoreMap.get(m_score1) != null)
                return scoreMap.get(m_score1);
            return scoreMap.get(DEFAULT_SCORE);
        }

        if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1)
                score = "Advantage player1";
            else if (minusResult == -1)
                score = "Advantage player2";
            else if (minusResult >= 2)
                score = "Win for player1";
            else
                score = "Win for player2";
            return score;
        }

        for (int i = 1; i < 3; i++) {
            if (i == 1)
                tempScore = m_score1;
            else {
                score += "-";
                tempScore = m_score2;
            }
            score = score.concat(scoreMap_2.get(tempScore));
        }
        return score;
    }
}
