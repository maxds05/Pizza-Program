package sample;

// Imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // Variables
        String fullName;
        String sizeChoice;
        String topChoice;
        String topChoice2;
        String addTop;
        String addTopChoice = "No additional toppings";
        String allTop = null;
        int numTops = 0;
        double freeTops = 0.00;
        double topCost1;
        double topCost2;
        double addTopCost = 0.00;
        double totalCost;
        double cost = 0.00; //floating point

        // Welcome message
        System.out.println("~ Welcome to the pizza website ~");

        // Asks for name
        System.out.println("Enter you full name: ");
        fullName = scanner.nextLine();

        // Size
        while (true) {
            // Asks for pizza size
            System.out.println("Our pizza base sizes are; small, medium & large, which size would you like?: ");
            sizeChoice = scanner.nextLine();

            if (sizeChoice.equalsIgnoreCase("Small")) {
                cost = 7.99;
                break;
            } else if (sizeChoice.equalsIgnoreCase("Medium")) {
                cost = 10.99;
                break;
            } else if (sizeChoice.equalsIgnoreCase("Large")) {
                cost = 13.99;
                break;
            } else {
                System.out.println("Incorrect input, please enter small, medium or large");
            }
        }

        // Toppings messages
        System.out.println("Now you can choose 2 free toppings and any additional toppings will be their original price!");
        System.out.println("Here's a list of our available toppings: \n No topping           Free \n A Thousand Pounds    £1000" +
                "\n Extra cheese         £1.25 \n Pepperoni            £1.25 \n Ham                  £1.25 \n Chicken              £1.25 \n Sweetcorn            £1.25 \n Pineapple            £1.25");

        // Topping 1
        while (true) {
            // Asks for toppings
            System.out.println("Choose your first topping: ");
            topChoice = scanner.nextLine();


            if (topChoice.equalsIgnoreCase("Extra cheese")
                    || topChoice.equalsIgnoreCase ("Pepperoni")
                    || topChoice.equalsIgnoreCase ("Ham")
                    || topChoice.equalsIgnoreCase ("Chicken")
                    || topChoice.equalsIgnoreCase ("Sweetcorn")
                    || topChoice.equalsIgnoreCase("Pineapple")) {
                topCost1 = 1.25;
                numTops = numTops + 1;
                break;
            } else if (topChoice.equalsIgnoreCase("No topping")
                    || topChoice.equalsIgnoreCase("None")) {
                topCost1 = 0.00;
                break;
            } else if (topChoice.equalsIgnoreCase("a thousand pounds")) {
                topCost1 = 1000.00;
                numTops = numTops + 1;
                break;
            } else {
                System.out.println("Incorrect input, please enter a topping we offer");
            }
        }

        // Toppings 2
        while (true) {
            // Asks for toppings
            System.out.println("Choose your second topping: ");
            topChoice2 = scanner.nextLine();

            if (topChoice2.equalsIgnoreCase("Extra cheese")
                    || topChoice2.equalsIgnoreCase ("Pepperoni")
                    || topChoice2.equalsIgnoreCase ("Ham")
                    || topChoice2.equalsIgnoreCase ("Chicken")
                    || topChoice2.equalsIgnoreCase ("Sweetcorn")
                    || topChoice2.equalsIgnoreCase("Pineapple")) {
                topCost2 = 1.25;
                numTops = numTops + 1;
                break;
            } else if (topChoice2.equalsIgnoreCase("No topping")
                    || topChoice2.equalsIgnoreCase("None")) {
                topCost2 = 0.00;
                break;
            } else if (topChoice2.equalsIgnoreCase("a thousand pounds")) {
                topCost2 = 1000.00;
                numTops = numTops + 1;
                break;
            } else {
                System.out.println("Incorrect input, please enter a topping we offer");
            }


        }

        // Total cost of free toppings
        boolean b = freeTops == (topCost1 + topCost2) * 0;
        System.out.println("The price for your toppings is currently £ " + freeTops);

        // Additional toppings
        while (true) {
            System.out.println("Would you like any additional toppings? (Y/N): ");
            addTop = scanner.nextLine();
            if (addTop.equalsIgnoreCase("N")) {
                break;
            }

            else if (addTop.equalsIgnoreCase("Y")) {
                System.out.println("Choose an additional topping: ");
                addTopChoice = scanner.nextLine();


                allTop += " " + addTopChoice;

                if (addTopChoice.equalsIgnoreCase("Extra cheese")
                        || addTopChoice.equalsIgnoreCase ("Pepperoni")
                        || addTopChoice.equalsIgnoreCase ("Ham")
                        || addTopChoice.equalsIgnoreCase ("Chicken")
                        || addTopChoice.equalsIgnoreCase ("Sweetcorn")
                        || addTopChoice.equalsIgnoreCase("Pineapple")) {
                    addTopCost = 1.25;
                    numTops = numTops + 1;
                    break;
                } else if (addTopChoice.equalsIgnoreCase("a thousand pounds")) {
                    addTopCost = 1000.00;
                    numTops = numTops + 1;
                    break;
                } else {
                    System.out.println("Incorrect input, please enter a topping we offer");
                }

            }
        }


        // If the user has chosen 2 or less toppings, topping price will be free
        System.out.println(numTops);
        if (numTops <= 2) {
            boolean c = freeTops == (topCost1 + topCost2 + addTopCost) * 0;
        }

        totalCost = addTopCost + cost;


        System.out.println("Here are your order details: ");
        System.out.println("");
        System.out.println("~ " + fullName + " ~");
        System.out.println("");
        System.out.println("You have ordered a " + sizeChoice + " pizza with: \n  - " + topChoice + "\n  - " + topChoice2 + "\n  - " + addTopChoice + "\n\nPrice: £" + totalCost);
    }
}
