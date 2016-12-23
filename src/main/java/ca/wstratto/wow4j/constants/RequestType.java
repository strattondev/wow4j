package ca.wstratto.wow4j.constants;

import java.util.Arrays;
import java.util.List;

public enum RequestType {
    CHARACTER("wow/character/<realm>/<characterName>", RequestParams.REALM, RequestParams.CHARACTER_NAME),
    CHALLENGE_MODE_REALM_LEADERBOARD("wow/challenge/<realm>", RequestParams.REALM);

    private String dir;
    private List<RequestParams> requiredParams;

    RequestType(String dir, RequestParams... requiredParams) {
        this.dir = dir;
        this.requiredParams = Arrays.asList(requiredParams);
    }

    public String getDir() {
        return dir;
    }

    public List<RequestParams> getRequiredParams() {
        return requiredParams;
    }
}
