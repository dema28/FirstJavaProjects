package employees;

public class Director extends Manager {
    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        }
        return getBaseSalary() * (1 + (getNumberOfSubordinates() / 100.0 * 9));
    }
}

