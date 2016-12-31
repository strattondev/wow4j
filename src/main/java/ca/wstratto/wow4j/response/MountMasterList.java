package ca.wstratto.wow4j.response;

import ca.wstratto.wow4j.domain.characterprofile.collectable.Mount;

import java.util.List;

public class MountMasterList extends AbstractResponse {
    private List<Mount> mounts;

    public List<Mount> getMounts() {
        return mounts;
    }

    public void setMounts(List<Mount> mounts) {
        this.mounts = mounts;
    }
}
