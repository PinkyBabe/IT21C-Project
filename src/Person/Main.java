package Person;

public class Main{
    public static void main(String[] args) {
        Student student = new Student("Dwight Navarro", 2003, "Bachelor of Science in Chemistry");

        System.out.println("Student Info: \n\n" + student);
        System.out.println("Student Major: " + student.getMajor()+"\n");

        Instructor instructor = new Instructor("Ricardo Dalisay", 1990, 50000);

        System.out.println("Instructor Info:\n\n" + instructor);
        System.out.println("Instructor Salary: " + instructor.getSalary());
    }
}