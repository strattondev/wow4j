package ca.wstratto.wow4j.constants;

import ca.wstratto.wow4j.response.Achievement;
import ca.wstratto.wow4j.response.Boss;
import ca.wstratto.wow4j.response.BossMasterList;
import ca.wstratto.wow4j.response.CharacterProfile;
import ca.wstratto.wow4j.response.GuildProfile;
import ca.wstratto.wow4j.response.Leaderboard;
import ca.wstratto.wow4j.response.MountMasterList;
import ca.wstratto.wow4j.response.PetAbility;
import ca.wstratto.wow4j.response.PetMasterList;
import ca.wstratto.wow4j.response.PetSpecies;
import ca.wstratto.wow4j.response.PetStats;
import ca.wstratto.wow4j.response.Quest;
import ca.wstratto.wow4j.response.RealmLeaderboard;
import ca.wstratto.wow4j.response.RealmStatus;
import ca.wstratto.wow4j.response.Recipe;
import ca.wstratto.wow4j.response.Spell;
import ca.wstratto.wow4j.response.Zone;
import ca.wstratto.wow4j.response.ZoneMasterList;
import ca.wstratto.wow4j.response.data.Battlegroups;
import ca.wstratto.wow4j.response.data.character.Classes;
import ca.wstratto.wow4j.response.data.character.Races;

import java.util.Arrays;
import java.util.List;

public enum RequestType {
    CHARACTER("wow/character/<realm>/<characterName>", CharacterProfile.class, RequestParams.REALM, RequestParams.CHARACTER_NAME),
    CHALLENGE_MODE_REALM_LEADERBOARD("wow/challenge/<realm>", RealmLeaderboard.class, RequestParams.REALM),
    ACHIEVEMENT("wow/achievement/<id>", Achievement.class, RequestParams.ID),
    BOSS("wow/boss/<id>", Boss.class, RequestParams.ID),
    BOSS_MASTER_LIST("wow/boss/", BossMasterList.class),
    GUILD("wow/guild/<realm>/<guildName>", GuildProfile.class, RequestParams.REALM, RequestParams.GUILD_NAME),
    MOUNT_MASTER_LIST("wow/mount/", MountMasterList.class),
    PET_MASTER_LIST("wow/pet/", PetMasterList.class),
    PET_SPECIES("wow/pet/species/<id>", PetSpecies.class, RequestParams.ID),
    PET_ABILITY("wow/pet/ability/<id>", PetAbility.class, RequestParams.ID),
    PET_STATS("wow/pet/stats/<id>", PetStats.class, RequestParams.ID),
    LEADERBOARD("wow/leaderboard/<bracket>", Leaderboard.class, RequestParams.BRACKET),
    QUEST("wow/quest/<id>", Quest.class, RequestParams.ID),
    REALM_STATUS("wow/realm/status", RealmStatus.class),
    RECIPE("wow/recipe/<id>", Recipe.class, RequestParams.ID),
    SPELL("wow/spell/<id>", Spell.class, RequestParams.ID),
    ZONE_MASTER_LIST("wow/zone/", ZoneMasterList.class),
    ZONE("wow/zone/<id>", Zone.class, RequestParams.ID),
    DATA_BATTLEGROUPS("wow/data/battlegroups/", Battlegroups.class),
    DATA_RACES("wow/data/character/races/", Races.class),
    DATA_CLASSES("wow/data/character/classes/", Classes.class);

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
