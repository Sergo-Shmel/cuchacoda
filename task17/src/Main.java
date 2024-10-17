//17. Остаток от деления
//Создайте функцию, которая возвращает остаток от деления двух чисел.
// Если второе число равно нулю, выбрасывайте исключение.
public class Main {
    public static void ost(int first_number,int second_number){
        try{
            if(second_number == 0){
                throw new Exception("Ошибка! Второе число равно 0!");
            }
            System.out.println(first_number % second_number);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ost(7,0);
    }
}