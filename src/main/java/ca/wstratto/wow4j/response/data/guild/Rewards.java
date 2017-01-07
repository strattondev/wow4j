package ca.wstratto.wow4j.response.data.guild;

import ca.wstratto.wow4j.domain.data.Reward;
import ca.wstratto.wow4j.response.AbstractResponse;

import java.util.List;

public class Rewards extends AbstractResponse {
    private List<Reward> rewards;

    public List<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }
}
