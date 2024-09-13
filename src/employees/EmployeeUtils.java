package employees;

public class EmployeeUtils {

    public static Employee findByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public static Employee findByNameContains(Employee[] employees, String substring) {
        for (Employee employee : employees) {
            if (employee.getName().contains(substring)) {
                return employee;
            }
        }
        return null;
    }

    public static double calculateTotalSalary(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    public static double findMinSalary(Employee[] employees) {
        if (employees.length == 0) {
            return 0;
        }
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public static double findMaxSalary(Employee[] employees) {
        if (employees.length == 0) {
            return 0;
        }
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static int findMinSubordinates(Manager[] managers) {
        if (managers.length == 0) {
            return 0;
        }
        int minSubordinates = managers[0].getNumberOfSubordinates();
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < minSubordinates) {
                minSubordinates = manager.getNumberOfSubordinates();
            }
        }
        return minSubordinates;
    }

    public static int findMaxSubordinates(Manager[] managers) {
        if (managers.length == 0) {
            return 0;
        }
        int maxSubordinates = managers[0].getNumberOfSubordinates();
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > maxSubordinates) {
                maxSubordinates = manager.getNumberOfSubordinates();
            }
        }
        return maxSubordinates;
    }

    public static double findMaxBonus(Manager[] managers) {
        if (managers.length == 0) {
            return 0;
        }
        double maxBonus = managers[0].getSalary() - managers[0].getBaseSalary();
        for (Manager manager : managers) {
            double bonus = manager.getSalary() - manager.getBaseSalary();
            if (bonus > maxBonus) {
                maxBonus = bonus;
            }
        }
        return maxBonus;
    }

    public static double findMinBonus(Manager[] managers) {
        if (managers.length == 0) {
            return 0;
        }
        double minBonus = managers[0].getSalary() - managers[0].getBaseSalary();
        for (Manager manager : managers) {
            double bonus = manager.getSalary() - manager.getBaseSalary();
            if (bonus < minBonus) {
                minBonus = bonus;
            }
        }
        return minBonus;
    }
}

