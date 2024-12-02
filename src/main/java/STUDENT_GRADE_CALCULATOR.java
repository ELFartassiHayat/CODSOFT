import java.util.Scanner;

public class STUDENT_GRADE_CALCULATOR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur le nombre de matières
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Tableau pour stocker les notes
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Saisie des notes pour chaque matière
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();

            // Validation de l'entrée
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks! Please enter marks for subject " + (i + 1) + " (0-100): ");
                marks[i] = scanner.nextInt();
            }

            totalMarks += marks[i];
        }

        // Calcul du pourcentage moyen
        double averagePercentage = (double) totalMarks / numSubjects;

        // Détermination de la note
        String grade;
        if (averagePercentage >= 90) {
            grade = "Excellent";
        } else if (averagePercentage >= 80) {
            grade = "Very Good";
        } else if (averagePercentage >= 70) {
            grade = "Good";
        } else if (averagePercentage >= 60) {
            grade = "Satisfactory";
        } else {
            grade = "Fail";
        }

        // Affichage des résultats
        System.out.println("\n----- Results -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
