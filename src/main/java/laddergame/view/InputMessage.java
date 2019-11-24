package laddergame.view;

public enum InputMessage {
    INPUT_NAME("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)"),
    INPUT_RESULT("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)"),
    INPUT_HEIGHT("최대 사다리 높이는 몇 개인가요?"),
    INPUT_RESULT_OF_USER("결과를 보고 싶은 사람은?");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
