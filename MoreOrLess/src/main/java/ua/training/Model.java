import java.util.ArrayList;
import java.util.Random;

/**
 * Created by eugene on 23.07.17.
 */
public class Model {
    private int secretValue;
    private int minBarrier;
    private int maxBarrier;
    private ArrayList<Integer> usersWay = new ArrayList<>();
    //TODO write normal Random
    public void setRandomSecretValue() {
        secretValue = (int)Math.ceil(Math.random()*
                (maxBarrier - minBarrier - 1) + minBarrier);
    }

    public int compareSecretValueToUserValue(int userValue){
        usersWay.add(userValue);
        int compare = Integer.compare(secretValue,userValue);
        if (compare == 1){
            setMinBarrier(userValue);
        }
        if (compare == -1){
            setMaxBarrier(userValue);
        }
        return compare;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public void setMaxBarrier(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }

    public ArrayList<Integer> getUsersWay() {
        return usersWay;
    }

    public int getSecretValue() {
        return secretValue;
    }
}

