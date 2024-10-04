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
        return score1.format().concat("-").concat(score2.format());
    }
}
