package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int total = random.nextInt(11) + random.nextInt(11) + 2;

        int userTotal = random.nextInt(11) + random.nextInt(11) + 2;
        System.out.println("You drew 2 cards totalling: "+ userTotal);

        if (userTotal > 21) {
            System.out.println("You have gone over 21. You Lose!");
        }

        else if (userTotal == 21) {
            System.out.println("You got exactly 21. You Win!");
        }

        else if (userTotal < 21) {
            System.out.println("Draw another? (Y/N)");
            String choice = input.next();



            while (choice.equals("y") || choice.equals("Y")) {

                userTotal = userTotal + (random.nextInt(11) + 1);
                System.out.println("You drew another card totalling: "+ userTotal);

                while (total <= userTotal && userTotal < 21) {
                    total = total + random.nextInt(11) + 1;
                    System.out.println("Dealer drew another card totalling: " + total);
                }

                if (userTotal > 21) {
                    System.out.println("You have gone over 21. You Lose!");
                    break;
                }

                else if (userTotal == 21) {
                    System.out.println("You got exactly 21. You Win!");
                    break;
                }

                else if (userTotal < 21) {

                    if (total > 21) {
                        System.out.println("Dealer has gone over 21. You Win!");
                        break;
                    }

                    else if (total == 21) {
                        System.out.println("Dealer drew another card totalling 21. You Lose!");
                        break;
                    }

                    else if (total < 21) {
                        System.out.println("Draw another? (Y/N)");
                        choice = input.next();
                    }
                }
            }
        }
            while (total <= userTotal && userTotal < 21) {
                total = total + random.nextInt(11) + 1;
                System.out.println("Dealer drew another card totalling: " + total);
            }

            if (userTotal < 21 && total < 21) {

                System.out.println("Draw another? (Y/N)");
                String choice = input.next();

                while (choice.equals("y") || choice.equals("Y")) {

                    userTotal = userTotal + (random.nextInt(11) + 1);
                    System.out.println("You drew another card totalling: " + userTotal);

                    while (total <= userTotal && userTotal < 21) {
                        total = total + random.nextInt(11) + 1;
                        System.out.println("Dealer drew another card totalling: " + total);
                    }

                    if (userTotal > 21) {
                        System.out.println("You have gone over 21. You Lose!");
                        break;
                    } else if (userTotal == 21) {
                        System.out.println("You got exactly 21. You Win!");
                        break;
                    } else if (userTotal < 21) {

                        if (total > 21) {
                            System.out.println("Dealer has gone over 21. You Win!");
                            break;
                        } else if (total == 21) {
                            System.out.println("Dealer drew another card totalling 21. You Lose!");
                            break;
                        } else if (total < 21) {
                            System.out.println("Draw another? (Y/N)");
                            choice = input.next();
                        }
                    }
                }

                while ((choice.equals("n") || choice.equals("N")) && total > userTotal) {
                    System.out.println("Dealer has greater total. You Lose!");
                    break;
                }
            }
    }
}
