import java.util.ArrayList;
//13. Чтение элемента списка
//Напишите функцию, которая возвращает элемент списка по индексу.
// Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.
public class Main {
    public static void return_element(ArrayList<String> array,int number_of_element){
        try{
            System.out.println(array.get(number_of_element-1));
        }catch(IndexOutOfBoundsException e){
            System.out.println("Ошибка! Индекс выходит за пределы списка!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        return_element(list,4);
    }
}