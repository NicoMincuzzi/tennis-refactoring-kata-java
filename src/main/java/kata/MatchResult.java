package kata;

public class MatchResult {
    private final Player player1;
    private final Player player2;

    public MatchResult(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String execute() {
        return player1.getScore().result(player2.getScore(), new MatchResultFormatter());
    }
}
