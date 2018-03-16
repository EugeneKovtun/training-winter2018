package ua.training;

import ua.training.annotation.Rudiment;
import ua.training.entities.Enumerable;
import ua.training.entities.Queue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Enumerable queue = new Queue(30);
        System.out.println(queue.getClass());
        System.out.println(queue.getClass().getSuperclass());
        Arrays.stream(queue.getClass().getMethods()).map((s) -> s.getName() + " "
                + Arrays.toString(s.getParameterTypes())
                + " " + s.getModifiers())
                .forEach(System.out::println);

        for (Method method : queue.getClass().getMethods()) {
            if (method.isAnnotationPresent(Rudiment.class))
                System.out.println(method.invoke(queue));
        }
    }
}
