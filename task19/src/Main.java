//19. Конвертер температуры
//Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт.
//Если температура меньше абсолютного нуля, выбрасывайте исключение.
public class Main {
    public static void converter_temp(double temp){
        try{
            double zero = -273.15;
            if(temp < zero ){
                throw new Exception("Ошибка! Температура меньше чем абсолютный ноль!");
            }
            System.out.println((temp*9/5)+32+" F");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        converter_temp(37);
    }
}