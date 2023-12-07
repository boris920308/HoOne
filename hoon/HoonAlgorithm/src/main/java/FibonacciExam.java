public class FibonacciExam {

    public static void main(String[] args) {

        int n = 7;

        System.out.println("n = " + n +", result = " + fibonacci(n));
    }


    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
