//14. Парольная проверка
//Создайте функцию для проверки сложности пароля.
// Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException.

public class Main {

    public static void checking_password_complexity(String password){
        try{
            if (password.length() < 8){
                throw new Exception("Ошибка!");
            }else{
                System.out.println("Пароль надёжен!");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        checking_password_complexity("Sefwc13213");
    }
}