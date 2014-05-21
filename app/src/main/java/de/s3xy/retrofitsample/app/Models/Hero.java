package de.s3xy.retrofitsample.app.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hero {

    @Expose
    private int paragonLevel;
    @Expose
    private String name;
    @Expose
    private int id;
    @Expose
    private int level;
    @Expose
    private boolean hardcore;
    @Expose
    private int gender;
    @Expose
    private boolean dead;
    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("last-updated")
    @Expose
    private int last_updated;

    public int getParagonLevel() {
        return paragonLevel;
    }

    public void setParagonLevel(int paragonLevel) {
        this.paragonLevel = paragonLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isHardcore() {
        return hardcore;
    }

    public void setHardcore(boolean hardcore) {
        this.hardcore = hardcore;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public int getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(int last_updated) {
        this.last_updated = last_updated;
    }

}
