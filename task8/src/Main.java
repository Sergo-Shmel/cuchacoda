//8. Калькулятор возведения в степень
//Реализуйте функцию, которая возводит число в степень.
// Если степень отрицательная, выбрасывайте исключение.
public class Main {
    public static void Calculate_Pow(int number,int pow){
        try{
            if (pow < 0){
                throw new ArithmeticException("Ошибка! Степень - отрицательна!");
            }else{
                System.out.println(Math.pow(number,pow));
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Calculate_Pow(2,-1);
    }
}