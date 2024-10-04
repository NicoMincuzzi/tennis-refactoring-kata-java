package kata;

import java.util.Objects;

public class Player {
    private final String name;
    private final Score score;

    public Player(String name, Score score) {
        this.name = name;
        this.score = score;
    }

    public Score getScore() {
        return score;
    }

    public void winPoint() {
        score.increment();
    }

    public boolean isAdvantage() {
        return score.isAdvantage();
    }

    public boolean isTieTo(Player player2) {
        return score.equals(player2.getScore());
    }

    public String advantage(Formatter formatter) {
        return formatter.format(name);
    }

    public String win(Formatter formatter) {
        return formatter.format(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
