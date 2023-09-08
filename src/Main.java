public class Main {
    public static void main(String[] args) {
        // Задание 1
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName;
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
        // Задание 2
        System.out.println(fullName.toUpperCase());
        // Задание 3
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}