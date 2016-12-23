package ca.wstratto.wow4j.constants;

public enum Locale {
    EN_US("en_US");

    private String locale;

    Locale(String locale) {
        this.locale = locale;
    }

    public String getLocale() {
        return locale;
    }
}
