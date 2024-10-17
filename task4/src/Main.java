//Проверка возраста
//Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException,
// если возраст меньше нуля или больше 150.
public class Main {

    public static void age(int age) {
        try{
            if (age >= 0 && age <= 150) {
                System.out.println("Отлично!");
            }else{
                throw new IllegalArgumentException("Ошибка!");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        age(-1);
    }
}