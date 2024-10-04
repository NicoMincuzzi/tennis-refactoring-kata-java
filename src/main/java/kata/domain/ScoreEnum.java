package kata.domain;


import java.util.Optional;

import static java.util.Arrays.stream;

public enum ScoreEnum {
    LOVE(0, "Love"),
    FIFTEEN(1, "Fifteen"),
    THIRTY(2, "Thirty"),
    FORTY(3, "Forty");

    private final int value;
    private final String name;

    ScoreEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String formatToString(int value) {
        Optional<ScoreEnum> scoreEnum = stream(values()).filter(it -> it.value == value).findFirst();
        if (scoreEnum.isPresent()) {
            return scoreEnum.get().name;
        }
        return "";
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
