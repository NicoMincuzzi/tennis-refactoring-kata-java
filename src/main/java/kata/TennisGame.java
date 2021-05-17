package kata;

public class TennisGame {

    public static final int MAX_POINT_NUMBER = 4;
    private int m_score1 = 0;
    private int m_score2 = 0;

    private final String player1Name;
    private final String player2Name;
    private final Score score;


    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        score = new Score();
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            m_score1 += 1;
        if (playerName.equals(player2Name))
            m_score2 += 1;
    }

    public String getScore() {
        if (m_score1 == m_score2) {
            return score.deuceScore(m_score1);
        }

        if (m_score1 >= MAX_POINT_NUMBER || m_score2 >= MAX_POINT_NUMBER) {
            return score.advantageScore(m_score1, m_score2);
        }

        return score.gameScore(m_score1, m_score2);
    }
}
