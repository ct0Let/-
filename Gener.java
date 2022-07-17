public class Gener {
    SystemInfo si = new SystemInfo();
    int a = 1;  //минимальное число
    int b = 10; //максимальное число
    int count = 0; // счетчик итераций
    int gener = generatNumber(); // переменная для генерации случайного числа

     int generatNumber() { // метод для генерации случайного числа от 1 до 100
        gener = a + (int) (Math.random() * b); //генерация случайного числа
        return gener;
    }
}

