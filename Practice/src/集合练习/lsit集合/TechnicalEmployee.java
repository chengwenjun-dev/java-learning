package 集合练习.lsit集合;

public class TechnicalEmployee extends Employee{
    private int techLevel;

    public TechnicalEmployee(String id, String name, int age, int techLevel) {
        super(id, name, age);
        this.techLevel = techLevel;
    }

    @Override
    public String toString() {
        return "TechnicalEmployee{" +
                "techLevel=" + techLevel +
                '}';
    }

    public int getTechLevel() {
        return techLevel;
    }

    public void setTechLevel(int techLevel) {
        this.techLevel = techLevel;
    }

    public TechnicalEmployee() {

    }
}
