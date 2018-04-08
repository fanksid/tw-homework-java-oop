package practice10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

public class Teacher extends Person{
    private Set<Klass> classes = null;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    @Override
    public String introduce() {
        String sIntroduce = basicIntroduce();
        if (classes == null || classes.size() == 0) {
            sIntroduce += " I teach No Class.";
        } else {
            StringBuilder sb = new StringBuilder();
            Object[] arr = classes.toArray();

            Arrays.sort(arr, (first, second) -> ((Klass)first).getNumber() - ((Klass)second).getNumber());
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append((Klass) arr[i]);
            }
            sIntroduce += " I teach Class " + sb.toString() + ".";
        }
        return sIntroduce;
    }

    private String basicIntroduce() {
        return super.introduce() + " I am a Teacher.";
    }


    public String introduceWith(Student student) {
        String sIntroduce = basicIntroduce();
        if (isTeaching(student)) {
            sIntroduce += String.format(" I teach %s.", student.getName());
        } else {
            sIntroduce += String.format(" I don't teach %s.", student.getName());
        }
        return sIntroduce;
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }
}
