import java.util.SortedMap;

//9. Обрезка строки
//Напишите функцию, которая принимает строку и число символов.
// Функция должна возвращать строку, обрезанную до указанного числа символов.
// Если число символов больше длины строки, выбрасывайте исключение.
public class Main {

    public static void cutting(String string, int number){
        try{
            if(string.length() < number){
                throw new Exception("Ошибка! Число символов больше длины строки!");
            }else{
                System.out.println(string.substring(0,number));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        cutting("Hello World!",13);
    }
}