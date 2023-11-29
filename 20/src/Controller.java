public class Controller {
    private final Model model;
    private final View view;
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    public double RunCalc(String input){
        return model.evaluateRPN(input);
    }
}