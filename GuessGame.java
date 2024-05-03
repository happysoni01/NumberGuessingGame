package com.company;
import java.util.Random;
import java.util.Scanner;

class GuessingGame{
    int number;
    int inputNumber;
    int guesses;

//getter and setter
    public void setGuesses(int guesses) {this.guesses = guesses;}
    public int getGuesses() {return guesses;}

//Constructor
    GuessingGame(){
        Random random=new Random();
        this.number=random.nextInt(100);
    }

//Input function
    public void takeUserInput(){
        System.out.println("Guess any number from 0 to 100");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

//To check the number
    boolean isCorrect(){
        guesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\n You guessed it in %d attempt(s)",number,guesses);
            return true;
        }
        else if (inputNumber>number) {
            System.out.println("The guessed number is too high!");
        }
        else if (inputNumber<number) {
            System.out.println("The guessed number is too low!");
        }
        return false;
    }

}
public class GuessGame {
    public static void main(String[] args) {
        GuessingGame play=new GuessingGame();
        boolean b = false;
        while(!b){
            play.takeUserInput();
            b= play.isCorrect();
        }
        System.out.println();
    }
}

