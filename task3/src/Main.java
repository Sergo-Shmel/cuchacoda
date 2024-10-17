//3. Конвертер строк в числа
// Напишите функцию, которая принимает строку и пытается конвертировать её в целое число.
// Если строка не может быть конвертирована, выбрасывайте NumberFormatException.
public class Main {

    public static void convert(String string){
        try{
            System.out.println(Integer.parseInt(string));
        }catch(NumberFormatException e){
            System.out.println("Ошибка! Строка не может быть конвертирована!");
        }
    }

    public static void main(String[] args) {
        convert("Привет");
    }
}