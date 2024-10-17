//1. Функция для нахождения максимума
//Напишите функцию, которая принимает два числа и возвращает максимальное из них.
// Если числа равны, выбрасывайте исключение с сообщением об ошибке.
public class Main {
    public static void maximum(int first_num, int second_num) {
        try{
            if (first_num > second_num) {
                System.out.println(first_num);
            } else if (first_num < second_num) {
                System.out.println(second_num);
            } else{
               throw new Exception("Ошибка! Числа равны");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        maximum(2,2);
    }
}