/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    private String direction;
  
/**
 * will take in the string direction without being case sensitive
 * @param direction
 * @returns direction of boot in lowercase so that it can then be passed below
 * and in Scarecrow.java.
 */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }


    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("     |______| ");





        } else if (this.direction.equals("right")) {
          System.out.println("       |______| ");
          //System.out.println("Right boot?");
        } else {
          System.out.println("Which boot?");

        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
