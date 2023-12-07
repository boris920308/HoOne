public class FactorialExam {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("n = " + n +", result = " + factorialExam(n));
    }

    private static int factorialExam(int n) {
        if (n < 0) {
            throw new RuntimeException("err, n > 0");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialExam(n - 1);
        }
    }
}
