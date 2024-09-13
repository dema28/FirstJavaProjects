package employees;

public class Main {
    public static void main(String[] args) {
        // Создание сотрудников
        Employee[] employees = {
                new Worker("Alice", 5000),
                new Worker("Bob", 6000),
                new Manager("Charlie", 8000, 5),
                new Manager("David", 7500, 10),
                new Director("Eve", 12000, 20),
                new Director("Frank", 11000, 0)
        };

        // Создание массива только для менеджеров
        Manager[] managers = {
                (Manager) employees[2],
                (Manager) employees[3]
        };

        // Поиск сотрудника по имени
        Employee employeeByName = EmployeeUtils.findByName(employees, "Charlie");
        System.out.println("Employee found by name: " + (employeeByName != null ? employeeByName.getName() : "Not found"));

        // Поиск сотрудника по вхождению строки в имени
        Employee employeeByNameContains = EmployeeUtils.findByNameContains(employees, "Eve");
        System.out.println("Employee found by name contains: " + (employeeByNameContains != null ? employeeByNameContains.getName() : "Not found"));

        // Подсчет общего зарплатного бюджета
        double totalSalary = EmployeeUtils.calculateTotalSalary(employees);
        System.out.println("Total salary budget: " + totalSalary);

        // Поиск наименьшей и наибольшей зарплаты
        double minSalary = EmployeeUtils.findMinSalary(employees);
        double maxSalary = EmployeeUtils.findMaxSalary(employees);
        System.out.println("Min salary: " + minSalary);
        System.out.println("Max salary: " + maxSalary);

        // Поиск наименьшего и наибольшего количества подчиненных среди менеджеров
        int minSubordinates = EmployeeUtils.findMinSubordinates(managers);
        int maxSubordinates = EmployeeUtils.findMaxSubordinates(managers);
        System.out.println("Min subordinates: " + minSubordinates);
        System.out.println("Max subordinates: " + maxSubordinates);

        // Поиск наибольшей и наименьшей надбавки среди менеджеров
        double maxBonus = EmployeeUtils.findMaxBonus(managers);
        double minBonus = EmployeeUtils.findMinBonus(managers);
        System.out.println("Max bonus: " + maxBonus);
        System.out.println("Min bonus: " + minBonus);
    }
}

