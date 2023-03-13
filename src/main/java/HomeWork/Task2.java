package HomeWork;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Alla"));
    }

    public static boolean isPalindrome(String text) {       // Метод является ли строка палиндромом
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }


}

