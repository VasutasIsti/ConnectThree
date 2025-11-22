package org.connectthree;


import org.connectthree.objectives.Objective;

import java.time.Clock;
import java.time.Instant;
import java.util.List;
import java.io.Serializable;

public class Level implements Serializable {
    private GameMap map;
    private List<Objective> objectives;
    private Clock timer;
    private Instant startTime;
    private int score;

    public Level(GameMap map, List<Objective> objectives) {
        this.map = map;
        this.objectives = objectives;
        this.score = 0;
    }

    public Level(GameMap map, List<Objective> objectives, int score) {
        this.map = map;
        this.objectives = objectives;
        this.score = score;
    }

    public GameMap getMap() {
        return map;
    }

    public Clock getTimer() {return timer;}
    public Instant getStartTime() {return startTime;}
}

