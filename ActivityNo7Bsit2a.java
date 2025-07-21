import java.util.Scanner;

public class ActivityNo7Bsit2a  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of students and their grades
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        int[] grades = new int[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Step 4: Call methods to display results
        System.out.println("Average grade: " + calculateAverage(grades));
        System.out.println("Highest grade: " + findHighestGrade(grades));
        System.out.println("Lowest grade: " + findLowestGrade(grades));

        scanner.close();
    }

    // Step 2: Method to calculate the average grade
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Step 3: Method to find the highest grade
    public static int findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Step 3: Method to find the lowest grade
    public static int findLowestGrade(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
