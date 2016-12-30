package ca.wstratto.wow4j.domain.characterprofile.item;

import ca.wstratto.wow4j.domain.characterprofile.item.properties.Appearance;
import ca.wstratto.wow4j.domain.characterprofile.item.properties.ArtifactTrait;
import ca.wstratto.wow4j.domain.characterprofile.item.properties.Relic;
import ca.wstratto.wow4j.domain.characterprofile.item.properties.Stat;
import ca.wstratto.wow4j.domain.characterprofile.item.properties.TooltipParams;
import ca.wstratto.wow4j.domain.characterprofile.item.properties.WeaponInfo;

import java.util.List;

public class Item {
    private int id;
    private String name;
    private String icon;
    private int quality;
    private int itemLevel;
    private List<Stat> stats;
    private int armor;
    private String context;
    private List<Integer> bonusList;
    private int artifactId;
    private int displayInfoId;
    private int artifactAppearanceId;
    private List<ArtifactTrait> artifactTraits;
    private List<Relic> relics;
    private Appearance appearance;
    private TooltipParams tooltipParams;
    private WeaponInfo weaponInfo;
}
