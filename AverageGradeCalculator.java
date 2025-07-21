public class AverageGradeCalculator {
    public static void main(String[] args) {
        // Step 1: Declare and initialize variables
        double subject1 = 85.5;
        double subject2 = 90.0;
        double subject3 = 78.0;
        double average;

        // Step 2: Calculate the average grade
        average = (subject1 + subject2 + subject3) / 3;

        // Step 3: Print the average grade
        System.out.println("Average grade: " + average);

        // Step 4: Determine if the student passed or failed
        if (average >= 75) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed.");
        }
    }
}
