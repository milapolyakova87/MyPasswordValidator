import java.util.Scanner;

public class MyPasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи пароль для проверки:");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Твой пароль подходит под требования");
        } else {
            System.out.println("Твой пароль не подходит по требования");
        }

        scanner.close();
    }

    // Метод для проверки пароля
    public static boolean isValidPassword(String password) {
        // Проверка на минимальную длину
        if (password.length() < 24) {
            System.out.println("Пароль должен содержать не менее 24 символов");
            return false;
        }

        // Проверка на наличие цифры
        if (!password.matches(".*\\d.*")) {
            System.out.println("Пароль должен содержать хотя бы одну цифру");
            return false;
        }

        // Проверка на наличие заглавной буквы
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Пароль должен содержать хотя бы одну заглавную букву");
            return false;
        }

        // Проверка на наличие спецсимвола
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            System.out.println("Пароль должен содержать хотя бы один спецсимвол");
            return false;
        }

        // Если все проверки пройдены
        return true;
    }
}
