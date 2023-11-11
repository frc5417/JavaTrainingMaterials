public class Condionals {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        // A regular if statement
        if( x < y ) {
            System.out.println( "3 is less than 5" );
        }

        // A if-else statement
        if ( x == y ){
            System.out.println("Wait what, 3 is equal to 5?");
        } else {
            System.out.println("3 is not equal to 5");

            // A nested if statement 
            if ( (x * y) == 15) {
                System.out.println("3 x 5 is equal to 15");
            }
        }

        // A switch case operator
        switch (x) {
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3:
                System.out.println("x is equal to 3");
                break;
            case 4:
                System.out.println("x is equal to 4");
                break;
            case 5:
                System.out.println("x is equal to 5");
                break;
            case 6:
                System.out.println("x is equal to 6");
                break;
        }

        // A switch case operator without breaks
        switch (x) {
            case 3:
                System.out.println("x is equal to 3");
                x += 1;
            case 4:
                System.out.println("x is now equal to 4");
                x += 1;
            case 5:
                System.out.println("x is now equal to 5");
                x += 1;
            case 6:
                System.out.println("x is now equal to 6");
                x += 1;
            case 7:
                System.out.println("x is now equal to 7");
                break;
        }
    }
}
