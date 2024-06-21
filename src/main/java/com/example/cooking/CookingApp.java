package com.example.cooking;

import java.util.Scanner;

public class CookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Cooking App!");
        
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Add a recipe");
            System.out.println("2. View recipes");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addRecipe(scanner);
                    break;
                case 2:
                    viewRecipes();
                    break;
                case 3:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addRecipe(Scanner scanner) {
        System.out.println("Enter the recipe name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter the ingredients (comma-separated):");
        String ingredients = scanner.nextLine();
        
        System.out.println("Enter the instructions:");
        String instructions = scanner.nextLine();
        
        System.out.printf("Recipe added: %s\nIngredients: %s\nInstructions: %s\n", name, ingredients, instructions);
    }

    private static void viewRecipes() {
        // Placeholder for viewing recipes logic
        System.out.println("Displaying all recipes...");
        // Actual implementation should retrieve and display stored recipes
    }
}
