package kata;

import kata.domain.Player;
import kata.domain.Score;
import kata.formatter.AdvantageFormatter;
import kata.formatter.WinFormatter;

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
    public String execute() {
        Score score1 = player1.getScore();
        Score score2 = player2.getScore();
        if (score1.isAdvantageThan(score2)) {
            return player1.advantage(new AdvantageFormatter());
        }

        if (score2.isAdvantageThan(score1)) {
            return player2.advantage(new AdvantageFormatter());
        }

        if (score1.hasWinThan(score2)) {
            return player1.win(new WinFormatter());
        }

        return player2.win(new WinFormatter());
    }
}
