package kata;

public class MatchResult implements Result {
    private final Player player1;
    private final Player player2;

    public MatchResult(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public boolean canApply() {
        return !player1.isTieTo(player2) && !player1.isAdvantage() && !player2.isAdvantage();
    }

    @Override
    public String execute(Score score1, Score score2) {
        String score = "";
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = score1.getValue();
            } else {
                score += "-";
                tempScore = score2.getValue();
            }

            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}
