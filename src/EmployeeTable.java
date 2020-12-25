import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeTable {

    public EmployeeTable() {
        employees = new ArrayList<>();
    }

    public ArrayList<Employee> employees;

    public ArrayList<Employee> search(String query, COLUMN column) {
        ArrayList<Employee> res = new ArrayList<>();
        for (Employee e : employees)
            switch (column) {
                case ID:
                    if (query.equals(String.valueOf(e.id))) res.add(e);
                    break;
                case ENGLISH_NAME:
                    if (query.equals(e.englishName)) res.add(e);
                    break;
                case CHINESE_NAME:
                    if (query.equals(e.chineseName)) res.add(e);
                    break;
                case EXTENSION:
                    if (query.equals(e.extension)) res.add(e);
                    break;
                case EMAIL:
                    if (query.equals(e.email)) res.add(e);
                    break;
                default:
                    break;
            }
        return res;
    }

    public void sortBy(COLUMN column) {
        switch (column) {
            case ID:
            default:
                employees.sort(CMP.ID);
                break;
            case ENGLISH_NAME:
                employees.sort(CMP.ENG);
                break;
            case EXTENSION:
                employees.sort(CMP.EXT);
                break;
            case EMAIL:
                employees.sort(CMP.EMAIL);
                break;
            case BMI:
                employees.sort(CMP.BMI);
                break;
            case HEIGHT:
                employees.sort(CMP.HEIGHT);
                break;
            case WEIGHT:
                employees.sort(CMP.WEIGHT);
                break;
        }
    }

    public int addEmployee(Employee employee) {
        if (!(employee.weight < 0 || employee.height < 0)) {
            employees.add(employee);
        }
        return employees.size();
    }

    public int removeEmployee(int id, String engName, String ext) {
        for (Employee e : employees) {
            if (e.id == id && e.englishName.equals(engName) && e.extension.equals(ext)) {
                employees.remove(e);
            }
        }
        return employees.size();
    }

    public Employee findMin(Comparator cmp) {
        ArrayList<Employee> res = new ArrayList<>(employees);
        res.sort(cmp);
        return res.get(0);
    }

    public Employee findMax(Comparator cmp) {
        ArrayList<Employee> res = new ArrayList<>(employees);
        res.sort(cmp.reversed());
        return res.get(0);
    }
}
