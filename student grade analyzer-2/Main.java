import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeAnalyzer analyzer = new GradeAnalyzer();

        System.out.print("Enter number of students: ");
        int studentCount = readPositiveInt(scanner);

        for (int i = 0; i < studentCount; i++) {
            System.out.print("\nEnter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter number of grades: ");
            int gradeCount = readPositiveInt(scanner);
            int[] grades = new int[gradeCount];

            for (int j = 0; j < gradeCount; j++) {
                grades[j] = readGrade(scanner, j + 1);
            }

            Student student = new Student(name, grades);
            analyzer.addStudent(student);
        }

        System.out.println("\n--- Grade Report ---");
        analyzer.displayReport();

        scanner.close();
    }

    // Method to read a positive integer
    private static int readPositiveInt(Scanner scanner) {
        int num;
        while (true) {
            try {
                num = Integer.parseInt(scanner.nextLine());
                if (num > 0) break;
                System.out.print("Please enter a positive number: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
        return num;
    }

    // Method to read a grade between 0 and 100
    private static int readGrade(Scanner scanner, int index) {
        int grade;
        while (true) {
            System.out.print("Enter grade " + index + " (0-100): ");
            try {
                grade = Integer.parseInt(scanner.nextLine());
                if (grade >= 0 && grade <= 100) break;
                System.out.println("Grade must be between 0 and 100.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return grade;
    }
}
