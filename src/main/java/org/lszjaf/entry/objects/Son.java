package org.lszjaf.entry.objects;

public class Son extends People {
    public String study;

    public Son() {
        System.out.println("---------create Son----------");
    }

    public Son(String study) {
        System.out.println("---------create Son----------" + study);
        this.study = study;
    }

    public Son(String study, String name) {
        this.study = study;
        this.name = name;//这是从父类继承的属性
        System.out.println("---------create Son----------" + name + study);
    }

    public Son(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("---------create Son----------" + name + age);
    }

    //自己独有的方法
    public void study() {
        System.out.println("Son-study");
    }

    //自己独有的方法
    public void sing() {
        System.out.println("Son-sing");
    }

    @Override//重写了父类的方法
    public String say(String words) {
        System.out.println("Son-say&&&&****** " + words);
        return words;
    }
}
