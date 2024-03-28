package v1;


public class StringSplitter {

    private final String input;

    public StringSplitter(final String input) {
        validateInputText(input);
        this.input = input;
    }

    private void validateInputText(final String inputText) {
        if (inputText == null || inputText.trim().equals("")) {
            throw new IllegalArgumentException("자동차들의 이름은 필수입니다.");
        }
    }

    public String[] split(final String delimiter) {
        return input.split(delimiter);
    }
}
