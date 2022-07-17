import java.util.Scanner;

public class RollThedIce  {
    public static void main(String[] args)  {
        Scanner src = new Scanner(System.in);
        Gener one = new Gener();
        while (true) {
            int input = src.nextInt();
            if (input < one.gener) {
                one.count++;
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
                System.out.println("Попытка №:" + one.count);
            } else if (input > one.gener) {
                one.count++;
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
                System.out.println("Попытка №:" + one.count);
            } else {
                one.count++;
                System.out.println(input);
                System.out.println("Угадал, Попытка №:" + one.count);
                System.exit(0) ;
            }
        }
    }
}




