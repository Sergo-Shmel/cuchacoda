//2. Калькулятор деления
//Создайте функцию для деления двух чисел.
// Если делитель равен нулю, выбрасывайте
// ArithmeticException с сообщением о недопустимости деления на ноль.
public class Main {
    public static void Calculate(int first_number, int second_number) {
        try {
            if(first_number != 0 || second_number != 0){
                System.out.println(first_number/second_number);
            }
        }
        catch(ArithmeticException e) {
            System.out.println("Ошибка! Деление на ноль - недопустимо!");
        }
    }

    public static void main(String[] args) {
        Calculate(2,0);
    }
}