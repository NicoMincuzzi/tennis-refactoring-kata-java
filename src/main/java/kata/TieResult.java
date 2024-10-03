package kata;

public class TieResult implements Result {
    private final Player player1;
    private final Player player2;

    public TieResult(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public boolean canApply() {
        return player1.isTieTo(player2);
    }

    @Override
    public String execute(Score score1, Score score2) {
        String score;
        switch (score1.getValue()) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
