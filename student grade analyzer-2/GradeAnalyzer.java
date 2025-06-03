import java.util.ArrayList;
import java.util.List;

public class GradeAnalyzer {
    private List<Student> students;

    public GradeAnalyzer() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayReport() {
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            System.out.print("Grades: ");
            for (int grade : student.getGrades()) {
                System.out.print(grade + " ");
            }
            System.out.printf("\nAverage: %.2f\n", student.getAverageGrade());
            System.out.println("Highest: " + student.getHighestGrade());
            System.out.println("Lowest: " + student.getLowestGrade());
            System.out.println("Letter Grade: " + student.getLetterGrade());
            System.out.println("---------------------------");
        }
    }
}
