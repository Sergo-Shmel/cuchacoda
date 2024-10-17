//7. Проверка массива на нули
//Создайте функцию, которая проверяет массив на наличие нулей.
// Если в массиве есть нули, выбрасывайте исключение.
public class Main {
    public static void check_zero(int[] array){
        try{
            for(int i=0;i<array.length;i++){
                if (array[i]==0){
                    throw new Exception("Ошибка! В массиве есть 0");
                }
            }
            System.out.println("Успешно!");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,2,4};
        check_zero(array);
    }
}