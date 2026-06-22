package 集合练习.set集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
* 给定一个整数数组：

int[] arr = {5,3,8,3,9,1,5,7,9,2,8,6};
完成以下要求：

使用 Set 去除重复元素
将数据转换为数组
使用 Arrays.sort() 排序
找出 最大值、最小值
输出排序后的数组*/
public class Test04 {
    public static void main(String[] args) {
        int[] arr = {5,3,8,3,9,1,5,7,9,2,8,6};

        HashSet<Integer> set = new HashSet<>();
        for (int num:arr){
            set.add(num);
        }
        Integer[] result = set.toArray( new Integer[0]);

        Arrays.sort(result);
        System.out.println("排序结果:"+Arrays.toString(result));//升序排序
        int max=result[result.length-1];
        int min=result[0];
        System.out.println("最大值:"+max);
        System.out.println("最小值:"+min);
    }
}
