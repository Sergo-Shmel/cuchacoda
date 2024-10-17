//10. Поиск элемента в массиве
//Напишите функцию, которая ищет элемент в массиве.
// Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.
public class Main {

    public static void search(int[] array, int element){
        try{
            for (int i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    System.out.println("Элемент найден - " + array[i] + " позиция: " + i);
                }
            }
            throw new Exception("Ошибка! Элемент не был найден");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2};
        search(array,2);
    }
}