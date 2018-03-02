import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by eugene on 23.07.17.
 */
public class View {
    public static final String ENTER = "\n";
    public static final String WRONG_INPUT = "Wrong Input!";
    public static final String INPUT_INTEGER = "Input integer value";
    public static final String OUT_OF_RANGE = "Your value out of range ";
    public static final String OPENING_BRACKET = "(";
    public static final String CLOSING_BRACKET = ")";
    public static final String COMMA = ",";
    public static final String INPUT_YOUR_VALUE= "Input your value";
    public static final String CONGRATULATIONS = "Congratulations, you win!";
    public static final String YOUR_WAY = "Your way is";
    public void printMessage(String message) {
        System.out.println(message);
    }

    public String sumString(String... strings) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String string :
                strings) {
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    public String getModelInfo(Model model) {
        return sumString(OPENING_BRACKET,model.getMinBarrier()+"",
                COMMA+model.getMaxBarrier()+""+CLOSING_BRACKET);
    }
    public String congratulations(Model model){
        return sumString(CONGRATULATIONS,ENTER,YOUR_WAY,ENTER,Arrays.toString(model.getUsersWay().toArray()));
    }
}
