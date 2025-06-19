public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("S123", "Vamshi", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Vamshi Boralkar");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
