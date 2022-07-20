import java.lang.instrument.ClassDefinition;
import java.util.ArrayList;

public class Student {
    private int age;
    private String name;
     private ArrayList<Integer> grades;


    public Student(int age, String name, ArrayList<Integer> grades) {
        this.age = age;
        this.name = name;
        this.grades = grades;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
//    public int avMarks(ArrayList<Class> arrayList){
//        for(Class a: arrayList)
//        for (Integer marks: Student.this.grades){
//            r += marks;
//        }return r;

    }






