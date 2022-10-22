/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
/**
 * this will allow us to "draw" pants using ASCII art. It will later be 
 * accessed in the scarecrow.java file. 
 * @param no actual parameters are involved here.
 * @return nothing will be returned unless accessed which will be happening 
 * in the scarecrow.java file. 
 */
public class Pants {
    public void display() {
        System.out.println("         ---------------- ");
        System.out.println("        |       o        |");
        System.out.println("        |                |");
        System.out.println("        |       /\\       |");
        System.out.println("        |      |  |      |");
        System.out.println("        |      |  |      |");
        System.out.println("        |      |  |      |");
        System.out.println("        |      |  |      |");
        System.out.println("        |      |  |      |");
        System.out.println("         ------    ------ ");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
