package pl.naukaprogramowania;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("==================================");
        System.out.println("Gra w zgadywanie liczby?");
        System.out.println("==================================");

        System.out.println("range of the game from 0 to:");
        int range = scan.nextInt();
        System.out.println("==================================");

        int numberToGuess = rand.nextInt(range);
        int yourNumber;
        int numberOfTries = 0;



        do{
            numberOfTries++;

            System.out.println("Podaj swoja liczbe: ");
            yourNumber = scan.nextInt();

            if(yourNumber > range || yourNumber < 0){
                System.out.println("==================================");
                System.out.println("Twoja liczba nie miesci sie w wymaganiach!\nSprobuj jeszcze raz!");
                System.out.println("==================================");
                continue;
            }

            if(yourNumber > numberToGuess) {
                System.out.println("==================================");
                System.out.println("Za duza liczba!");
            }
            else if(yourNumber < numberToGuess){
                System.out.println("==================================");
                System.out.println("za mala liczba!");
            }
            else{
                System.out.println("==================================");
                System.out.println("Brawo zgadles liczbe!\n" + "Twoja liczba: " + yourNumber + "\nLiczba do zgadniecia: " + numberToGuess);
                System.out.println("==================================");
            }

        }while(numberToGuess != yourNumber);

        System.out.println("ilosc prob: " + numberOfTries);
    }
}
