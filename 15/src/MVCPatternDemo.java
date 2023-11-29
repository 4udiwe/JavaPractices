public class MVCPatternDemo {
    public Student retriveStudentFromDatabase(){
        Student student  = new Student();
        student.setName("Arsenii");
        student.setRollNumber("001");
        return student;
    }

    public static void main(String[] args) {
        StudentController student = new StudentController();
        student.updateView();

        student.setStudentNumber("100");
        student.setStudentName("Another name");
        student.updateView();

    }
}
