package Lesson8;

public class Main {
    public static void main(String[] args) {
        String login = "mylogin";
        String password = "mypassword1";
        String confirmPassword = "mypassword1";
        try {
            boolean isValid = validateCredentials(login, password, confirmPassword);
            System.out.println(isValid);
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validateCredentials(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Неправильный логин");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Неправильный пароль");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }

}
