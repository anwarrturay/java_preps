package lessons;
// import java.util.ArrayList;
// import java.util.Scanner;

public class LessonTwo {

        static int addArrayNumbers(int[] arrayItSelf) {
            int sum = 0;
            // double average;

            for (int i : arrayItSelf) {
                // int lengthOfArray = arrayItSelf.length;
                // System.out.println(i);
                sum += i;
                // average = sum / lengthOfArray;
            }

            return sum;
        }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String[] students = {
        // "Anwarr",
        // "Ibrahim",
        // "Sadat",
        // "Mohamed",
        // "Abdul"
        // };

        // BASIC FOR LOOP IMPLEMENTATION.
        // for(int s = 0; s <= students.length -1; s++){
        // System.out.println(students[s]);
        // }

        // ADVANCED FOR EACH LOOP
        // for(String student : students){
        // System.out.println(student);
        // }
        // System.out.println("Enter your name: ");
        // String username = scanner.nextLine().trim();

        // ArrayList<String> users = new ArrayList<>();

        // users.add(username);

        // for(String u : users){
        // System.out.println("Users: "+u);
        // }

        // scanner.close();

        // for (int i = 1; i <= 5; i++) {

        // if (i % 2 == 0) {
        // continue;
        // }

        // System.out.println(i); // 1,3,5
        // }

        int[] numbers = { 10, 20, 30, 40, 50 };
        int result = addArrayNumbers(numbers);
        System.out.println(result);

        System.out.println("\n\n");

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\n\n");

        String[] students = {
                "Anwarr",
                "",
                "Ibrahim",
                "Sadat",
                "",
                "Mohamed"
        };

        for (String student : students) {
            if (student.isEmpty()) {
                continue;
            }
            System.out.println(student);
        }
    }
}
