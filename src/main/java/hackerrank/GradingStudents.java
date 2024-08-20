package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();

        for (int grade : grades) {
            int rounded = (grade / 5 + 1) * 5;

            if (rounded >= 40 && (rounded - grade) < 3) {
                roundedGrades.add(rounded);
            } else {
                roundedGrades.add(grade);
            }
        }

        return roundedGrades;
    }

    public static void main(String[] args) {
        System.out.println(gradingStudents(List.of(73, 67, 38, 33)));
    }
}
