import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparable<Student1> {
    int marks;
    int age;
    String name;

    public Student1(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " " + marks + "-" + age + "_" + name;
    }

    @Override
    public int compareTo(Student1 other) {
        // Comparing based on age
        return Integer.compare(this.age, other.age);
    }
}

class ComparableEx {
    public static void main(String[] args) {
        Student1 st1 = new Student1(46, 18, "Rohan");
        Student1 st2 = new Student1(46, 17, "Rohit");
        Student1 st3 = new Student1(44, 19, "Mehu");

        List<Student1> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println("Before Sorting: " + list);

        // Sorting using Comparable (by age)
        Collections.sort(list);
        System.out.println("After Sorting by age: " + list);

        // Sorting using Comparator (by marks)
        Comparator<Student1> com = (Student1 a, Student1 b) -> {
            return Integer.compare(a.getMarks(), b.getMarks());
        };
        Collections.sort(list, com);
        System.out.println("After Sorting by marks: " + list);
    }
}
