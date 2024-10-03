package kata;

public class AdvantageResult implements Result {
    private final Player player1;
    private final Player player2;

    public AdvantageResult(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public boolean canApply() {
        return player1.isAdvantage() || player2.isAdvantage();
    }

    @Override
    public String execute(Score score1, Score score2) {
        String score;
        int minusResult = score1.minResult(score2);

        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";

        return score;
    }
}
