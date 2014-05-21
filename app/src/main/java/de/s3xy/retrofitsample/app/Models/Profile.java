package de.s3xy.retrofitsample.app.Models;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class Profile {

    @Expose
    private List<Hero> heroes = new ArrayList<Hero>();
    @Expose
    private int lastHeroPlayed;
    @Expose
    private int lastUpdated;
    @Expose
    private Kills kills;
    @Expose
    private TimePlayed timePlayed;
    @Expose
    private List<Object> fallenHeroes = new ArrayList<Object>();
    @Expose
    private int paragonLevel;
    @Expose
    private int paragonLevelHardcore;
    @Expose
    private String battleTag;
    @Expose
    private Progression progression;

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    public int getLastHeroPlayed() {
        return lastHeroPlayed;
    }

    public void setLastHeroPlayed(int lastHeroPlayed) {
        this.lastHeroPlayed = lastHeroPlayed;
    }

    public int getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(int lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Kills getKills() {
        return kills;
    }

    public void setKills(Kills kills) {
        this.kills = kills;
    }

    public TimePlayed getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(TimePlayed timePlayed) {
        this.timePlayed = timePlayed;
    }

    public List<Object> getFallenHeroes() {
        return fallenHeroes;
    }

    public void setFallenHeroes(List<Object> fallenHeroes) {
        this.fallenHeroes = fallenHeroes;
    }

    public int getParagonLevel() {
        return paragonLevel;
    }

    public void setParagonLevel(int paragonLevel) {
        this.paragonLevel = paragonLevel;
    }

    public int getParagonLevelHardcore() {
        return paragonLevelHardcore;
    }

    public void setParagonLevelHardcore(int paragonLevelHardcore) {
        this.paragonLevelHardcore = paragonLevelHardcore;
    }

    public String getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(String battleTag) {
        this.battleTag = battleTag;
    }

    public Progression getProgression() {
        return progression;
    }

    public void setProgression(Progression progression) {
        this.progression = progression;
    }

}
