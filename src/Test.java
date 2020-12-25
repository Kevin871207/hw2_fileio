import java.io.*;

public class Test {
    public static void main(String[] args) {
        EmployeeTable table = new EmployeeTable();
        int id = 1;
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
                int employeeID = id;
                id++;
                table.addEmployee(new Employee(height, weight, englishName, chineseName, extension, email, employeeID));
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.print(table.findMin(CMP.HEIGHT));
        System.out.println(table.search("2115", COLUMN.EXTENSION));
    }

}
