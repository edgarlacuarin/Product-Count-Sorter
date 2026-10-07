/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacuarinefruitpricesorter;

/**
 *
 * @author User
 */
public class TestClass {

    public static void main(String[] args) {

        Fruit[] fruits = {new Fruit("F001", "Apple", 85.50),
            new Fruit("F002", "Banana", 45.00),
            new Fruit("F003", "Mango", 75.25),
            new Fruit("F004", "Orange", 60.00),
            new Fruit("F005", "Grapes", 120.50),
            new Fruit("F006", "Papaya", 55.75),
            new Fruit("F007", "Watermelon", 90.00),
            new Fruit("F008", "Pineapple", 110.25)
        };

        // Display fruits before sorting
        System.out.println("===== FRUITS BEFORE SORTING =====");
        displayFruits(fruits);
        SortingAlgorithm.bubbleSort(fruits);

        System.out.println("\n===== FRUITS AFTER SORTING =====");
        displayFruits(fruits);

        System.out.println("\n===== TOP 3 CHEAPEST FRUITS =====");

        for (int i = 0; i < 3; i++) {
            System.out.printf(
                "%d. %s - %.2f%n",
                i + 1,
                fruits[i].name,
                fruits[i].price
            );
        }
    }

    public static void displayFruits(Fruit[] fruits) {

        System.out.printf("%-10s %-15s %s%n",
                "Fruit ID", "Name", "Price");

        System.out.println("------------------------------------------");

        for (Fruit fruit : fruits) {
            fruit.display();
        }
    }
}
