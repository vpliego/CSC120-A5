/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
/**
 * class Shirt will allow us to draw our ASCII art for the shirt portion
 * of the scarecrow. It will be called in the Scarecrow.java file. 
 */
 public class Shirt {

    
    public void display() {
        System.out.println("      ~~~~~~~~~~~~~~~~~~~~~   ");
        System.out.println("    /                       \\");
        System.out.println("   /      |           |      \\");
        System.out.println("   ______/|           |\\______");
        System.out.println("  /  /    |           |   \\  \\");
        System.out.println(" /  /      ~~~~~~~~~~~     \\  \\ ");
        System.out.println(" www       \\    o    /      www ");

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
