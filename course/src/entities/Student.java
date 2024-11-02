package entities;

public class Student {
    public String name;
    public double a;
    public double b;
    public double c;

    public double calculateAverage() {
        return a + b + c;
    }


    public String toString() {
        double finalGrade = calculateAverage();
        String result = String.format("FINAL GRADE = %.2f%n", finalGrade);

        if (finalGrade >= 60) {
            result += "PASS";
        } else {
            result += "FAILED\n";
            double missingPoints = 60 - finalGrade;
            result += String.format("MISSING = %.2f POINTS", missingPoints);
        }

        return result;
    }
}