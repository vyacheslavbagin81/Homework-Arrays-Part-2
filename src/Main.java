public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100_001 + 100_000);
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей\n");
    }

    public static void task2() {
        System.out.println("Задача №2");
        int max = 0;
        int min = 200_000;
        int[] arr = generateRandomArray();
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей\n");
    }

    public static void task3() {
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();
        int sum = 0;
        float averageValue;
        for (int j : arr) {
            sum += j;
        }
        averageValue = sum / 30f;
        String result = String.format("%.2f", averageValue);
        System.out.println("Средняя сумма трат за месяц составила " + result + " рублей\n");
    }

    public static void task4() {
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}