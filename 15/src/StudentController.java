public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController() {
        model = new MVCPatternDemo().retriveStudentFromDatabase();
        view = new StudentView();
    }
    public void setStudentNumber(String number){
        model.setRollNumber(number);
    }
    public String getStudentNumber(){
        return model.getRollNumber();
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNumber());
    }
}
