package ua.trining;

import javax.naming.OperationNotSupportedException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MyCollection<T> extends ArrayList<T> {
    @Override
    public T remove(int i){
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    protected void removeRange(int i, int i1) {
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super T> predicate) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<T> unaryOperator) {

    }
}
