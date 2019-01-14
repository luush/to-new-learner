package org.lszjaf.entry.objects.testObjects;

import org.lszjaf.entry.objects.Father;
import org.lszjaf.entry.objects.People;
import org.lszjaf.entry.objects.Son;

/**
 * 1.无论哪种方式创建对象，都会默认调用父类的无参构造方法(test1-9)
 */
public class SonFatherTest {
    /**
     * 输出结果：
     */
    public static void main(String[] luush) {
        test1();
    }

    public static void test9(){
        Son son = new Son("luush",19);
        System.out.println(((Son) son).name);
        System.out.println(((Son) son).age);
        /**
         * 输出结果：
         * ---------create People----------
         * ---------create Son----------luush19
         * luush
         * 19
         */
    }

    public static void test8(){
        Son son = new Son("i am working");
        System.out.println(((Son) son).study);
        /**
         * 输出结果：
         * ---------create People----------
         * ---------create Son----------i am working
         * i am working
         */
    }

    public static void test7(){
        People son = new Son("luush",19);
        System.out.println(((Son) son).name);
        System.out.println(((Son) son).age);
        /**
         * 输出结果：
         * ---------create People----------
         * ---------create Son----------luush19
         * luush
         * 19
         */
    }

    public static void test6(){
        People son = new Son("i am working");
        System.out.println(((Son) son).study);
        /**
         * 输出结果：
         * ---------create People----------
         * ---------create Son----------i am working
         * i am working
         */
    }


    public static void test5(){
        People people = new People();
        /**
         * 输出结果：
         * ---------create People----------
         */
    }

    public static void test4(){
        People father = new Father();
        /**
         * 输出结果：
         *  ---------create People----------
         * ---------create Father----------
         */
    }

    public static void test3(){
        Father father = new Father();
        /**
         * 输出结果：
         *  ---------create People----------
         * ---------create Father----------
         */
    }

    public static void test2() {
        /**
         * People son
         * 等号前面的这个内容，尤其是People这个引用，决定了son这个对象可以调用什么属性，
         * 什么方法!
         * new Son()
         * 等号后面的这个内容，决定了son这个对象，要执行那个属性，具体那个方法！
         */
        People son = new Son();

        /**
         * 输出结果：
         *  ---------create People----------
         * ---------create Son----------
         */
        son.say("hello");//Son和父类People都有的方法，这种情况，看引用
        son.sleep(12);//父类People独有的方法，子类Son没有，那么就执行父类People的方法！

        ((Son) son).study();
        /**
         * son这个对象，不能直接调用study()这个方法，因为People没有这个方法！
         * 要想调用，就必须强制转换成Son这个引用！（并不是任意的对象都可以强制转换，
         * 他们之间必须有直接或者间接的关系！比如Son extends People）
         */
    }
    public static void test1() {
        Son son = new Son();
        /**
         * 输出结果：
         *  ---------create People----------
         * ---------create Son----------
         */

        son.say("hello");//Son和父类People都有的方法，这种情况，具体执行Son的还是People的，看new后面是谁就执行谁的
        son.sleep(12);//父类People独有的方法
        /**
         * 输出结果：
         *  Son-say&&&&****** hello
         * people-sleep12
         */
    }

}
