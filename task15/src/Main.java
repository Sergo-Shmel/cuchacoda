//15. Проверка даты
//Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy".
// Если формат неверен, выбрасывайте DateTimeParseException.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main{

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static boolean isValidDate(String dateString) throws DateTimeParseException {
        try {
            LocalDate.parse(dateString, DATE_FORMATTER);
            return true;
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Неверный формат даты: " + dateString, dateString, 0, e);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(isValidDate("31.12.2023")); // true
            System.out.println(isValidDate("32.12.2023")); // Выбросит исключение
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
        }
    }
}