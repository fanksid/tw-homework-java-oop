package practice09;

public class Teacher extends Person{
    // 实际意义是class(班级)，但由于class是关键字，所以写成klass
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String sIntroduce = basicIntroduce();
        if (klass == null) {
            sIntroduce += " I teach No Class.";
        } else {
            sIntroduce += String.format(" I teach Class %d.", klass.getNumber());
        }
        return sIntroduce;
    }

    private String basicIntroduce() {
        return super.introduce() + " I am a Teacher.";
    }


    public String introduceWith(Student student) {
        String sIntroduce = basicIntroduce();
        if (student.getKlass().equals(klass)) {
            sIntroduce += String.format(" I teach %s.", student.getName());
        } else {
            sIntroduce += String.format(" I don't teach %s.", student.getName());
        }
        return sIntroduce;
    }
}
