package 集合练习.set集合;

import java.util.Comparator;
import java.util.TreeSet;

/*
* 定义一个 Student 类：

id
name
score
要求：

创建 TreeSet<Student>
排序规则：
按 成绩降序
如果成绩相同，按 姓名升序
向集合中添加 6 个学生
输出最终排序结果
要求使用 Comparator 实现排序规则。*/
public class Test03 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() == o2.getScore()) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o2.getScore() - o1.getScore();
            }
        });
        set.add(new Student(1,"张三",85));
        set.add(new Student(2,"李四",92));
        set.add(new Student(3,"王五",85));
        set.add(new Student(4,"赵六",78));
        set.add(new Student(5,"小明",92));
        set.add(new Student(6,"小红",88));

        for (Student s:set){
            System.out.println(s);
        }


    }
}
