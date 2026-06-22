package 集合练习.set集合;

import java.util.*;

/*给定一个字符串数组：

{"java","python","java","go","python","c++","go","java","rust"}
完成以下要求：

使用 LinkedHashSet 去除重复元素
统计 每个单词出现的次数
按照 出现次数从高到低排序
输出结果*/
public class Test01 {
    public static void main(String[] args) {
        String[]arr= {"java","python","java","go","python","c++","go","java","rust"};
        //set集合自动去重
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));

        // 统计每个单词出现的次数
        Map<String,Integer> map = new HashMap<>();
        for (String word:set){
            int count=0;
            for (String s:arr){
                if (word.equals(s)){
                    count++;
                }
            }
            map.put(word,count);
        }
        //按出现次数从高到低排序
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());//lambda 降序**

        //循环遍历map集合

        for (Map.Entry<String,Integer> entry:list){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }


    }
    }


