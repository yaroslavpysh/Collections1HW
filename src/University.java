import java.util.ArrayList;

public class University {

    private String nameOfUniversity;
    private double rating;
    private ArrayList<Student> listOfStudents;

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public University(String nameOfUniversity, double rating, ArrayList<Student> listOfStudents) {
        this.nameOfUniversity = nameOfUniversity;
        this.rating = rating;
        this.listOfStudents = listOfStudents;
    }


}
