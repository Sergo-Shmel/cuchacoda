//18. Квадратный корень
//Реализуйте функцию, которая находит квадратный корень числа.
//Если число отрицательное, выбрасывайте исключение.
public class Main {

    public static void sqrt(int number) {
        try{
            if(number<0){
                throw new Exception("Ошибка! Число отрицательное!");
            }
            System.out.println(Math.sqrt(number));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        sqrt(-900);
    }
}