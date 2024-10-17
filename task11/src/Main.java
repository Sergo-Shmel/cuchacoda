//11. Конвертация в двоичную систему
//Создайте функцию, которая конвертирует целое число в двоичную строку.
// Если число отрицательное, выбрасывайте исключение.
public class Main {

    public static void convert(int number){
        try{
            if(number<0){
                throw new Exception("Ошибка! Число отрицательно!");
            }else{
                System.out.println(Integer.toBinaryString(number));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        convert(23);
    }
}