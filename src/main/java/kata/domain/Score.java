package kata.domain;

import kata.formatter.Formatter;

import java.util.Objects;

import static kata.domain.ScoreEnum.FORTY;

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
        return value > FORTY.getValue();
    }

    public boolean isAdvantageThan(Score score) {
        return diffThan(score) == 1;
    }

    public boolean hasWinThan(Score score) {
        return diffThan(score) >= 2;
    }

    public String isTie(Formatter formatter) {
        String resultName = ScoreEnum.formatToString(value);
        return formatter.format(resultName);
    }

    public String result(Score other, Formatter formatter) {
        return formatter.format(ScoreEnum.formatToString(value), ScoreEnum.formatToString(other.getValue()));
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
