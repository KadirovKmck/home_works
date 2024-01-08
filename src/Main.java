public class Main {
    public static void main(String[] args) {
        double[] numbers = {8, -2, -4, 2, 3, 6, -7, 1.5, 4.2, -0.5, 9.8, -3.5, 7.1, -6.2, 5.4};

        boolean foundNegative = false;

        double sum = 0;
        int count = 0;

        for (double number : numbers) {
            if (foundNegative) {
                if (number > 0) {
                    sum += number;
                    count++;
                }
            } else {
                if (number < 0) {
                    foundNegative = true;
                }
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Нет положительных чисел после первого отрицательного.");
        }
    }
    
}
