package com.github.irobson.jgenderize.model;

import java.io.Serializable;

public class NameGender implements Serializable {

    public NameGender() {
    }

    private String name;

    private String gender;

    private Float probability;

    private Integer count;

    public boolean isMale() {
        return Gender.MALE.equals(this.getGenderType());
    }

    public boolean isFemale() {
        return Gender.FEMALE.equals(this.getGenderType());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Gender getGenderType() {
        if (this.gender == null) {
            return Gender.NULL;
        }
        return Gender.valueOf(this.gender.toUpperCase());
    }

    public Float getProbability() {
        return probability;
    }

    public void setProbability(Float probability) {
        this.probability = probability;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Name{" + "name=" + name + ", gender=" + gender + ", probability=" + probability + ", count=" + count + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 13 * hash + (this.gender != null ? this.gender.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NameGender other = (NameGender) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.gender == null) ? (other.gender != null) : !this.gender.equals(other.gender)) {
            return false;
        }
        return true;
    }

}
