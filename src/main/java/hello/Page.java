package hello;

public class Page {
    private final String content;
    private final String content1;

    public Page(String content1) {
        this.content = "Максимальный текст ";
        this.content1 = content1;
    }

    public String getContent() {
        return content;
    }

    public String getContent1() {
        return content1;
    }
}
