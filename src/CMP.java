import java.util.Comparator;

public class CMP {
    public static Comparator<Employee> ID = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Integer.compare(o1.id, o2.id);
        }
    };

    public static Comparator<Employee> HEIGHT = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o1.height, o2.height);
        }
    };

    public static Comparator<Employee> WEIGHT = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o1.weight, o2.weight);
        }
    };

    public static Comparator<Employee> ENG = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.englishName.compareTo(o2.englishName);
        }
    };

    public static Comparator<Employee> EXT = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.extension.compareTo(o2.extension);
        }
    };

    public static Comparator<Employee> EMAIL = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.email.compareTo(o2.email);
        }
    };

    public static Comparator<Employee> BMI = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o1.bmi, o2.bmi);
        }
    };
}
