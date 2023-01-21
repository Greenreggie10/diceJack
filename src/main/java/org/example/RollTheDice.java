package org.example;

public class RollTheDice {

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }

}
