package ua.training.entities;

public abstract class Enumerable {
    protected Integer[] array;

    Enumerable(int maxSize) {
        array = new Integer[maxSize];
    }

    public abstract void put(Integer integer) throws Exception;

    public abstract Integer get() throws Exception;
}
