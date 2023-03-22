public class HashcodeMain {

    public static void main(String[] args) {
        // Создать класс Сотрудник (Employee) с полями:
        // Имя, Фамилия (String)
        // Название отдела (String)
        // Зарплата (double)
        // Реализовать equals и hashCode, который работает только с именем и фамилией

        Employee employee1 = new Employee("Иван", "Иванов", "снабжение", 50000);
        Employee employee2 = new Employee("Пётр", "Петров", "сбыт", 40000);
        Employee employee3 = new Employee("Иван", "Иванов", "маркетинг", 60000);
        Employee employee4 = new Employee("Алексей", "Алексеев", "бухгалтерия", 80000);


        System.out.println(employee1.equals(employee1));
        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.equals(employee3));
        System.out.println(employee1.equals(employee4));

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee3.hashCode());
        System.out.println(employee4.hashCode());
    }
}