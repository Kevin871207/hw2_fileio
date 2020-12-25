import java.io.*;

public class Test {
    public static void main(String[] args) {
        EmployeeTable table = new EmployeeTable();
        readFile(table);

//        System.out.println(table.search("2115", COLUMN.EXTENSION));
//        System.out.println(table.findMax(CMP.HEIGHT));
//        System.out.print(table.findMin(CMP.HEIGHT));
//        table.sortBy(COLUMN.BMI);
//        System.out.println(table.removeEmployee(1, "Edward-Liaw", "6120"));

//        table.addEmployee(new Employee(176, 80, "KevisHsu", "徐翊峰", "0", "KevinHsu@transglobe.com.tw", table.totalID));
//        System.out.println(table.employees.get(table.totalID-2));
    }

    public static void readFile(EmployeeTable table) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/kevin/Desktop/123.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] st = line.split(" ");
                double height = Double.parseDouble(st[0]);
                double weight = Double.parseDouble(st[1]);
                String englishName = st[2];
                String chineseName = st[3];
                String extension = st[4];
                String email = st[5];
                int employeeID = table.totalID;
                table.addEmployee(new Employee(height, weight, englishName, chineseName, extension, email, employeeID));
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}
