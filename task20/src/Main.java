//20. Проверка строки на пустоту
//Создайте функцию, которая проверяет, является ли строка пустой или null.
//Если строка пустая или равна null, выбрасывайте исключение.
public class Main {
    public static void checking_empty(String string){
        try{
            if(string == null || string.isEmpty()){
                throw new Exception("Ошибка! Строка пуста!");
            }
            System.out.println("Строка не пуста");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        checking_empty(null);
    }
}