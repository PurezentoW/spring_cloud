package top.xx.temp;

import java.util.Iterator;

public class Person implements Iterable<Person>{
    private Object Person;

    @Override
    public Iterator<Person> iterator() {
        return new Iterator<top.xx.temp.Person>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public top.xx.temp.Person next() {
                return null;
            }
        };
    }
}
