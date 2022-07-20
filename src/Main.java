import java.util.ArrayList;

public class Main {
    static double rait;


    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Integer> grades1 = new ArrayList<>();
        ArrayList<Integer> grades2 = new ArrayList<>();
        grades.add(2);
        grades.add(4);
        grades.add(4);
        grades1.add(5);
        grades1.add(4);
        grades1.add(5);
        grades2.add(4);
        grades2.add(3);
        grades2.add(4);

        Student student1 = new Student(18,"Alex",grades);
        Student student2 = new Student(19, "Roma", grades1);
        Student student3 = new Student(20, "Lena", grades2);
        ArrayList<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(student1);
        listOfStudent.add(student2);
        listOfStudent.add(student3);

        for (Student a : listOfStudent) {
            for (Integer b : a.getGrades()) {
//                System.out.println(b);
                rait += b;

            }
        }

        double rating = (rait / listOfStudent.size());
        University univer1 = new University("Bgu", rating, listOfStudent);
        System.out.println("Рейтинг универа = " + univer1.getRating());
    }
}