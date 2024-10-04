package kata;

import java.util.Objects;

public class Score {

    private int value;

    public Score(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }

    public boolean isAdvantage() {
        return value >= 4;
    }

    public int minResult(Score other) {
        return value - other.getValue();
    }

    public String format() {
        if (value == 0) {
            return "Love";
        } else if (value == 1) {
            return "Fifteen";
        } else if (value == 2) {
            return "Thirty";
        } else if (value == 3) {
            return "Forty";
        }
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return value == score.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
