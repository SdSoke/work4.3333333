import java.util.*;

/**
 * Created by admin on 2016/11/4.
 */
public class Bag<E>implements Collection<E> {
    private List<E> holder = new ArrayList<E>();



    @Override
    public int size() {
        return holder.size();
    }

    @Override
    public boolean isEmpty() {
        return holder.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return holder.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return holder.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return holder.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return holder.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {

        return holder.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return holder.retainAll(c);
    }

    @Override
    public void clear() {
        holder.clear();
    }

    @Override
    public String toString() {
        Collections.shuffle(holder);
        return holder.toString();
    }}
