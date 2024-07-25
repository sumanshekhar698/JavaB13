package com.java.oops.encapsulation;

/**
 * FighterJet
 */

// public
// protected
// default
// private

class FighterJet {

    public String name;
    private float topSpeedInMach;// you can only acces directly within the class
    int celingHeight;// default
    boolean isMultiRole;// default

    FighterJet(String name, float topSpeedInMach, int celingHeight, boolean isMultiRole) {
        this.name = name;
        this.topSpeedInMach = topSpeedInMach;
        this.celingHeight = celingHeight;
        this.isMultiRole = isMultiRole;
    }

    // READ access, GETTERS
    public int getCelingHeight() {
        return celingHeight;
    }

    public void setCelingHeight(int celingHeight) {
        this.celingHeight = celingHeight;
    }

    public void foo() {

        System.out.println("Testing jet");
        bar();

    }

    private void bar() {
        System.out.println("Testing ended");
    }

}

public class Main {
    public static void main(String[] args) {
        FighterJet rafale = new FighterJet("Rafale", 1.8f, 48000, true);

        System.out.println(rafale.getCelingHeight());

        rafale.setCelingHeight(50000);

        System.out.println(rafale.getCelingHeight());

        // rafale.topSpeedInMach = 0;
        // System.out.println(rafale.topSpeedInMach);

        rafale.foo();
        // rafale.bar();

    }
}