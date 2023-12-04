public class PE1Solution {
    public static void main(String[] args) {

        // The letters for the Name
        String letters[] = {"N", "a", "m", "e"};

        // The variable that will hold the final name
        String name = "";

        // A for function that repeats every letter
        for(int i = 0; i < letters.length; i++){
            // Combining the letters one by one
            name = name + letters[i];
        }

        // Printing out the final name
        System.out.println("My name is " + name);
    }
}

