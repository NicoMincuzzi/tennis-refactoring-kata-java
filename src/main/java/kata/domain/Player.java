package kata.domain;

import kata.formatter.Formatter;

import java.util.Objects;

public class Player {
    private final String name;
    private final Score score;

    private Player(String name, Score score) {
        this.name = name;
        this.score = score;
    }

    public static Player newPlayer(String name) {
        return new Player(name, new Score(0));
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
