package org.example.labs.lab04.seasons;

public enum Seasons {
    SPRING("WARM"), SUMMER("WARM"), FALL("COLD"), WINTER("COLD");

    private final String description;

    Seasons(String descr) {
        this.description = descr;
    }

    public String getDescription() {
        return description;
    }
}
