package practice10;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        return number == ((Klass)obj).number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student) {
        if (!isIn(student)) {
            System.out.println("It is not one of us.");
            return;
        }
        leader = student;
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    @Override
    public String toString() {
        return getNumber() + "";
    }

    public boolean isIn(Student student) {
        return equals(student.getKlass());
    }
}
