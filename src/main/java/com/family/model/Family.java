package com.family.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Family {
  private String familyinitial;

    public String getFamilyinitial() {
        return familyinitial;
    }

    public void setFamilyinitial(String familyinitial) {
        this.familyinitial = familyinitial;
    }

    public String getFamilyproper() {
        return familyproper;
    }

    public void setFamilyproper(String familyproper) {
        this.familyproper = familyproper;
    }

    public int getNumberofmember() {
        return numberofmember;
    }

    public void setNumberofmember(int numberofmember) {
        this.numberofmember = numberofmember;
    }

    private String familyproper;
  private int numberofmember;
}
