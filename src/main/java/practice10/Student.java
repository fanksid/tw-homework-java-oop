package practice10;

public class Student extends Person{
    // 实际意义是class(班级)，但由于class是关键字，所以写成klass
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String sIntroduce = super.introduce() + " I am a Student.";
        if (equals(klass.getLeader())) {
            sIntroduce += String.format(" I am Leader of Class %d.", klass.getNumber());
        } else {
            sIntroduce += String.format(" I am at Class %d.", klass.getNumber());
        }
        return  sIntroduce;
    }

}
