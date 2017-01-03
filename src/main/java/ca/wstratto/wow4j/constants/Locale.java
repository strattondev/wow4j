package ca.wstratto.wow4j.constants;

public enum Locale {
    EN_US("en_US"),
    PT_BR("pt_BR"),
    ES_MX("es_MX"),
    EN_GB("en_GB"),
    DE_DE("de_DE"),
    ES_ES("es_ES"),
    FR_FR("fr_FR"),
    IT_IT("it_IT"),
    PL_PL("pl_PL"),
    PT_PT("pt_PT"),
    RU_RU("ru_RU"),
    KO_KR("ko_KR"),
    ZH_TW("zh_TW");

    private String locale;

    Locale(String locale) {
        this.locale = locale;
    }

    public String getLocale() {
        return locale;
    }
}
