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

    public String formatToString() {
        if (value == 0) {
            return "Love";
        }
        if (value == 1) {
            return "Fifteen";
        }
        if (value == 2) {
            return "Thirty";
        }
        if (value == 3) {
            return "Forty";
        }
        return "";
    }

    public boolean isAdvantageThan(Score score) {
        return diffThan(score) == 1;
    }

    public boolean hasWinThan(Score score) {
        return diffThan(score) >= 2;
    }

    public String result(Score other, Formatter formatter) {
        return formatter.format(formatToString(), other.formatToString());
    }

    private int diffThan(Score other) {
        return value - other.getValue();
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
