public class PE1Solution {
    public static void main(String[] args) {
        String letters[] = {"N", "a", "m", "e"};
        String name = "";

        for(int i = 0; i < letters.length; i++){
            name = name + letters[i];
        }

        System.out.println("My name is " + name);
    }
}

