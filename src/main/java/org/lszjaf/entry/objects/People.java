package org.lszjaf.entry.objects;

public class People {
    public String name;
    public int age;
    public String address;
    private int secret;//private 修饰的只能自己使用！不会传递给子类，子类也不能调用！

    public People() {
        System.out.println("---------create People----------");
    }

    public People(int age) {
        this.age = age;
        System.out.println("---------create People----------" + age);
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("---------create People----------" + name + age);
    }

    public String say(String words) {
        System.out.println("people-say");
        return words;
    }

    public void runSteps(int steps) {
        System.out.println("people-runSteps" + steps);
    }

    public void sleep(int hours) {
        System.out.println("people-sleep" + hours);
    }
}
