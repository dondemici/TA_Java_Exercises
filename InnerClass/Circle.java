package InnerClass;

import java.util.Scanner;

public class Circle {


    private int radius;

    public Circle(int radius) throws IllegalArgumentException{
        if (radius>0)
        this.radius=radius;
        else if(radius<=0){
            this.radius=radius;
            throw new IllegalArgumentException("Negative not allowed");
        }
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int radius = 0;
        int attemptsLeft = 3;  // maximum 3 attempts
        boolean validRadius = false;

        while (attemptsLeft > 0 && !validRadius) {
            try {
                System.out.println("Enter the radius (attempts left: " + attemptsLeft + "):");
                radius = s.nextInt();

                // Try to create Circle, constructor throws if invalid
                Circle c1 = new Circle(radius);

                // If no exception, input is valid
                validRadius = true;
                System.out.println("Circle created with radius: " + radius);

            } catch (IllegalArgumentException e) {
                attemptsLeft--;
                System.out.println("Must enter a positive number. Attempts left: " + attemptsLeft);
                s.nextLine();  // Clear bad input if any
            } catch (java.util.InputMismatchException e) {
                attemptsLeft--;
                System.out.println("Invalid input. Please enter an integer. Attempts left: " + attemptsLeft);
                s.nextLine();  // Clear invalid input
            }
        }

        if (!validRadius) {
            System.out.println("You have used all attempts. Try again after 24 hrs.");
        }

        s.close();
    }
}


