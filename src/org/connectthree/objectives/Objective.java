package org.connectthree.objectives;

import org.connectthree.Level;

import java.io.Serializable;

public interface Objective extends Serializable {
    default boolean isStatisfied(Level level) {
        return false;
    }
}
