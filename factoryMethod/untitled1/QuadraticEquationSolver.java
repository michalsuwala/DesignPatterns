public class QuadraticEquationSolver {

    // Metoda rozwiązująca równanie kwadratowe
    public double[] solve(double a, double b, double c) {
        // Tablica na rozwiązania
        double[] solutions;

        // Oblicz deltę
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            // Dwa rozwiązania
            solutions = new double[2];
            solutions[0] = (-b - Math.sqrt(delta)) / (2 * a);
            solutions[1] = (-b + Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            // Jedno rozwiązanie
            solutions = new double[1];
            solutions[0] = -b / (2 * a);
        } else {
            // Brak rzeczywistych rozwiązań
            solutions = new double[0];
        }

        return solutions;
    }

    public static void main(String[] args) {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();

        // Przykładowe dane
        double a = 1;
        double b = -3;
        double c = 2;

        // Rozwiązywanie równania
        double[] solutions = solver.solve(a, b, c);

        // Wyświetlanie wyników
        if (solutions.length == 2) {
            System.out.println("Dwa rozwiązania: x1 = " + solutions[0] + ", x2 = " + solutions[1]);
        } else if (solutions.length == 1) {
            System.out.println("Jedno rozwiązanie: x = " + solutions[0]);
        } else {
            System.out.println("Brak rzeczywistych rozwiązań.");
        }
    }
}
