package kata;

public interface Result {
    boolean canApply();

    String execute(Score score1, Score score2);
}
