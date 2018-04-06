package practice04;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String introduce() {
        return basicIntroduce();
    }

    // 这个方法的设置就是给子类调用的，所以忽视IDEA的黄色提示
    protected String basicIntroduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }
}
