package Material;

public class PE3Solution1 {
    public static void yearFinder(int months) {
        int years = 0;
        while (months >= 12) {
            years += 1;
            months -= 12;
        }

        int age = 2023 - years;

        System.out.println(age);
    }
}

