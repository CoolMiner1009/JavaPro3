public class Main {
    public static void main(String[] args) {
        // Створення об'єкту класу Employee
        Employee employee = new Employee("ShevchenkoTarasGrigorovich", "Pismennyk", "Sheva@patriot.com", "+380670000001", 30);

        // Виведення даних про співробітника
        System.out.println("Full Name: " + employee.getFullName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone: " + employee.getPhone());
        System.out.println("Age: " + employee.getAge());

        // Створення об'єктів класу SameName та виклик їх методів
        com.example.package1.SameName sameName1 = new com.example.package1.SameName();
        sameName1.display();

        com.example.package2.SameName sameName2 = new com.example.package2.SameName();
        sameName2.display

