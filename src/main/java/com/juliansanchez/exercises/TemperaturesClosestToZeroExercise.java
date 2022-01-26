package com.juliansanchez.exercises;

import java.util.List;

import static java.lang.Math.abs;

/**
 * Temperatures closest to zero exercise class
 */
public class TemperaturesClosestToZeroExercise{
    private static final Double DEFAULT_VALUE = 0d;
    private List<Double> temperaturesList;

    public TemperaturesClosestToZeroExercise (List<Double> temperaturesList){
        this.temperaturesList = temperaturesList;
    }

    /**
     * Process a {@link List<Double>} of temperatures and returns the temperature closest to zero
     *
     * @return {@link Double}
     */
    public Double closestToZero(){
        Double closestToZero = DEFAULT_VALUE;

        if (!temperaturesList.isEmpty()){
            closestToZero = temperaturesList.get(0);

            for (Double temperature : temperaturesList) {
                if (abs(temperature) < abs(closestToZero)) {
                    closestToZero = temperature;
                } else if (abs(temperature) == abs(closestToZero) && closestToZero < 0) {
                    closestToZero = temperature;
                }
            }
        }

        return closestToZero;
    }
}
