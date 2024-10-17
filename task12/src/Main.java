//12. Проверка делимости
//Реализуйте функцию, которая принимает два числа и проверяет,
// делится ли первое число на второе. Если второе число равно нулю, выбрасывайте ArithmeticException.
public class Main {

    public static void check(int first_number,int second_number){
        try{
            if (first_number % second_number == 0){
                System.out.println("Делится!");
            }else{
                System.out.println("Не делится!");
            }
        }catch (ArithmeticException e){
            System.out.println("Ошибка!");
        }
    }
    public static void main(String[] args) {
        check(2,3);
    }
}