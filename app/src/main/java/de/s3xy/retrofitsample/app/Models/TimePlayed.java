package de.s3xy.retrofitsample.app.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimePlayed {

    @Expose
    private float barbarian;
    @Expose
    private float crusader;
    @SerializedName("demon-hunter")
    @Expose
    private int demon_hunter;
    @Expose
    private float monk;
    @SerializedName("witch-doctor")
    @Expose
    private int witch_doctor;
    @Expose
    private float wizard;

    public float getBarbarian() {
        return barbarian;
    }

    public void setBarbarian(float barbarian) {
        this.barbarian = barbarian;
    }

    public float getCrusader() {
        return crusader;
    }

    public void setCrusader(float crusader) {
        this.crusader = crusader;
    }

    public int getDemon_hunter() {
        return demon_hunter;
    }

    public void setDemon_hunter(int demon_hunter) {
        this.demon_hunter = demon_hunter;
    }

    public float getMonk() {
        return monk;
    }

    public void setMonk(float monk) {
        this.monk = monk;
    }

    public int getWitch_doctor() {
        return witch_doctor;
    }

    public void setWitch_doctor(int witch_doctor) {
        this.witch_doctor = witch_doctor;
    }

    public float getWizard() {
        return wizard;
    }

    public void setWizard(float wizard) {
        this.wizard = wizard;
    }

}
