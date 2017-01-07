wow4j (0.1.16)
=========

A BattleNet Java wrapper for WoW Community APIs

### Personal API key

You must use your personal API key. API keys can be found at https://dev.battle.net/

### Jar
Download latest jar from https://github.com/strattonw/wow4j/tree/master/jars

Maven coming soom(tm)

### Usage
```java
Connection connection = Connection.getInstance("API Key", Region.US, Locale.EN_US);
Request request = RequestBuilder.create()
                .setRequestType(RequestType.CHARACTER)
                .addRequiredParamValue(RequestParams.REALM, "illidan")
                .addRequiredParamValue(RequestParams.CHARACTER_NAME, "puntr")
                .addOptionalParamValues("fields", "achievements,appearance,feed")
                .addOptionalParamValues("fields", "guild,hunterPets,items")
                .addOptionalParamValues("fields", "mounts,pets,petSlots")
                .addOptionalParamValues("fields", "professions,progression,pvp")
                .addOptionalParamValues("fields", "quests,reputation,statistics")
                .addOptionalParamValues("fields", "stats,talents,titles")
                .build();

try {
    AbstractResponse abstractResponse = connection.getRequestData(request);
} catch (UnirestException | UnsupportedEncodingException e) {
    e.printStackTrace();
}
```

### Todo
* Fix project structure (v1.0)
* Add Data Resources