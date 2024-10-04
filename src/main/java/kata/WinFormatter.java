package kata;

public class WinFormatter implements Formatter {

    @Override
    public String format(String text) {
        return "Win for " + text;
    }
}
