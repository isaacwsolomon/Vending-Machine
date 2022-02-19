/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carproject;

import javax.swing.JOptionPane;

/**
 *
 * @author isaac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Corsa = 0; // Declares Corsa as a variable
        int priceC = 10000; // Gives priceC the price of £10,000

        int astra = 0; // Declares astra as a variable
        int priceA = 12500; // Gives priceA the price of £12,500

        int combo = 0; // Declares combo as a variable
        int priceCB = 14000; // Gives priceCB the price of £14,000

        int vectra = 0; // Declares vectra as a variable
        int priceV = 16500; // Gives priceV the price of £16,500

        int omega = 0; // Declares omega as a variable
        int priceO = 21000; // Gives priceO the price of £21,000

        int users = 5; // Assigns the amount of users to 5

        int i; // creates a variable for the loop

        int numCars; // Declares Number of cars as a varaible
        int totalCars; // Declares total number of cars as a varaible

        double costOfCars; // Declares cost of cars as a varaible
        double amountPayable; // Declares amount payable as a varaible
        double deliveryFee; // Declares delivery fee as a varaible
        double totalmoney = 0; // Declares total money taken in as a varaible

        double corsaProfit = 0; // Declares corsa profit as a varaible assigning it a value of 0
        double astraProfit = 0; // Declares astra profit profit as a varaible assigning it a value of 0
        double comboProfit = 0; // Declares combo profit as a varaible assigning it a value of 0
        double vectraProfit = 0; // Declares vectra profit as a varaible assigning it a value of 0
        double omegaProfit = 0; // Declares omega profit as a varaible assigning it a value of 0
        double totalProfit = 0; // Declares total profit as a varaible assigning it a value of 0
        double carSaleTotal = 0; // Declares cars sales total as a varaible assigning it a value of 0
        double averageProfit = 0; // Declares average profit as a varaible assigning it a value of 0

        for (i = 0; i < users; i++) { // Creates the loop
            String name = JOptionPane.showInputDialog("Please enter your name"); // Asks for the users name
            JOptionPane.showMessageDialog(null, "Welcome to Opel service! " + name); // Shows the user the message in a
                                                                                     // JOptionpane box
            int userInput = Integer.parseInt(
                    JOptionPane.showInputDialog("There are 5 different cars we offer:" + "\n1.Opel Corsa:€10,000"
                            + "\n2.Opel Astra:€12,500" + "\n3.Opel Combo:€14,000"
                            + "\n4.Opel Vectra:€16,500" + "\n5.Opel Omega:€21,000"
                            + "\nPlease enter the car you wish to purchase (1-5)"));// Asks the user which type of car
                                                                                    // they would like to purchase and
                                                                                    // list the options

            if (userInput == 1) { // If the user selcts 1, this section of code will run.
                numCars = Integer.parseInt(JOptionPane.showInputDialog("How many cars would you like to purchase:")); // Will
                                                                                                                      // display
                                                                                                                      // a
                                                                                                                      // box
                                                                                                                      // asking
                                                                                                                      // the
                                                                                                                      // user
                                                                                                                      // How
                                                                                                                      // many
                                                                                                                      // cars
                                                                                                                      // they
                                                                                                                      // wish
                                                                                                                      // to
                                                                                                                      // purchase
                costOfCars = priceC * numCars; // Get the cost of the cars - Multiplying the number of cars by the cost
                                               // of a corsa type car.
                carSaleTotal = carSaleTotal + costOfCars; // Total amount of money taken in by sales
                deliveryFee = costOfCars * .034; // Calculates the delivery fee
                amountPayable = deliveryFee + costOfCars; // Adds the delivery fee to cost of cars
                Corsa = Corsa + numCars; // How many corsa type cars was sold
                totalmoney = totalmoney + amountPayable; // Adds the delivery fee and the cost of cars
                JOptionPane.showMessageDialog(null, "Your choice of Car:corsa " +
                        "\nThe amount of Cars you chose: " + numCars
                        + "\nRECEIPT:The total cost of your purchase is:   € " + amountPayable); // Gives the user a
                                                                                                 // receipt of their
                                                                                                 // purchase in a
                                                                                                 // JOption box

            } else if (userInput == 2) {// If the user selcts 2, this section of code will run.
                numCars = Integer.parseInt(JOptionPane.showInputDialog("How many cars would you like to purchase:")); // Will
                                                                                                                      // display
                                                                                                                      // a
                                                                                                                      // box
                                                                                                                      // asking
                                                                                                                      // the
                                                                                                                      // user
                                                                                                                      // How
                                                                                                                      // many
                                                                                                                      // cars
                                                                                                                      // they
                                                                                                                      // wish
                                                                                                                      // to
                                                                                                                      // purchase
                costOfCars = priceA * numCars; // Get the cost of the cars - Multiplying the number of cars by the cost
                                               // of astra type cars.
                carSaleTotal = carSaleTotal + costOfCars; // Total amount of money taken in by sales
                deliveryFee = costOfCars * .04; // Calculates the delivery fee
                amountPayable = deliveryFee + costOfCars; // Adds the delivery fee to cost of ticket
                astra = astra + numCars; // How many astra type cars was sold
                totalmoney = totalmoney + amountPayable; // Adds the delivery fee and the cost of cars
                JOptionPane.showMessageDialog(null, "Your choice of car:Astra " +
                        "\nThe amount of cars you chose: " + numCars
                        + "\nRECEIPT:The total cost of your purchase is:   € " + amountPayable); // Gives the user a
                                                                                                 // receipt of their
                                                                                                 // purchase in a
                                                                                                 // JOption box

            } else if (userInput == 3) {
                numCars = Integer.parseInt(JOptionPane.showInputDialog("How many cars would you like to purchase:")); // Will
                                                                                                                      // display
                                                                                                                      // a
                                                                                                                      // box
                                                                                                                      // asking
                                                                                                                      // the
                                                                                                                      // user
                                                                                                                      // How
                                                                                                                      // many
                                                                                                                      // cars
                                                                                                                      // they
                                                                                                                      // wish
                                                                                                                      // to
                                                                                                                      // purchase
                costOfCars = priceCB * numCars; // Get the cost of the cars - Multiplying the number of cars by the cost
                                                // of combo type cars.
                carSaleTotal = carSaleTotal + costOfCars; // Total amount of money taken in by sales
                deliveryFee = costOfCars * .051; // Calculates the deliverY fee
                amountPayable = deliveryFee + costOfCars; // Adds the delivery fee to cost of ticket
                combo = combo + numCars; // How many combo type cars was sold
                totalmoney = totalmoney + amountPayable; // Adds the delivery fee and the cost of cars
                JOptionPane.showMessageDialog(null, "Your choice of car:Combo " +
                        "\nThe amount of tickets you chose: " + numCars
                        + "\nRECEIPT:The total cost of your purchase is:   Ä " + amountPayable); // Gives the user a
                                                                                                 // receipt of their
                                                                                                 // purchase in a
                                                                                                 // JOption box

            } else if (userInput == 4) {
                numCars = Integer.parseInt(JOptionPane.showInputDialog("How many cars would you like to purchase:")); // Will
                                                                                                                      // display
                                                                                                                      // a
                                                                                                                      // box
                                                                                                                      // asking
                                                                                                                      // the
                                                                                                                      // user
                                                                                                                      // How
                                                                                                                      // many
                                                                                                                      // cars
                                                                                                                      // they
                                                                                                                      // wish
                                                                                                                      // to
                                                                                                                      // purchase
                costOfCars = priceV * numCars; // Get the cost of the cars - Multiplying the number of tisckets by the
                                               // cost of vectra type cars.
                carSaleTotal = carSaleTotal + costOfCars; // Total amount of money taken in by sales
                deliveryFee = costOfCars * .056; // Calculates the delivery fee
                amountPayable = deliveryFee + costOfCars; // Adds the delivery fee to cost of ticket
                vectra = vectra + numCars; // How many vectra type cars was sold
                totalmoney = totalmoney + amountPayable; // Adds the deivery fee and the cost of tickets
                JOptionPane.showMessageDialog(null, "Your choice of car:Vectra " +
                        "\nThe amount of cars you chose: " + numCars
                        + "\nRECEIPT:The total cost of your purchase is:   € " + amountPayable); // Gives the user a
                                                                                                 // receipt of their
                                                                                                 // purchase in a
                                                                                                 // JOption box

            } else if (userInput == 5) {
                numCars = Integer.parseInt(JOptionPane.showInputDialog("How many cars would you like to purchase:")); // Will
                                                                                                                      // display
                                                                                                                      // a
                                                                                                                      // box
                                                                                                                      // asking
                                                                                                                      // the
                                                                                                                      // user
                                                                                                                      // How
                                                                                                                      // many
                                                                                                                      // cars
                                                                                                                      // they
                                                                                                                      // wish
                                                                                                                      // to
                                                                                                                      // purchase
                costOfCars = priceO * numCars; // Get the cost of the cars - Multiplying the number of cars by the cost
                                               // of omega type cars.
                carSaleTotal = carSaleTotal + costOfCars; // Total amount of money taken in by sales
                deliveryFee = costOfCars * .061; // Calculates the delivery fee
                amountPayable = deliveryFee + costOfCars; // Adds the delivery fee to cost of ticket
                omega = omega + numCars; // How many omega type cars was sold
                totalmoney = totalmoney + amountPayable; // Adds the delivery fee and the cost of tcars
                JOptionPane.showMessageDialog(null, "Your choice of car:Omega " +
                        "\nThe amount of cars you chose: " + numCars
                        + "\nRECEIPT:The total cost of your purchase is:   € " + amountPayable); // Gives the user a
                                                                                                 // receipt of their
                                                                                                 // purchase in a
                                                                                                 // JOption box

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Input"); // a code used to make sure anything written is
                                                                      // within the boundaries if the code
            }

        }

        totalCars = Corsa + astra + combo + vectra + omega; // Gives us the total amount of cars bought
        corsaProfit = Corsa * priceC * .09; // Multiplying the amount of corsa type cars entered by the price then
                                            // multiplying it by the car profit
        astraProfit = astra * priceA * .115; // Multiplying the amount of astra type cars entered by the price then
                                             // multiplying it by the car profit
        comboProfit = combo * priceCB * .123; // Multiplying the amount of combo type cars entered by the price then
                                              // multiplying it by the car profit
        vectraProfit = vectra * priceV * .128; // Multiplying the amount of vectra type cars entered by the price then
                                               // multiplying it by the car profit
        omegaProfit = omega * priceO * .131; // Multiplying the amount of omega type cars entered by the price then
                                             // multiplying it by the car profit
        totalProfit = corsaProfit + astraProfit + comboProfit + vectraProfit + omegaProfit; // Getting the total profit
                                                                                            // by adding all of the
                                                                                            // profits
        averageProfit = totalProfit / 5; // Getting the average profit by dividing the total profit by the amount of
                                         // users

        JOptionPane.showMessageDialog(null,
                "The total amount of cars sold:" + totalCars + "\nThe number of opel corsa sold:" + Corsa
                        + "\nThe number of opel astra sold:" + astra
                        + "\nThe number of opel combo sold:" + combo + "\nThe number of opel vectra sold:" + vectra
                        + "\nThe number of opel omega sold:" + omega + "\nThe total revenue taken in € :" + totalmoney
                        + "\nThe total profit generated:" + totalProfit + "\nThe average profit generated per customer:"
                        + averageProfit);
        // Displays a box at the end containing, the total amount of cars sold, the
        // number of cars sold per type of car, the total revenue for the even, the
        // total profit and the average profit
    }

}
