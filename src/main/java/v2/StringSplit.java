package v2;

public class StringSplit {

    private String input;

    public StringSplit(final String input) {
        this.input = input;
    }

    public String[] split(String delimiter) {
        return input.split(",");
    }
}
