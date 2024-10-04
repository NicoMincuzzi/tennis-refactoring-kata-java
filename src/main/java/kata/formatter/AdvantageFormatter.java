package kata.formatter;

public class AdvantageFormatter implements Formatter {
    @Override
    public String format(String... text) {
        return "Advantage " + text[0];
    }
}
