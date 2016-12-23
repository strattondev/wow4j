package ca.wstratto.wow4j.constants;

public enum RequestParams {
    REALM("realm"),
    CHARACTER_NAME("characterName");

    private String templateKey;

    RequestParams(String templateKey) {
        this.templateKey = templateKey;
    }

    public String getTemplateKey() {
        return templateKey;
    }
}