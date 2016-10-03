/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennisproject;

import java.util.Scanner;

/**
 *
 * @author Daniel Olsen
 */
public class TennisProject {

    public static void main(String[] args) {
        boolean gameContinue = false;
        Scanner scanner = new Scanner(System.in);
        String userInput;
        game newGame;
        System.out.println("Welcome to the tennis simulator.");
        while (gameContinue == false) {
            System.out.println("Please enter what game type you wish to play, game types include game or set, or enter quit to exit the game.");
            System.out.println();
            userInput = scanner.nextLine();
            System.out.println();

            if (userInput.equalsIgnoreCase("game")) {
                newGame = new game(false);

            } else if (userInput.equalsIgnoreCase("set")) {
                newGame = new game(true);
            } else if (userInput.equalsIgnoreCase("quit")) {
                gameContinue = true;
            } else {
                System.out.println("Invalid input");
                System.out.println();
            }
        }
        System.out.println("Thanks for playing.");
    }

}
