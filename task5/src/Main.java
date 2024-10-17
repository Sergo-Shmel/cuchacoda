//5. Нахождение корня
//Реализуйте функцию, которая находит корень из числа. Если число отрицательное,
// выбрасывайте IllegalArgumentException.
public class Main {

    public static void sqrt(int number){
        try{
            if (number > 0){
                System.out.println(Math.sqrt(number));
            }else{
                throw new IllegalArgumentException("Ошибка! Число отрицательно");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        sqrt(-2);
    }
}