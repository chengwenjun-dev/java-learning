# String、StringBuilder

## String
### String特点：
-   字符串不可变，它们的值在创建后不能被改变

### 常用方法：
-   equals(被比较的字符串对象）
- 遍历字符串：
  - charAt(index)  根据索引获取字符
  - length()   获取长度
  - toCharArray()  把字符串转字符数组
- 字符串截取：
  - subSTring(起始索引)   从起始索引截取到末尾
  - subSTring(起始索引,结束索引)   从起始索引(含)截取到结束索引(不含);
- 字符串替换：replace(旧的内容,新的内容)
- 字符串切分 ：split()
- 其他方法：
  ![其他方法](imgs\img.png)


## StringBuilder

### 特点：
- 一个内容可以发生改变字符串对象。

#### 作用：
- 专门用于大量的字符串拼接或修改操作

#### 方法：
- `public StringBuilder append(任意类型)`;添加数据，并返回对象本身
- `public StringBuilder reverse()`返回相反的字符序列
- `public int length()`返回字符长度
- `public String toString()`StringBuilder和转换为String


***** StringBuilder 和 String的区别:String 内容不可变；StringBuilder内容可变。


 