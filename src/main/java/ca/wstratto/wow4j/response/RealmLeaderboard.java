package ca.wstratto.wow4j.response;

import ca.wstratto.wow4j.domain.realmleaderboard.ChallengeMode;

import java.util.List;

public class RealmLeaderboard extends AbstractResponse {
    private List<ChallengeMode> challenge;

    public List<ChallengeMode> getChallenge() {
        return challenge;
    }

    public void setChallenge(List<ChallengeMode> challenge) {
        this.challenge = challenge;
    }
}
