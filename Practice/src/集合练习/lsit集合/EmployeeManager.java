package 集合练习.lsit集合;

import java.util.*;

public class EmployeeManager {
    //使用集合存储所有员工
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }
    //添加员工
    public boolean addEmployee(Employee employee){
        //检查员工编号是否存在
        for (Employee e:employees){
            if (e.getId().equals(employee.getId())){
                return false;//员工已存在
            }
        }
        employees.add(employee);
        return true;

    }

    //删除员工,根据id删除
    public boolean removeEmployee(String id){
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee emp=iterator.next();
            if (emp.getId().equals(id)){
                iterator.remove();
                return true;
            }
        }
        return  false;//员工不存在

    }

    //按编号查找员工
    public Employee findEmployeeById(String id){
        for (Employee e:employees){
            if (e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }

    //按姓名查找员工，会有重名的情况，重名就返回一个列表
    public List<Employee> findEmployeesByName(String name){
        //返回一个列表就要建一个List对象
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e:employees){
            if (e.getName().equals(name)){
                result.add(e);
            }
        }
        return result;
    }


    //筛选技术员工 同上
    public List<TechnicalEmployee> getTechnicalEmployees(){
        List<TechnicalEmployee> techEmployees = new ArrayList<>();
        for (Employee emp : techEmployees) {
            if (emp instanceof  TechnicalEmployee){
                techEmployees.add((TechnicalEmployee) emp);
            }
        }
        return techEmployees;


    }

    //筛选管理员工
    public List<ManagerEmployee>getManagerEmployee(){
        List<ManagerEmployee> managerEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp instanceof ManagerEmployee) {
                managerEmployees.add((ManagerEmployee) emp);

            }
        }
        return managerEmployees;
    }

    //按年龄排序
    public void sortEmployeesByAge(){
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
    }

    //获取所有员工


    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);//返回副本,避免外部修改
    }
    //获取员工数量
    public int getEmployeeCount(){
        return  employees.size();
    }
}
