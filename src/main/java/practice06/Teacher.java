package practice06;

public class Teacher extends Person{
    // 实际意义是class(班级)，但由于class是关键字，所以写成klass
    private Integer klass = null;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String sIntroduce = super.introduce() + " I am a Teacher.";
        if (klass == null) {
            sIntroduce += " I teach No Class.";
        } else {
            sIntroduce += String.format(" I teach Class %d.", klass);
        }
        return sIntroduce;
    }
}
