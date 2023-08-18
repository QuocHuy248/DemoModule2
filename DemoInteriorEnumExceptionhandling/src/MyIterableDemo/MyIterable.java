package MyIterableDemo;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyIterable implements Iterable<Integer>{
    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }
    public MyIterable(int[] elements) {
        this.elements = elements;
    }
    private int[] elements;
    private class MyIterator implements Iterator<Integer> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < elements.length;
        }

        @Override
        public Integer next() {
            return elements[currentIndex++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        MyIterable iterable = new MyIterable(arr);

        for (int element : iterable) {
            System.out.println(element);
        }
    }
}

