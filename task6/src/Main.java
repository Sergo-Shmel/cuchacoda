//6. Факториал
//Напишите функцию, которая вычисляет факториал числа. Если число отрицательное,
// выбрасывайте исключение.
public class Main {
    public static void factorial(int num) {
        try {
            if(num >= 0){
                int result = 1;
                for (int i = 1; i <= num; i++) {
                    result *= i;
                }
                System.out.println(result);
            }else{
                throw new Exception("Ошибка! Число отрицательное!");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        factorial(-3);
    }
}