package ua.training.entities;

import ua.training.annotation.Rudiment;

public class Queue extends Enumerable {
    public Queue(int maxSize) {
        super(maxSize);
    }

    private int putIndex = 0;
    private int getIndex = 0;

    public void put(Integer integer) throws Exception {
        if (putIndex >= array.length) {
            throw new Exception("queue");
        }
        array[putIndex++] = integer;
    }

    public Integer get() throws Exception {
        if (getIndex <= 0) {
            throw new Exception("queue is empty");
        }
        return array[getIndex--];
    }
    @Rudiment
    public int getMaxSize(){
        return array.length;
    }
}
