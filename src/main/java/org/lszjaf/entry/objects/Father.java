package org.lszjaf.entry.objects;

public class Father extends People {
    private String work;

    public Father() {
        System.out.println("---------create Father----------");
    }

    public Father(String work) {
        this.work = work;
        System.out.println("---------create Father----------" + work);
    }

    public Father(String work, int age) {
        this.work = work;
        this.age = age;//虽然自己没有写着name属性，但是可以从父类继承这个属性
        System.out.println("---------create Father----------" + work + age);
    }
    public Father(int age) {
        this.age = age;
        System.out.println("---------create Father----------" + age);
    }


    //自己独有的方法
    public void work() {
        System.out.println("Father-work");
    }

    //自己独有的方法
    public void makeMoney() {
        System.out.println("Father-makeMoney");
    }

    @Override//重写了父类的方法
    public void runSteps(int steps) {
        System.out.println("Father-runSteps-----" + steps);
    }
}
