package grading;

import enrollments.Enrollment;

import java.util.List;

public class GradeBook {
    private static final double A = 4.0;
    private static final double B = 3.0;
    private static final double C = 2.0;
    private static final double D = 1.0;
    private static final double F = 0.0;

    public static double pointsFor(String letter) {
        if (letter.equalsIgnoreCase("A")) return A;
        else if (letter.equalsIgnoreCase("B")) return B;
        else if (letter.equalsIgnoreCase("C")) return C;
        else if (letter.equalsIgnoreCase("D")) return D;
        else if (letter.equalsIgnoreCase("F")) return F;
        else return 0.0;
    }

    public static double calculateGPA(List<Enrollment> enrollments) {
        double totalPoints = 0;
        int count = 0;
        for (Enrollment e : enrollments) {
            String grade = e.getGrade();
            if (!"N/A".equals(grade)) {
                totalPoints += pointsFor(grade);
                count++;
            }
        }
        return count > 0 ? totalPoints / count : 0.0;
    }

}
