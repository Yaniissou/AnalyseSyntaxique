package model;

public enum ResultType {
    ARRAY("array"), INTEGER("int");

    private final String textType;

    ResultType(String type) {
        this.textType = type;
    }

    public String getTextType() {
        return textType;
    }
}
