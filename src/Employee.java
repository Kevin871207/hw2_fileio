
public class Employee {
    double height;
    double weight;
    String englishName;
    String chineseName;
    String extension;
    String email;
    int id;
    double bmi;

    public Employee(double height, double weight, String englishName, String chineseName, String extension, String email, int id) {
        this.height = height;
        this.weight = weight;
        this.englishName = englishName;
        this.chineseName = chineseName;
        this.extension = extension;
        this.email = email;
        this.id = id;
        countBMI();
    }

    public void countBMI() {
        double heightMeter = this.height / 100;
        this.bmi = Math.round(this.weight / (heightMeter * heightMeter));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "height=" + height +
                ", weight=" + weight +
                ", englishName='" + englishName + '\'' +
                ", chineseName='" + chineseName + '\'' +
                ", extension='" + extension + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", bmi=" + bmi +
                '}';
    }
}
