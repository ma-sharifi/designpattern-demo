package com.example.behavioral.momento;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */
class LifeTest {

    @Test
    void shouldSaveAndRestoreTime() {
        List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();

        Life life = new Life();

        //time travel and record the eras
        life.set("1000 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("1000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("2000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("4000 A.D.");

        Assertions.assertEquals("1000 B.C.",life.restoreFromMemento(savedTimes.get(0)));
    }
}