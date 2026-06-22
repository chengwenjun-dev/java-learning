package 集合练习.Map集合;

import java.util.HashMap;
import java.util.Map;

/*
* 使用Map集合存储学生姓名和成绩：

张三 85
李四 92
王五 78
赵六 88
完成以下功能：

添加一名新学生及成绩
修改指定学生成绩
查询指定学生成绩
删除指定学生信息
遍历输出所有学生信息
统计班级平均分*/
public class Test01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三",85);
        map.put("李四",92);
        map.put("王五",78);
        map.put("赵六",88);

        //添加
        map.put("田七",45);
         //修改
        map.put("赵六",89);
        Integer i = map.get("张三");
        System.out.println(i);
        map.remove("田七");
        int sum=0;
        for (Map.Entry<String, Integer> entry:map.entrySet()){
            entry.getKey();
            entry.getValue();
            sum+= entry.getValue();
        }
        double avg=sum/map.size();

    }
}
