package ua.training.entities;

import ua.training.annotation.Rudiment;

public class Stack extends Enumerable {
    public Stack(int maxSize) {
        super(maxSize);
    }

    private int counter = 0;

    public void put(Integer integer) throws Exception {
        if (counter>=array.length){
            throw new Exception("stack overflow");
        }
        array[counter]= integer;
        counter++;
    }

    public Integer get() throws Exception {
        if (counter <= 0) {
            throw new Exception("empty stack");
        }
        int element = array[counter - 1];
        counter--;
        return element;
    }
    @Rudiment
    public int getMaxSize(){
        return array.length;
    }
}
