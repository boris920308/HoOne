public class BubbleSortExam {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("정렬 전 배열:");
        printArray(array);

        bubbleSortExam(array);

        System.out.println("버블 정렬 후 배열:");
        printArray(array);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    private static void bubbleSortExam(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0 ; i < n - 1; i++) {
            swapped = false;

            for (int j = 0 ; j < n - 1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr [j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
