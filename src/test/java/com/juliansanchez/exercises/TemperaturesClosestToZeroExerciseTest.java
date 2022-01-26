package com.juliansanchez.exercises;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Temperatures closest to zero test exercise class
 */
public class TemperaturesClosestToZeroExerciseTest {
    private TemperaturesClosestToZeroExercise temperaturesClosestToZeroExercise;
    private List<Double> temperaturesList;

    /**
     * Scenario:
     * Executes {@link TemperaturesClosestToZeroExercise#closestToZero()} with valid values
     *
     * Expectation:
     * Returns {@link Double} temperature closest to zero
     */
    @Test
    void whenTemperaturesListHasValuesShouldReturnClosestToZero(){
        temperaturesList = List.of(7d, -10d, 13d, 8d, 4d, -7.2d, -12d, -3.7d, 3.5d, -9.6d, 6.5d, -1.7d, -6.2d, 7d);

        temperaturesClosestToZeroExercise = new TemperaturesClosestToZeroExercise(temperaturesList);

        assertEquals(-1.7d, temperaturesClosestToZeroExercise.closestToZero());
    }

    /**
     * Scenario:
     * Executes {@link TemperaturesClosestToZeroExercise#closestToZero()} with empty values
     *
     * Expectation:
     * Returns {@link Double} zero
     */
    @Test
    void whenTemperaturesListIsEmptyShouldReturnZero(){
        temperaturesClosestToZeroExercise = new TemperaturesClosestToZeroExercise(Collections.emptyList());

        assertEquals(0d, temperaturesClosestToZeroExercise.closestToZero());
    }

    /**
     * Scenario:
     * Executes {@link TemperaturesClosestToZeroExercise#closestToZero()} with valid values but two temeperatures
     * are as close to zero
     *
     * Expectation:
     * Returns {@link Double} positive temperature closest to zero
     */
    @Test
    void whenTwoTemperaturesAreAsCloseToZeroShouldConsiderThePositive(){
        temperaturesList = List.of(20d, -17d, 17d, 32d, -64d);

        temperaturesClosestToZeroExercise = new TemperaturesClosestToZeroExercise(temperaturesList);

        assertEquals(17d, temperaturesClosestToZeroExercise.closestToZero());
    }
}
