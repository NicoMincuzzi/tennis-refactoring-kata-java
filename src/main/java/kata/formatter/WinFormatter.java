package kata.formatter;

public class WinFormatter implements Formatter {

    @Override
    public String format(String... text) {
        return "Win for " + text[0];
    }
}