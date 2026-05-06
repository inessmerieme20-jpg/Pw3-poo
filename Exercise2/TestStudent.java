class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public boolean isPassed() {
        return grade >= 10;
    }

    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student("Sara", 20, 12);

        System.out.println(s);
        System.out.println("Passed: " + s.isPassed());
    }
}
