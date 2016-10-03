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
public final class game {

    int player1score = 0;
    int player2score = 0;
    String player1name = "Player 1";
    String player2name = "Player 2";
    boolean player1Adv = false;
    boolean player2Adv = false;
    int player1wins = 0;
    int player2wins = 0;

    public game(boolean gameOrSet) {

        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.println("Welcome to the game score mode.");
        boolean gameRunner = false;
        while (gameRunner == false) {
            System.out.println("Enter \"Player 1 Scores!\" or \"Player 2 Scores\" to add to the respective players scores, or \"quit\" to return to the main menu.");
            if (gameOrSet == false) {
                System.out.println("You can also enter p1name or p2name for names, and p1score or p2score for the current score.");
            } else {
                System.out.println("You can also enter p1name or p2name for names, p1score or p2score for the current score, and p1wins or p2wins for the current number of wins.");
            }
            System.out.println();
            userInput = scanner.nextLine();
            System.out.println();
            if (userInput.equalsIgnoreCase("Player 1 Scores!")) {
                if (player1score == 3 && player1score != player2score) {
                    if (gameOrSet == false) {
                        System.out.println("Player 1 wins! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player1wins == 6 && player2wins == 6) {
                        System.out.println("Player 1 wins the set! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player1wins >= 5 && (player1wins - 1) >= player2wins) {
                        System.out.println("Player 1 wins the set! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player1score < 6) {
                        System.out.println("Player 1 wins the game!");
                        System.out.println();
                        player1score = 0;
                        player2score = 0;
                        player1wins++;
                    }
                } else if (player1score == 3 && player2score == 3) {
                    if (player1Adv == false && player2Adv == false) {
                        player1Adv = true;
                        printScore();
                        System.out.println();
                    } else if (player1Adv == false && player2Adv == true) {
                        player2Adv = false;
                        printScore();
                        System.out.println();
                    } else if (gameOrSet == false) {
                        System.out.println("Player 1 wins! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player1wins == 6 && player2wins == 6) {
                        System.out.println("Player 1 wins the set! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player1wins >= 5 && (player1wins - 1) >= player2wins) {
                        System.out.println("Player 1 wins the set! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player1score < 6) {
                        System.out.println("Player 1 wins the game!");
                        System.out.println();
                        player1score = 0;
                        player2score = 0;
                        player1wins++;
                    }
                } else {
                    player1score++;
                    printScore();
                }
            } else if (userInput.equalsIgnoreCase("Player 2 Scores!")) {
                if (player2score == 3 && player2score != player1score) {
                    if (gameOrSet == false) {
                        System.out.println("Player 2 wins! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player2wins == 6 && player1wins == 6) {
                        System.out.println("Player 2 wins the set! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player2wins >= 5 && (player2wins - 1) >= player1wins) {
                        System.out.println("Player 2 wins the set! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player2score < 6) {
                        System.out.println("Player 2 wins the game!");
                        System.out.println();
                        player1score = 0;
                        player2score = 0;
                        player2wins++;
                    }
                } else if (player2score == 3 && player1score == 3) {
                    if (player1Adv == false && player2Adv == false) {
                        player2Adv = true;
                        printScore();
                        System.out.println();
                    } else if (player2Adv == false && player1Adv == true) {
                        player1Adv = false;
                        printScore();
                        System.out.println();
                    } else if (gameOrSet == false) {
                        System.out.println("Player 2 wins! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player2wins == 6 && player1wins == 6) {
                        System.out.println("Player 2 wins the set! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player2wins >= 5 && (player2wins - 1) >= player1wins) {
                        System.out.println("Player 2 wins the set! Returning to main menu.");
                        System.out.println();
                        gameRunner = true;
                    } else if (player2score < 6) {
                        System.out.println("Player 2 wins the game!");
                        System.out.println();
                        player1score = 0;
                        player2score = 0;
                        player2wins++;
                    }
                } else {
                    player2score++;
                    printScore();
                }
            } else if (userInput.equalsIgnoreCase("quit")) {
                gameRunner = true;
            } else if (userInput.equalsIgnoreCase("p1name")) {
                getName(1);

            } else if (userInput.equalsIgnoreCase("p2name")) {
                getName(2);
            } else if (userInput.equalsIgnoreCase("p1score")) {
                getScore(1);
            } else if (userInput.equalsIgnoreCase("p2score")) {
                getScore(2);
            } else if (userInput.equalsIgnoreCase("p1wins")) {
                displayWins(1);
            } else if (userInput.equalsIgnoreCase("p2wins")) {
                displayWins(2);
            } else {
                System.out.println("Invalid Input");
                System.out.println();
            }
        }
    }

    public void getScore(int playerNumber) {
        if (playerNumber == 1) {
            switch (player1score) {
                case 0:
                    System.out.println("Player 1 score: love");
                    System.out.println();
                    break;
                case 1:
                    System.out.println("Player 1 score: fifteen");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Player 1 score: thirty");
                    System.out.println();
                    break;
                case 3:
                    if (player1Adv == false) {
                        System.out.println("Player 1 score: fourty");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Player 1 score: advantage");
                        System.out.println();
                        break;
                    }
                default:
                    break;
            }
        } else {
            switch (player2score) {
                case 0:
                    System.out.println("Player 2 score: love");
                    System.out.println();
                    break;
                case 1:
                    System.out.println("Player 2 score: fifteen");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Player 2 score: thirty");
                    System.out.println();
                    break;
                case 3:
                    if (player2Adv == false) {
                        System.out.println("Player 2 score: fourty");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Player 2 score: advantage");
                        System.out.println();
                        break;
                    }
                default:
                    break;
            }
        }
    }

    public void getName(int playerNumber) {
        if (playerNumber == 1) {
            System.out.println("Player 1 name: " + player1name);
            System.out.println();
        } else {
            System.out.println("Player 2 name: " + player2name);
            System.out.println();
        }

    }

    public void printScore() {
        StringBuilder temp = new StringBuilder();
        switch (player1score) {
            case 0:
                temp.append("Score is love to ");
                break;
            case 1:
                temp.append("Score is fifteen to ");
                break;
            case 2:
                temp.append("Score is thirty to ");
                break;
            case 3:
                if (player1Adv == false) {
                    temp.append("Score is fourty to ");
                    break;
                } else {
                    temp.append("Score is advantage to ");
                    break;
                }
            default:
                break;
        }
        switch (player2score) {
            case 0:
                temp.append("love.");
                break;
            case 1:
                temp.append("fifteen.");
                break;
            case 2:
                temp.append("thirty.");
                break;
            case 3:
                if (player2Adv == false) {
                    temp.append("fourty.");
                } else {
                    temp.append("advantage.");
                    break;
                }
            default:
                break;
        }
        System.out.println(temp.toString());
        System.out.println();
    }

    public void displayWins(int playerNumber) {
        if (playerNumber == 1) {
            System.out.println("Player 1 wins: " + player1wins);
            System.out.println();
        } else {
            System.out.println("Player 2 name: " + player2wins);
            System.out.println();
        }
    }
}
