/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
/**
 * this class will allow the construction of the banner which will then be
 * used in Scarecrow.java so that everything is displayed in correct order.
 */
 public class Banner {
    
    /* Message to print on Banner */
    private String message;
    private int length; 
    /* Constructor 
     * the banner will take in String m so that we are able to modify the 
     * messages. 
    */
    public Banner(String m) {
        this.message = m;
        length = this.message.length();
        
    }

   /**
    * this form of ASCII art will give us the structure that will appear ontop
    * of the scarecrow and thus fix itself according to the length of m which is the message. 
    */
    public void display() {
        System.out.println("    " + new String(new char[length+4]).replace("\0", "*"));
        System.out.println(" *** "+ new String(new char[length+2]).replace("\0", "~")+" *** ");
        System.out.println("*** ~ "+ this.message + " ~ ***");
        System.out.println(" *** "+ new String(new char[length+2]).replace("\0", "~")+" *** ");
        System.out.println("   " + new String(new char[length-1]).replace("\0", "*")+"     ***");
        System.out.println("    *******    ");

        

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}
