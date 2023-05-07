import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class cyrcles {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            System.out.println("iteration " + i);
        }
        //    for (int i = 0; (char) System.in.read() != 'S'; i++) {
        //        System.out.println("iteration" + i);
        //        if (i == 3) {
        //            break; }

        int count = 0;
        while (count < 10) {

            count++;
            if (count % 2 != 0) continue; // если число не делится на 2 то мы продолжаем (попускаем эту цифру)
            System.out.println(count);
        }
        // оператор брейк позволяет выйти из цикла при определённых усдовиях,
        // а continue вернуться к началу цикла при опред. условиях
        //разница между while и do while в том что во
        // втором случае хотя бы одна итерация цикла пройдёт обязательно
        // мы выбитаем цикл while и do while только когда не понятно какое
        // кол-во итераций надо выполнить
        // во всех остальных случаях используется цикл  for
        Random random = new Random();
        int answer = random.nextInt(); // случайное число от 0 до 9
        int count1 = 1;
        Scanner scanner = new Scanner(System.in);

        String thisString = new String();

        int guess;
        while (answer < 10) {

            System.out.println("Введите число от 0 до 9: ");
            guess = scanner.nextInt();

            if (guess == 6) {
                System.out.println("Поздравляем, вы угадали число!");

            } else if (guess > answer) {
                System.out.println("Вы ввели слишком большое число.");
            } else {
                System.out.println("Вы ввели слишком маленькое число.");
            }

            System.out.println("Конец игры.");
            break;
        }

    }
}







 //   В этом коде для генерации случайного числа используется класс Random. Для ввода числа с клавиатуры используется метод Scanner.nextInt(), который ожидает ввода целого числа с клавиатуры. После каждой итерации цикла программа сообщает, было ли число угадано, превышает оно заданное число или нет, и предлагает ввести новое число. Если число угадано, игра завершается, иначе программа предлагает ввести новое число до тех пор, пока не будет угадано правильное число или количество попыток не превысит 10. После завершения игры выводится сообщение о ее окончании.









