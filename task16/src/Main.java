//16. Конкатенация строк
//Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null,
// выбрасывайте NullPointerException.
public class Main {
    public static void connect_string(String string_first, String string_second) {
        try{
            if(string_first != null && string_second != null) {
                System.out.println(string_first + string_second);
            }
            throw new NullPointerException("Ошибка! Одна из строк пуста, объединение невозможно!");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        connect_string("Hello", null);
    }
}