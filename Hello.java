public class Hello {
    public static void main(String args[]) {
        // int a = 10;
        // int b = 3;

        // double result = 10.0 / 3;
        // System.out.println("Result: " + result);

        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b);
        // System.out.println(a % b);

        // COMPARISON OPERATORS
        // int age = 20;

        // System.out.println(age > 18); // true
        // System.out.println(age < 18); // false
        // System.out.println(age == 25); // true
        // System.out.println(age != 25); // false
        // System.out.println(age >= 18); // true
        // System.out.println(age <= 18); // false

        // if(age > 18){
        // System.out.println("You're eligible to vote.");
        // }else{
        // System.out.println("You're not eligible to vote.");
        // }

        // String day = switch (age) {
        // case 20 -> "you're eligible to vote.";
        // case 16 -> "You're not eligible to vote.";
        // case 18 -> "You're just lucky you're 18 now 😂😁";
        // default -> "Thanks but you're not good for here.";
        // };
        // System.out.println(day);

        // int age = 25;
        // boolean hasID = true;

        // boolean canVote = age >= 18 && hasID;
        // System.out.println("Eligible to vote: " + canVote);

        // WHILE LOOP.
        // int i = 1;

        // while (i <= 5) {
        // System.out.println("Hi " +i);
        // i++;
        // }

        // Task 1
        // String fullName = "Anwar Osman Basheer Turay";
        // int age = 22;
        // String country = "Sierra Leone";
        // String currentProgrammingLang = "Typescript and Java";
        // String goal = "To build scalable secure systems that impact African society";

        // System.out.println(fullName);
        // System.out.println(age);
        // System.out.println(country);
        // System.out.println(currentProgrammingLang);
        // System.out.println(goal);

        // Task 2

        // int firstNumber = 20;
        // int secondNumber = 5;

        // System.out.println(firstNumber + secondNumber);
        // System.out.println(firstNumber - secondNumber);
        // System.out.println(firstNumber * secondNumber);
        // System.out.println(firstNumber / secondNumber);
        // System.out.println(firstNumber % secondNumber);

        // Task 3
        // String studentName = "Sadat";
        // int studentID = 8028;
        // float gpa = 4.82f;
        // String enrollmentStatus = "enrolled";
        // char grade = 'A';

        // System.out.println(studentName);
        // System.out.println(studentID);
        // System.out.println(gpa);
        // System.out.println(enrollmentStatus);
        // System.out.println(grade);

        // Task 4

        // WORK DAYS CALENDAR
        // for(int i=1; i <=5 ; i++){
        // System.out.println("DAY " +i);

        // for(int j = 1; j <= 9; j++){
        // System.out.println(" " +(j+8) + " - " + (j + 9));
        // }
        // }

        // Calculator calculator = new Calculator();
        // int finalResult = calculator.addNumbers(a, b);
        // System.out.println("Result: " +finalResult);

        // NARROWING CONVERSION.
        // double price = 99.99;

        // int wholePrice = (int) price;

        // System.out.println(wholePrice);

        // long population = 10_00_00_00_00L;

        // int populationRound = (int) population;
        // System.out.println(populationRound);

        // int num = 130;

        // byte smallNum = (byte) num;

        // System.out.println(smallNum);

        // double pumpPrice = 45.00;

        // int appxPumpPrice = (int) pumpPrice;
        // System.out.println(appxPumpPrice); // this truncates the .00 from the double
        // values.

        // int a = 15;
        // int b = 4;

        // double result = a / b; // a and b are integers so java first divide to have an integer value output.
        // System.out.println(result);

        // double result = (double) a / b;
        // System.out.println(result); // 3.75 because we've widened the integer result to double.

    }
}

// class Calculator{
// public int addNumbers(int num1, int num2){
// int result = num1 + num2;
// return result;
// }
// }