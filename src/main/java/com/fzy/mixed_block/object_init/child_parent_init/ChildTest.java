package com.fzy.mixed_block.object_init.child_parent_init;

/**
 * 父类和子类初始化顺序
 *
 * 注 ：1.没有继承
 *
 *            静态变量->静态初始化块->变量->变量初始化块->构造方法
 *
 *     2.有继承的情况
 *
 *         父类静态变量->父类静态初始化块->子类静态变量->子类静态变量初始化块->父类变量初始化->父类变量初始化块->父类构造方法
 *         ->子类变量初始化->子类变量初始化块->子类构造方法
 *
 *
 *     变量初始化过程参见 varable_init包
 *
 * Created by fuzhongyu on 2017/3/29.
 */
public class ChildTest extends ParentTest{

    {
        c3="子类--变量2";
    }

    // 静态变量
    public static String c1 = "子类--静态变量";
    // 变量
    public String c2 = "子类--变量";

    public String c3;
    // 静态初始化块
    static {
        System.out.println(c1);
        System.out.println("子类--静态初始化块");
    }
    // 初始化块
    {
        System.out.println(c2);
        System.out.println("子类--初始化块");
    }

    // 构造器
    public ChildTest() {
        System.out.println(c3);
        System.out.println("子类--构造器");
    }

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        new ChildTest();
    }
}