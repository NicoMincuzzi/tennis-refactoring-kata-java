package kata.formatter;


import static kata.domain.ScoreEnum.FORTY;

public class TieFormatter implements Formatter {
    @Override
    public String format(String... text) {
        return text[0].isEmpty() || text[0].equals(FORTY.getName()) ? "Deuce" : text[0] + "-All";
    }
}
