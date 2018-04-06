package practice04;

public class Student extends Person{
    // 实际意义是class(班级)，但由于class是关键字，所以写成klass
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return basicIntroduce() + String.format(" I am a Student. I am at Class %d.", klass);
    }
}

