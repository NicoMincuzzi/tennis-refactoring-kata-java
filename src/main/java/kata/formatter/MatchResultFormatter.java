package kata.formatter;

public class MatchResultFormatter implements Formatter {

    @Override
    public String format(String... text) {
        return text[0].concat("-").concat(text[1]);
    }
}
