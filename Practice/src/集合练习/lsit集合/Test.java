package 集合练习.lsit集合;

import java.util.List;
/*
* 设计一个员工管理类EmployeeManager，包含以下功能：
使用集合存储所有员工
支持添加员工、删除员工、查找员工
支持按不同类型筛选员工
支持对员工列表进行排序
实现以下具体功能：
添加员工时，如果员工编号已存在，则提示"员工已存在"
删除员工时，根据员工编号删除，如果不存在则提示"员工不存在"
查找员工时，支持按编号查找和按姓名查找
筛选功能：可以筛选出所有技术员工或所有管理员工
排序功能：可以按年龄对员工进行排序
编写测试类，模拟以下场景：
添加不同类型员工
测试添加重复编号的员工
测试删除不存在的员工
测试查找功能
测试筛选和排序功能*/
public class Test {
    public static void main(String[] args) {
        //创建员工管理对象
        EmployeeManager manager = new EmployeeManager();

        System.out.println("-----员工管理系统-----");

        //测试添加员工
        System.out.println("1.添加员工:");
        //有参构造直接创建
        TechnicalEmployee emp1 = new TechnicalEmployee("001", "张三", 25, 3);
        ManagerEmployee emp2 = new ManagerEmployee("002", "李四", 30, "高级");
        TechnicalEmployee emp3 = new TechnicalEmployee("003", "王五", 28, 2);
        if (manager.addEmployee(emp1)) {
            System.out.println("添加员工成功：" + emp1.getName());
        } else {
            System.out.println("添加员工失败：员工编号" + emp1.getId() + "已存在");
        }

        if (manager.addEmployee(emp2)) {
            System.out.println("添加员工成功：" + emp2.getName());
        } else {
            System.out.println("添加员工失败：员工编号" + emp2.getId() + "已存在");
        }

        if (manager.addEmployee(emp3)) {
            System.out.println("添加员工成功：" + emp3.getName());
        } else {
            System.out.println("添加员工失败：员工编号" + emp3.getId() + "已存在");
        }// 测试添加重复编号的员工
        System.out.println("\n2. 测试添加重复编号员工：");
        TechnicalEmployee emp4 = new TechnicalEmployee("001", "赵六", 35, 4);
        if (manager.addEmployee(emp4)) {
            System.out.println("添加员工成功：" + emp4.getName());
        } else {
            System.out.println("添加员工失败：员工编号" + emp4.getId() + "已存在");
        }

        // 测试查找员工
        System.out.println("\n3. 测试查找员工：");
        Employee foundEmp = manager.findEmployeeById("001");
        if (foundEmp != null) {
            System.out.println("查找员工001：" + foundEmp);
        } else {
            System.out.println("员工001不存在");
        }

        // 测试按姓名查找
        List<Employee> zhangEmployees = manager.findEmployeesByName("张三");
        System.out.println("按姓名查找'张三'，找到" + zhangEmployees.size() + "个员工");

        // 测试筛选功能
        System.out.println("\n4. 测试筛选功能：");
        List<TechnicalEmployee> techEmployees = manager.getTechnicalEmployees();
        System.out.print("所有技术员工：");
        for (int i = 0; i < techEmployees.size(); i++) {
            System.out.print(techEmployees.get(i).getName());
            if (i < techEmployees.size() - 1) {
                System.out.print("、");
            }
        }
        System.out.println();

        List<ManagerEmployee> managerEmployees = manager.getManagerEmployee();
        System.out.print("所有管理员工：");
        for (int i = 0; i < managerEmployees.size(); i++) {
            System.out.print(managerEmployees.get(i).getName());
            if (i < managerEmployees.size() - 1) {
                System.out.print("、");
            }
        }
        System.out.println();

        // 测试排序功能
        System.out.println("\n5. 测试排序功能：");
        manager.sortEmployeesByAge();
        List<Employee> sortedEmployees = manager.getAllEmployees();
        System.out.print("按年龄排序：");
        for (int i = 0; i < sortedEmployees.size(); i++) {
            Employee emp = sortedEmployees.get(i);
            System.out.print(emp.getName() + "(" + emp.getAge() + ")");
            if (i < sortedEmployees.size() - 1) {
                System.out.print("、");
            }
        }
        System.out.println();

        // 测试删除功能
        System.out.println("\n6. 测试删除功能：");
        if (manager.removeEmployee("002")) {
            System.out.println("删除员工002成功");
        } else {
            System.out.println("删除员工002失败：员工不存在");
        }

        // 测试删除不存在的员工
        if (manager.removeEmployee("999")) {
            System.out.println("删除员工999成功");
        } else {
            System.out.println("删除员工999失败：员工不存在");
        }

        // 显示最终员工列表
        System.out.println("\n7. 最终员工列表：");
        List<Employee> allEmployees = manager.getAllEmployees();
        for (Employee emp : allEmployees) {
            System.out.println(emp);
        }

        System.out.println("\n员工总数：" + manager.getEmployeeCount());
    }
    }

