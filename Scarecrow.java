/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
/**
 * class Scarecrow is initializing the different parts that will be used
 * to assemble the scarecrow below.
 * 
 */
class Scarecrow {
    private Pumpkin head;
        private Shirt body;
        private Pants legs;
        private Boot leftFoot;
        private Boot rightFoot;
        
    
/**
 * this will allow us to use them later on
 * @param h
 * @param s
 * @param p
 * @param l
 * @param r
 */
    public Scarecrow(Pumpkin h, Shirt s, Pants p, Boot l, Boot r) {
        head = h;
        body = s;
        legs = p;
        leftFoot = l;
        rightFoot = r;
        
        
    }


    public void display() { 
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
          
    }

    /* Main method (for testing) */
    public static void main(String[] args) {
        
        String message;
        if (args.length > 0) {
            message = args[0];
        } else {
            message = "Happy fall, everyone!";
        }
        Banner myBanner = new Banner(message);
        myBanner.display();


        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("Left"), new Boot("Right"));
        myScarecrow.display();
    }

}
