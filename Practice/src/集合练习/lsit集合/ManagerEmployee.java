package 集合练习.lsit集合;

public class ManagerEmployee extends Employee{
private String manageLevel;

    public ManagerEmployee(String id, String name, int age, String manageLevel) {
        super(id, name, age);
        this.manageLevel = manageLevel;
    }

    @Override
    public String toString() {
        return "ManagerEmployee{" +
                "manageLevel='" + manageLevel + '\'' +
                '}';
    }

    public String getManageLevel() {
        return manageLevel;
    }

    public void setManageLevel(String manageLevel) {
        this.manageLevel = manageLevel;
    }

    public ManagerEmployee() {
    }
}
