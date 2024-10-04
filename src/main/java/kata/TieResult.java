package kata;

import kata.domain.Player;
import kata.formatter.TieFormatter;

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
    public String execute() {
        return player1.getScore().isTie(new TieFormatter());
    }
}
