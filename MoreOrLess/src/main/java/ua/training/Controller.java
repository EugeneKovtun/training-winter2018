import java.util.Scanner;

/**
 * Created by eugene on 23.07.17.
 */
public class Controller {
    Model model;
    View view;
    public Controller(Model model,View view) {
        this.model = model;
        this.view = view;
    }
    public void processUser(){
        model.setMinBarrier(GlobalConstants.MIN_PERMANENT_VALUE);
        model.setMaxBarrier(GlobalConstants.MAX_PERMANENT_VALUE);
        model.setRandomSecretValue();
        //view.printMessage(""+model.getSecretValue());
        do {
            view.printMessage(view.getModelInfo(model));
        }while (model.compareSecretValueToUserValue(inputUserValue())!=0);
        view.printMessage(view.congratulations(model));

    }
    private int inputUserValue(){
        view.printMessage(View.INPUT_YOUR_VALUE);
        int userValue = inputIntegerWithScanner();
        while (userValue<=model.getMinBarrier()||userValue>=model.getMaxBarrier()){
            view.printMessage(view.OUT_OF_RANGE);
            view.printMessage(view.getModelInfo(model));
            userValue = inputIntegerWithScanner();
        }
        return userValue;
    }

    private int inputIntegerWithScanner(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            view.printMessage(view.sumString(View.WRONG_INPUT,View.INPUT_INTEGER));
            scanner.next();
        }
        return scanner.nextInt();
    }
}
