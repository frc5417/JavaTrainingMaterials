public class PE2Solution {
    
    // The method for the template
    public static String solution(String name, int age){
        // Changing years to months
        int months = age * 12;

        // Combining all the variables into one String
        String sentence = "My name is " + name + " and I am " + months + " months old!";

        // Returning the sentence
        return sentence;
    }

    public static void main(String[] args) {
        // The variable with the specific name
        String finalSentence  = solution("Bob", 16);

        // Finally printing out the final sentence
        System.out.println(finalSentence);
    }

}

