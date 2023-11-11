public class VariableTypes {
    public static void main(String[] args) {
        String variable1 = "Robotics";
        int variable2 = 1234;
        double variable3 = 6.75;
        char variable4 = 'A';
        boolean variable5 = true;
        float variable6 = 5.5678f;
        double variable7 = variable2;

        System.out.println(variable1 + "; this is a "+ String.class.getCanonicalName());
        System.out.println(variable2 + "; this is a " + int.class.getCanonicalName());
        System.out.println(variable3 + "; this is a " + double.class.getCanonicalName());
        System.out.println(variable4 + "; this is a " + char.class.getCanonicalName());
        System.out.println(variable5 + "; this is a " + boolean.class.getCanonicalName());
        System.out.println(variable6 + "; this is a " + float.class.getCanonicalName());
        System.out.println(variable7 + "; this is a " + double.class.getCanonicalName());
    }
}

