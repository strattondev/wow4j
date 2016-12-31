package ca.wstratto.wow4j.constants;

import ca.wstratto.wow4j.response.Achievement;
import ca.wstratto.wow4j.response.CharacterProfile;
import ca.wstratto.wow4j.response.RealmLeaderboard;

import java.util.Arrays;
import java.util.List;

public enum RequestType {
    CHARACTER("wow/character/<realm>/<characterName>", CharacterProfile.class, RequestParams.REALM, RequestParams.CHARACTER_NAME),
    CHALLENGE_MODE_REALM_LEADERBOARD("wow/challenge/<realm>", RealmLeaderboard.class, RequestParams.REALM),
    ACHIEVEMENT("wow/achievement/<id>", Achievement.class, RequestParams.ID);

    private String dir;
    private Class responseType;
    private List<RequestParams> requiredParams;

    RequestType(String dir, Class responseType, RequestParams... requiredParams) {
        this.dir = dir;
        this.responseType = responseType;
        this.requiredParams = Arrays.asList(requiredParams);
    }

    public String getDir() {
        return dir;
    }

    public Class getResponseType() {
        return responseType;
    }

    public List<RequestParams> getRequiredParams() {
        return requiredParams;
    }
}
