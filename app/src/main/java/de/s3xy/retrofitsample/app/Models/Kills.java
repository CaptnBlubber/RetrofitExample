package de.s3xy.retrofitsample.app.Models;

import com.google.gson.annotations.Expose;

public class Kills {

    @Expose
    private int monsters;
    @Expose
    private int elites;
    @Expose
    private int hardcoreMonsters;

    public int getMonsters() {
        return monsters;
    }

    public void setMonsters(int monsters) {
        this.monsters = monsters;
    }

    public int getElites() {
        return elites;
    }

    public void setElites(int elites) {
        this.elites = elites;
    }

    public int getHardcoreMonsters() {
        return hardcoreMonsters;
    }

    public void setHardcoreMonsters(int hardcoreMonsters) {
        this.hardcoreMonsters = hardcoreMonsters;
    }

    @Override
    public String toString() {
        return String.valueOf(monsters + elites + hardcoreMonsters);
    }
}
